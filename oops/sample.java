// class sample{
//     String name="Apple";
//     public static void main(String[] args){
//         sample s=new sample();
//         System.out.println(s.name);
//         int num=-5;
//         System.out.println(num >> 2);
//         System.out.println(num >>> 2);
//         long n=-5;
//         System.out.println(n>>2);
//         System.out.println(n>>>2);
//     }
// }
class Parent {
    static void display() {
        System.out.println("Static method in Parent");
    }

    void show() {
        System.out.println("Instance method in Parent");
    }
}

class Child extends Parent {
    static void display() { 
        System.out.println("Static method in Child");
    }

    @Override
    void show() { 
        System.out.println("Instance method in Child");
    }
}

public class sample {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Parent p = new Child();

        p.display(); 
        p.show();   
    }
}
