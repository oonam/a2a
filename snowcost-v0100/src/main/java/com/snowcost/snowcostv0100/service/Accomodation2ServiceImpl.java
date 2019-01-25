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
    return getAccomodationById(id).getPriceAccomodation() +
            getAccomodationById(id).getPriceSkiTicket() +
            getAccomodationById(id).getCostFuel() +
            getAccomodationById(id).getCostSkiRent() +
            getAccomodationById(id).getCostInsurance() +
            getAccomodationById(id).getSpendingMoney() +
            getAccomodationById(id).getOtherCost()
            ;
  }
}
