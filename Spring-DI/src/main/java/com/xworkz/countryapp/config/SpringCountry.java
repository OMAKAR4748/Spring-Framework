package com.xworkz.countryapp.config;

import com.xworkz.countryapp.beans.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.countryapp")
public class SpringCountry {

    @Bean
    public String getString(){
        String s = "Omkar";
        return s;
    }


    @Bean
    public Integer getInteger(){
        Integer integer = 47;
        return integer;
    }

    @Bean
    public long getLong(){
        Long l = 8784124787874L;
        return l;
    }
    @Bean
    public double getdouble(){
        Double d = 78754.2;
        return d;
    }
    @Bean
    public Byte getByte(){
        Byte b = 77;
        return b;
    }
    @Bean
    public boolean getBoolean(){
        Boolean b = true;
        return b;
    }
    @Bean
    public short getShort(){
        Short s = 7;
        return s;
    }
    @Bean
    public char getChar(){
        Character c ='A';
        return c;
    }
    @Bean
    public float getFloat(){
        Float f = 20.0f;
        return f;
    }

    @Bean("getIntegerValues")
    List<Integer> getIntegerValues(){
        List<Integer> integers = new ArrayList<>();
        return integers;
    }


    @Bean("getCountryList")
    public List<String> getCountry() {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("Russia");
        return list;
    }

}
