class Teacher{

    void HomeWork() {
        System.out.println("Teacher give the homeWork");
    }
}

class Students extends Teacher {

    void written(){
        System.out.println("students written the home work");
    }
}

class children extends Students{
    void write(){
        System.out.print("children copy the home work");
    }
}

public class Main {

    public static void main(String[] args){
        children e=new children();
        
        e.HomeWork();
        e.written();
        e.write();
    }
}