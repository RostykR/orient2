package com.company;


public class Cargo extends Containers {
    private double gravel;
    private double grain;
    private double coal;
    private double cement;
    private int people;
    private int mishk;

    public Cargo(int passengerShip, int cargoShip, int specialShip, int kilkist, String largest, int autoContainers, int clothingContainer, int devicesContainer, int containerpust, double gravel, double grain, double coal, double cement, int people, int mishk) {
        super(passengerShip, cargoShip, specialShip, kilkist, largest, autoContainers, clothingContainer, devicesContainer, containerpust);
        this.gravel = gravel;
        this.grain = grain;
        this.coal = coal;
        this.cement = cement;
        this.people = people;
        this.mishk = mishk;
    }
    void free(){
        freePlace(43,54,54);
        System.out.println("Вільне місце можна використати під сировину");
    }

    void allCargo(double gravel, double grain, double coal, double cement){
        double c = gravel + grain + coal + cement;
        System.out.println("В бункері знаходиться "+c+" тонн сировини,загальна вмістимість 700 тонн");
    }

    int freeWeight(int gravel,int grain,int coal,int cement){
        int g = 700 - (gravel + grain + coal + cement);
        return g;
    }
    // перевизначений
    double allCargo(int gravel,int grain,int coal,int cement){
        int c = gravel + grain + coal + cement;
        return (c);
    }
    //перевантажений метод
    void price(double money) {
        double temp = (money * cement)+(money * grain)+(money*gravel)+(money*coal);
        System.out.println("Загальний прибуток з грузів становить: " + temp);
    }

    void dostavka(Ships n){
        if ((cement)+(coal)+(gravel)+(grain)<=(400)+(n.getCargoShip())){
            System.out.println("Всю сировину можна перевезти одним кораблем");

        }
        else {
            System.out.println("Щоб перевезти всю сировину потрібно 2 корабля");
        }

    }

    public int getMishk() {
        return mishk;
    }

    public void setMishk(int mishk) {
        this.mishk = mishk;
    }

    public double getGravel() {
        return gravel;
    }

    public void setGravel(double gravel) {
        this.gravel = gravel;
    }

    public double getGrain() {
        return grain;
    }

    public void setGrain(double grain) {
        this.grain = grain;
    }

    public double getCoal() {
        return coal;
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public double getCement() {
        return cement;
    }

    public void setCement(double cement) {
        this.cement = cement;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        people = people * 2;
        this.people = people;
    }
}






