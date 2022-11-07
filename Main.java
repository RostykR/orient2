package com.company;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
	Ships s = new Ships(67,43,23,133,"Fortuna");
    Containers c = new Containers(54,34,534,5454,"Giond",334,43,34,43);
    Cargo r = new Cargo(s.getPassengerShip(),s.getCargoShip(),s.getSpecialShip(),s.getKilkist(),s.getLargest(),c.getAutoContainers(),c.getClothingContainer(),c.getDevicesContainer(),c.getContainerpust(),56,45,54,54,56,54);
    NameShips.setName2("Ginner");
    NameShips.largestToday();
    NameShips.allTime();
    r.free();
    c.test2();
    c.test1();
    s.allShips(67,43,25);
    System.out.println(ANSI_RED+"Залишок місць для швартування:"+ANSI_RESET + s.remainingSpace(67,43,25));
    c.allContainers(60,100,76);
    System.out.println("Залишок місць для контейнерів становить:" + c.freePlace(60,100,76));
    r.allCargo(50,34,65,43);
    System.out.println("Залишок вільного тоннажу становить: " + r.freeWeight(50,34,65,43));
    s.price(1000);
    s.pereviz(r);
    c.dostava(s);
    r.dostavka(s);



    }
}
