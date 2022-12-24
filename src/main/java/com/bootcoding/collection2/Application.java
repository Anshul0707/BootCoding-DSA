package com.bootcoding.collection2;

import java.util.ArrayList;
import java.util.Arrays;

public class Application
{
    public static void main(String[] args)
    {
        Detail detail1 = new Detail("Desc 1", 343, 3734, 40000);
        Detail detail2 = new Detail("Desc 2", 3232, 245, 55900);

        Income income = new Income();
        ArrayList<Detail> details = new ArrayList<>();
        details.add(detail1);
        details.add(detail2);

        income.setDetails(details);

        Person person = new Person(1, "28 April", income);

        System.out.println(person.id + person.currentDate + person.getIncome().getDetails().get(0).description);

    }
}
