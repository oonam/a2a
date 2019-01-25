package com.snowcost.snowcostv0100.service;

import com.snowcost.snowcostv0100.entity.Accomodation2;

public interface Accomodation2Service {

  void addAccomodation(Accomodation2 accomodation);
  Accomodation2 getAccomodationById(Long id);
  int sumPrices(Long id);
}
