class Counter{
    private int c=0;

    public synchronized void increment(){
        c++;
    }
    public int getCount(){
        return c;
    }
}

/* TYPE 1: USING THREAD
class Synchronize {
    public static void main(String args[]) throws InterruptedException{
        Counter c=new Counter();
        
        Thread t1=new Thread(() -> {
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });

        Thread t2=new Thread(() -> {
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getCount());
    }
}*/

/* TYPE 2: USING THREAD EXTEND
class Synchronize extends Thread{
    private Counter c;
    public Synchronize(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Counter c=new Counter();

        Synchronize t1 = new Synchronize(c);
        Synchronize t2 = new Synchronize(c);
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getCount());
    }
}*/

/*TYPE 3 : USING RUNNABLE
class Synchronize {
    public static void main(String args[]) throws InterruptedException{
        Counter c=new Counter();
        
        Runnable task=() -> {
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };

        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getCount());
    }
}*/

/*TYPE 4 : USING RUNNABLE IMPLEMENTS
class Synchronize implements Runnable{
    private Counter c;
    public Synchronize(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Counter c=new Counter();

        Thread t1 = new Thread(new Synchronize(c));
        Thread t2 = new Thread(new Synchronize(c));
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getCount());
    }
}
