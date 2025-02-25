package com.xworkz.core;

import com.xworkz.core.beans.*;
import com.xworkz.core.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Stand stand = applicationContext.getBean(Stand.class);
//        stand.setId(1);
//        stand.setBrandName("MC Stand");
//        stand.setPrice(3000);
        System.out.println(stand);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Laptop laptop = applicationContext.getBean(Laptop.class);
//        laptop.setName("Lenovo");
//        laptop.setBrand("Windows");
//        laptop.setColor("gray");
//        laptop.setProcessor("RYZEN 7000 series");
//        laptop.setStorage(512);
//        laptop.setRam(8);
        System.out.println(laptop);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
////        restaurant.setId(1);
//        restaurant.setName("Sham");
//        restaurant.setC_no(77445774457l);
//        restaurant.setLocation("Bashyam Circle");
//        restaurant.setRating(4.5);
//        restaurant.setType("veg");
        System.out.println(restaurant);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Pg pg = applicationContext.getBean(Pg.class);
//        pg.setId(1);
//        pg.setName("Srinivas PG");
//        pg.setPhone(77158712157l);
//        pg.setRoom_type("Single room");
        System.out.println(pg);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Car car = applicationContext.getBean(Car.class);
//       car.setEngineType("Petrol");
//       car.setTransmission("Automatic");
//       car.setFuelEfficiency(15.5);
//       car.setSafetyFeatures("Airbags");
       System.out.println(car);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Fan fan = applicationContext.getBean(Fan.class);
//       fan.setBrand("USHA");
//       fan.setType("Ceiling");
//       fan.setSpeedSettings(6);
//       fan.setCurrentSpeed(5);
       System.out.println(fan);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Chair chair = applicationContext.getBean(Chair.class);
//       chair.setMaterial("Wood");
//       chair.setColor("Brown");
//       chair.setHeight(100.0);
//       chair.setOccupied(true);
       System.out.println(chair);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Bus bus = applicationContext.getBean(Bus.class);
//       bus.setRouteNumber("230A");
//       bus.setCapacity(80);
//       bus.setCurrentPassengers(30);
//       bus.setOperational(true);
       System.out.println(bus);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Mobile mobile = applicationContext.getBean(Mobile.class);
//       mobile.setBrand("Redmi");
//       mobile.setModel("Xiamo");
//       mobile.setBatteryLife(85);
//       mobile.setPoweredOn(true);
       System.out.println(mobile);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Bag bag = applicationContext.getBean(Bag.class);
//       bag.setBrand("SkyBag");
//       bag.setCapacity(30);
//       bag.setColor("black");
//       bag.setOpen(true);
       System.out.println(bag);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Charger charger = applicationContext.getBean(Charger.class);
//       charger.setBrand("Samsung");
//       charger.setConnected(true);
//       charger.setType("USB-C");
//       charger.setOutputPower(25.0);
       System.out.println(charger);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        TV tv = applicationContext.getBean(TV.class);
//       tv.setBrand("Sumsang");
//       tv.setResolution("4K");
//       tv.setCurrentChannel(300);
//       tv.setScreenSize(55.0);
//       tv.setOn(true);
//       tv.setVolumeLevel(60);
       System.out.println(tv);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Fridge fridge = applicationContext.getBean(Fridge.class);
//        fridge.setBrand("LG");
//        fridge.setCapacity(250);
//        fridge.setTemperature(4.0);
//        fridge.setDoorOpen(true);
        System.out.println(fridge);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        BankAccount bankAccount = applicationContext.getBean(BankAccount.class);
//        bankAccount.setAccountHolderName("Omkar");
//        bankAccount.setAccountNumber("4571454l");
//        bankAccount.setBalance(1000d);
//        bankAccount.setAccountType("saving");
        System.out.println(bankAccount);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Student student = applicationContext.getBean(Student.class);
//        student.setName("Ram");
//        student.setAge(23);
//        student.setCourse("MCA");
        System.out.println(student);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        AirConditioner airConditioner = applicationContext.getBean(AirConditioner.class);
//        airConditioner.setBrand("LG");
//        airConditioner.setTon(1);
//        airConditioner.setInverter(true);
        System.out.println(airConditioner);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Bicycle bicycle = applicationContext.getBean(Bicycle.class);
//        bicycle.setBrand("Giant");
//        bicycle.setGear(21);
//        bicycle.setPrice(499.99);
        System.out.println(bicycle);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Camera camera = applicationContext.getBean(Camera.class);
//        camera.setBrand("Canon");
//        camera.setMegapixels(24);
//        camera.setHasZoom(true);
        System.out.println(camera);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Watch watch = applicationContext.getBean(Watch.class);
//        watch.setBrand("Rolex");
//        watch.setPrice(4999.99);
//        watch.setDigital(false);
        System.out.println(watch);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        House house = applicationContext.getBean(House.class);
//        house.setHasGarden(true);
//        house.setRooms(4);
//        house.setLocation("Bangalore");
        System.out.println(house);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Elevator elevator = applicationContext.getBean(Elevator.class);
//        elevator.setMaxCapacity(40);
//        elevator.setCurrentFloor(3);
//        elevator.setOperational(true);
        System.out.println(elevator);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        MicrowaveOven microwaveOven = applicationContext.getBean(MicrowaveOven.class);
//        microwaveOven.setBrand("Panasonic");
//        microwaveOven.setPower(1200);
//        microwaveOven.setConvection(true);
        System.out.println(microwaveOven);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Train train = applicationContext.getBean(Train.class);
//        train.setName("Rajdhani Express");
//        train.setExpress(true);
//        train.setCapacity(1200);
        System.out.println(train);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        MusicPlayer musicPlayer = applicationContext.getBean(MusicPlayer.class);
//        musicPlayer.setBrand("OneD");
//        musicPlayer.setStorage(12);
//        musicPlayer.setSupportsBluetooth(true);
        System.out.println(musicPlayer);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        WaterBottel waterBottel = applicationContext.getBean(WaterBottel.class);
//        waterBottel.setBrand("Milton");
//        waterBottel.setCapacity(1000);
//        waterBottel.setInsulated(true);
        System.out.println(waterBottel);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Refrigeretor refrigeretor = applicationContext.getBean(Refrigeretor.class);
//        refrigeretor.setBrand("Sumsung");
//        refrigeretor.setCapacity(5000);
//        refrigeretor.setDoubleDoor(true);
        System.out.println(refrigeretor);

    }

}
