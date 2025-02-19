package com.xworkz.countryapp;

import com.xworkz.countryapp.beans.*;
import com.xworkz.countryapp.config.SpringCountry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCountry.class);
        Country country = applicationContext.getBean(Country.class);
        System.out.println(country);

        System.out.println("====================================================================================");

        Patient patient = applicationContext.getBean(Patient.class);
        System.out.println(patient);

        System.out.println("====================================================================================");

        Mobile mobile = applicationContext.getBean(Mobile.class);
        System.out.println(mobile);

        System.out.println("====================================================================================");

        Laptop laptop = applicationContext.getBean(Laptop.class);
        System.out.println(laptop);

        System.out.println("====================================================================================");

        House house = applicationContext.getBean(House.class);
        System.out.println(house);

        System.out.println("====================================================================================");

        Theatre theatre = applicationContext.getBean(Theatre.class);
        System.out.println(theatre);

        System.out.println("====================================================================================");

        TV tv = applicationContext.getBean(TV.class);
        System.out.println(tv);

        System.out.println("====================================================================================");

        Library library = applicationContext.getBean(Library.class);
        System.out.println(library);

        System.out.println("====================================================================================");

        Dish dish = applicationContext.getBean(Dish.class);
        System.out.println(dish);

        System.out.println("====================================================================================");

        Husband husband = applicationContext.getBean(Husband.class);
        System.out.println(husband);



        String string = applicationContext.getBean(String.class);
        System.out.println(string);

        Integer integer = applicationContext.getBean(Integer.class);
        System.out.println(integer);

        Long l = applicationContext.getBean(Long.class);
        System.out.println(l);

        Double d = applicationContext.getBean(Double.class);
        System.out.println(d);

        Byte b = applicationContext.getBean(Byte.class);
        System.out.println(b);

        Short s = applicationContext.getBean(Short.class);
        System.out.println(s);

        Character character = applicationContext.getBean(Character.class);
        System.out.println(character);

        Boolean b1 = applicationContext.getBean(Boolean.class);
        System.out.println(b1);

        Float f = applicationContext.getBean(Float.class);
        System.out.println(f);



        List<Integer> integers = applicationContext.getBean("getIntegerValues",List.class);
        integers.add(47);
        integers.add(78);
        integers.add(32);
        integers.add(2);
        System.out.println(integers);

        List<String> strings = applicationContext.getBean("getCountryList",List.class);
        System.out.println(strings);
 }
}
