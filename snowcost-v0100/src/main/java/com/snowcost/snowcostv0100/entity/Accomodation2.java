package com.snowcost.snowcostv0100.entity;

import javax.persistence.*;

@Entity
public class Accomodation2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int priceAccomodation;
    private int headAccomodation;
    private int nightAccomodation;

    private int priceSkiTicket;
    private int headSkiTicket;

    private double distanceFuel;
    private double consumptionFuel;
    private double priceFuel;

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

    public int getHeadAccomodation() {
        return headAccomodation;
    }

    public void setHeadAccomodation(int headAccomodation) {
        this.headAccomodation = headAccomodation;
    }

    public int getNightAccomodation() {
        return nightAccomodation;
    }

    public void setNightAccomodation(int nightAccomodation) {
        this.nightAccomodation = nightAccomodation;
    }

    public int getPriceSkiTicket() {
        return priceSkiTicket;
    }

    public void setPriceSkiTicket(int priceSkiTicket) {
        this.priceSkiTicket = priceSkiTicket;
    }

    public int getHeadSkiTicket() {
        return headSkiTicket;
    }

    public void setHeadSkiTicket(int headSkiTicket) {
        this.headSkiTicket = headSkiTicket;
    }

    public double getDistanceFuel() {
        return distanceFuel;
    }

    public void setDistanceFuel(double distanceFuel) {
        this.distanceFuel = distanceFuel;
    }

    public double getConsumptionFuel() {
        return consumptionFuel;
    }

    public void setConsumptionFuel(double consumptionFuel) {
        this.consumptionFuel = consumptionFuel;
    }

    public double getPriceFuel() {
        return priceFuel;
    }

    public void setPriceFuel(double priceFuel) {
        this.priceFuel = priceFuel;
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
