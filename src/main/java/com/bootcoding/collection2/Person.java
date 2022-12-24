package com.bootcoding.collection2;

public class Person
{
    public int id;
    public String currentDate;
    public Income income;
    public Deduction deduction;

    public Person(int id, String currentDate, Income income) {
        this.id = id;
        this.currentDate = currentDate;
        this.income = income;
        //this.deduction = deduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Deduction getDeduction() {
        return deduction;
    }

    public void setDeduction(Deduction deduction) {
        this.deduction = deduction;
    }
}
