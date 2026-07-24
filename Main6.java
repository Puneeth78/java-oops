               class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if (age > 18) {
            this.age = age;
            return true; 
        } else {
            System.out.println("Invalid Age");
            return false;
        }
    }

    public String getName() {
        return name;                                                        
    }
; 
    public int getAge() {
        return age;
    }
}

public class Main6 {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Puneeth");

        if (s.setAge(25)) {
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
        }
    }
}