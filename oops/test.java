// class test{
//     public static void main(String[] args){
//         try{
//             method1();
//         }catch(Exception e){
//             e.printStackTrace();
//             System.out.println(e);
//         }
//     }
//     public static void method1() throws ClassNotFoundException {
//         throw new ClassNotFoundException();
//     }
// }


/*USER DEFINED EXCEPTION
class myException extends Exception{
    myException(String m){
        super(m);
    }
}
class test{
    public static void main(String args[]){
        try{
            method1();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void method1() throws myException {
        throw new myException("some issue arise");
    }
}*/

/*NESTED EXCEPTION
class test{
    public static void main(String[] args){
        try{
            int a=3,b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            throw new RuntimeException("Error: Division by zero occured",e);
        }
    }
}*/

// class test{
//     public static void main(String[] args){
//         try{
//             NumberFormatException ex=new NumberFormatException("Primary Exception");
//             ex.initCause(new NullPointerException("Root cause of the exception"));
//             throw ex;
//         }
//         catch(NumberFormatException e){
//             System.out.println(e);
//             System.out.println(e.getCause());
//         }
//     }
// }
// Java program to demonstrate syntax of assertion
import java.util.Scanner;

class test {
    public static void main(String args[])
    {
        int value = 15;
        assert value >= 20 : " Underweight";
        System.out.println("value is " + value);
    }
}
//run - java -ea test