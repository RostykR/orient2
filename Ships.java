
package com.company;


   public class Ships {

    private int passengerShip;
    private int cargoShip;
    private int specialShip;
    private int kilkist;
    private String largest;



      Ships(int passengerShip,int cargoShip,int specialShip,int kilkist,String largest){
        this.passengerShip = passengerShip;
        this.cargoShip = cargoShip;
        this.specialShip = specialShip;
        this.kilkist = kilkist;
        this.largest = largest;



    }


     void allShips(int passengerShip,int cargoShip,int specialShip){
        int a = passengerShip + cargoShip + specialShip;
        System.out.println("В порту пришвартовано "+a+" судна,загалом кількість місць 300");
    }


    int remainingSpace(int passengerShip,int cargoShip,int specialShip){
        int f = 300 - (passengerShip + cargoShip + specialShip);
        return f;

    }
    // перевизначений метод
    double allShips(double passengerShip,double cargoShip,double specialShip){
        double a = passengerShip + cargoShip + specialShip;
        return (a);
    }
    // перевантажений метод
     void price(int money){
        int temp = (money * passengerShip )+ (money * cargoShip) + (money * specialShip);
        System.out.println("Загальний прибуток з кораблів становить: " + temp);

    }
     void pereviz(Cargo o){
        if(passengerShip >= (o.getPeople()/passengerShip)){
            System.out.println("Пасажирські кораблі можуть перевезти пасажирів");

        }
        else{
            System.out.println("Пасажирські кораблі не зможуть перевезти пасажирів");
        }
    }
     String Ships(){
       largest ="Найбільший корабель який пришвартований в порту називається: "+largest;
        return largest;
    }
    public void cementDost(Cargo d,Containers f){
          double temp = d.getCement()/(10*d.getMishk());
          if(temp<=(f.getContainerpust()*40)){
              System.out.println("Цемент поміщається в контейнер");
          }
          else{
              System.out.println("Цемент не поміщається в контейнер");
          }
          }




       public int getCargoShip() {
           return cargoShip;
       }

       public void setCargoShip(int cargoShip) {
           this.cargoShip = cargoShip;
       }

       public int getPassengerShip() {
           return passengerShip;
       }

       public void setPassengerShip(int passengerShip) {
           this.passengerShip = passengerShip;
       }

       public int getSpecialShip() {
           return specialShip;
       }

       public void setSpecialShip(int specialShip) {
          specialShip =   specialShip * 2;
           this.specialShip = specialShip;
       }

       public int getKilkist() {
           return kilkist;
       }

       public void setKilkist(int kilkist) {
           this.kilkist = kilkist;
       }

       public String getLargest() {
           return largest;
       }

       public void setLargest(String largest) {
           this.largest = largest;
       }

   }

