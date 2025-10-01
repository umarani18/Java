/* TYPE 1 : USING RUNNABLE
class Defining implements Runnable{
    public void run(){
        System.out.println("Hello from thread");
    }
    public static void main(String args[]){
        (new Thread(new Defining())).start();
    }
}*/
class Defining extends Thread{
    public void run(){
        System.out.println("Hello from thread");
    }
    public static void main(String args[]){
        Defining t1=new Defining();
        // (new Defining()).start();
        t1.start();
    }
}