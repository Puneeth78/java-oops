interface Star {
    void sun();
}

interface Planet {
    void earth();
}

class SolarSystem implements Star, Planet {

    public void sun() {
        System.out.println("Sun is the center of the Solar System.");
    }

    public void earth() {
        System.out.println("Earth is the third planet from the Sun.");
    }

    void moon() {
        System.out.println("Moon is Earth's natural satellite.");
    }
}

class Universe extends SolarSystem {

    void galaxy() {
        System.out.println("The Solar System belongs to the Milky Way Galaxy.");
    }
}

public class Main3 {

        public static void main(String[] args) {

        Universe u = new Universe();

        u.sun();
        u.earth();
        u.moon();
        u.galaxy();
    }
    
}
