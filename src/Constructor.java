//Topic : Function Overloading

public class Constructor {
    public static void main(String[]args){
        Car bmw = new Car("Red","5600",1234,"BMW",2022);
        Car audi = new Car();

        System.out.println("chasis No: "+ bmw.chasisNo);
        System.out.println("Color: "+ bmw.color);
        System.out.println("Model: "+ bmw.model);
        System.out.println("Brand: "+ bmw.brand);
        System.out.println("Year: "+ bmw.year);
    }
}

class Car{
    //no parameter Constructor
    Car(){
        System.out.println("New Car is created,but values are still default");
    }
    // 5 arguments constructor
    Car(String col,String model,int chasisNo,String brand,int year){
        System.out.println("5 arguments constructor");
        color = col;  //this line of code
        model = model;  //this line of code
        chasisNo = chasisNo; //this line of code
        brand = brand;   //this line of code
        year = year;  //this line of code
    }
    String color;
    String model;
    int chasisNo;
    String brand;
    int year;
}

//flow of code