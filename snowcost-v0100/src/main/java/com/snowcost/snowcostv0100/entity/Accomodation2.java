package com.snowcost.snowcostv0100.entity;

import javax.persistence.*;

@Entity
public class Accomodation2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int priceAccomodation;
    private int priceSkiTicket;
    private int costFuel;
    private int costSkiRent;
    private int costInsurance;
    private int spendingMoney;
    private int otherCost;

    public Accomodation2() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPriceAccomodation() {
        return priceAccomodation;
    }

    public void setPriceAccomodation(int priceAccomodation) {
        this.priceAccomodation = priceAccomodation;
    }

    public int getPriceSkiTicket() {
        return priceSkiTicket;
    }

    public void setPriceSkiTicket(int priceSkiTicket) {
        this.priceSkiTicket = priceSkiTicket;
    }

    public int getCostFuel() {
        return costFuel;
    }

    public void setCostFuel(int costFuel) {
        this.costFuel = costFuel;
    }

    public int getCostSkiRent() {
        return costSkiRent;
    }

    public void setCostSkiRent(int costSkiRent) {
        this.costSkiRent = costSkiRent;
    }

    public int getCostInsurance() {
        return costInsurance;
    }

    public void setCostInsurance(int costInsurance) {
        this.costInsurance = costInsurance;
    }

    public int getSpendingMoney() {
        return spendingMoney;
    }

    public void setSpendingMoney(int spendingMoney) {
        this.spendingMoney = spendingMoney;
    }

    public int getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(int otherCost) {
        this.otherCost = otherCost;
    }
}
