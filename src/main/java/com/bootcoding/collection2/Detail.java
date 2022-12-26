package com.bootcoding.collection2;

public class Detail
{
    public String description;
    public int units;
    public int rate;
    public int amount;

    public Detail(String description, int units, int rate, int amount) {
        this.description = description;
        this.units = units;
        this.rate = rate;
        this.amount = amount;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
