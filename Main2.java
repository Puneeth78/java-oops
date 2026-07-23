class Car{

    String model;
    int year;
    String color; 

    Car(String model, int year,String color) {
        this.model = model;
        this.year = year;
        this.color=color;
    }

    void display() {
        System.out.println("Car Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("color : " + color);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota Fortuner", 2024,"white");
        Car car2 = new Car("Hyundai Creta", 2023,"blue");
    

        car1.display();
        System.out.println();
        car2.display();
    }

    
}
