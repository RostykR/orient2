package com.company;


import javax.naming.CompositeName;

public class Containers extends Ships{
    private int autoContainers;
    private int clothingContainer;
    private int devicesContainer;
    private int containerpust;

    public Containers(int passengerShip, int cargoShip, int specialShip, int kilkist, String largest, int autoContainers, int clothingContainer, int devicesContainer, int containerpust) {
        super(passengerShip, cargoShip, specialShip, kilkist, largest);
        this.autoContainers = autoContainers;
        this.clothingContainer = clothingContainer;
        this.devicesContainer = devicesContainer;
        this.containerpust = containerpust;
    }

    private void allContainers(int autoContainers, int clothingContainer, int devicesContainer) {
        int b = autoContainers + clothingContainer + devicesContainer;
        System.out.println("В порту знаходиться " + b + " контейнера,загальна кількість місць 1000");
    }
    void allContainersDemo(){
         allContainers(1,1,1);
    }

    int freePlace(int autoContainers, int clothingContainer, int devicesContainer) {
        int d = 1000 - (autoContainers + clothingContainer + devicesContainer);
        return d;
    }
    // перевизначений метод
    double allContainers(double autoContainers, double clothingContainer, double devicesContainer) {
        double b = autoContainers + clothingContainer + devicesContainer;
        return (b);
    }
    //перевантажений метод
    private void price(double money){
        double temp = (money * autoContainers)+(money*clothingContainer)+(money*devicesContainer);
        System.out.println("Загальний прибуток з контейнерів становить: "+temp);
    }
    void priceDemo(){
         price(1);
    }

    void dostava(Ships s){
        if ((autoContainers)>=(s.getCargoShip()/autoContainers)){
            System.out.println("Контейнери можна погрузити на відправку");
        }
        else{
            System.out.println("Контейнерів замало,потрібно зачекати нову партію");
        }

    }

    public int getAutoContainers() {
        return autoContainers;
    }

    public void setAutoContainers(int autoContainers) {
         autoContainers = autoContainers * 2;
        this.autoContainers = autoContainers;
    }





    public int getClothingContainer() {
        return clothingContainer;
    }

    public void setClothingContainer(int clothingContainer) {
        this.clothingContainer = clothingContainer;
    }

    public int getDevicesContainer() {
        return devicesContainer;
    }

    public void setDevicesContainer(int devicesContainer) {
        this.devicesContainer = devicesContainer;
    }

    public int getContainerpust() {
        return containerpust;
    }

    public void setContainerpust(int containerpust) {
        this.containerpust = containerpust;
    }


    void test1(){
        allShips(43,534,53);


    }
    void test2(){
        Pogruzka pg = new Pogruzka();
        pg.all();
    }

    class Pogruzka{
        void all(){
            allContainers(54,34,43);

        }
    }
}















