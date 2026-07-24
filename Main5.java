abstract class TV {

    
    abstract void display();

    
    void powerOn() {
        System.out.println("TV is Power ON");
    }
}

class Samsung extends TV {

    @Override
    void display() {
        System.out.println("Samsung TV Display");
    }
}

class LG extends TV {

    @Override
    void display() {
        System.out.println("LG OLED TV");
    }
}

public class Main5 {
    public static void main(String[] args) {

        TV t1 = new Samsung();
        TV t2 = new LG();

        t1.powerOn();
        t1.display();

        t2.powerOn();
        t2.display();
    }
    
}