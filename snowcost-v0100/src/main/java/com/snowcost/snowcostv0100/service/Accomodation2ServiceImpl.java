package com.snowcost.snowcostv0100.service;

import com.snowcost.snowcostv0100.entity.Accomodation2;
import com.snowcost.snowcostv0100.repository.Accomodation2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Accomodation2ServiceImpl implements Accomodation2Service {

  Accomodation2Repository repository;

  @Autowired
  public Accomodation2ServiceImpl(Accomodation2Repository repository) {
    this.repository = repository;
  }

  @Override
  public void addAccomodation(Accomodation2 accomodation) {
    repository.save(accomodation);
  }

  @Override
  public Accomodation2 getAccomodationById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public int sumPrices(Long id) {
    return multiplyAccomodationCosts(id) +
            multiplySkiTicket(id) +
            (int) fuelCalculator(id) +
            getAccomodationById(id).getCostSkiRent() +
            getAccomodationById(id).getCostInsurance() +
            getAccomodationById(id).getSpendingMoney() +
            getAccomodationById(id).getOtherCost()
            ;
  }

  @Override
  public int multiplyAccomodationCosts(Long id) {
    return getAccomodationById(id).getPriceAccomodation() *
            getAccomodationById(id).getHeadAccomodation() *
            getAccomodationById(id).getNightAccomodation()
            ;
  }

  @Override
  public int multiplySkiTicket(Long id) {
      return getAccomodationById(id).getPriceSkiTicket() *
              getAccomodationById(id).getHeadSkiTicket()
              ;
  }

  @Override
  public double fuelCalculator(Long id) {
      return (getAccomodationById(id).getDistanceFuel() / 100) *
              getAccomodationById(id).getConsumptionFuel() *
              getAccomodationById(id).getPriceFuel()
              ;
  }
}
