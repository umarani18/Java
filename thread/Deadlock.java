public class Deadlock{
    static class Friend{
        private final String name;
        public Friend(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public synchronized void bow(Friend bower){
            System.out.format("%s: %s"+" has bowed to me!%n",this.name,bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower){
            System.out.format("%s: %s"+" has bowed to me!%n",this.name,bower.getName());
        }
    }
    public static void main(String args[]) throws InterruptedException{
        //if join is removed, it lead to deadlock
        final Friend a = new Friend("Alphonse");
        final Friend b = new Friend("Gaston");

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                a.bow(b);
            }
        });
        t1.start();
        t1.join();

        Thread t2 = new Thread(new Runnable() {
            public void run(){
                b.bow(a);
            }
        });
        t2.start();
        t2.join();
    }
}