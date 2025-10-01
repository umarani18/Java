class Defaultinterface implements Vehicle{
    public String getName(){
        return "Car";
    }
    public String speedUp(){
        return "The car is speeding up...";
    }
    public String speedDown(){
        return "The car is speeding down...";
    }
    public static void main(String[] args){
        Defaultinterface di=new Defaultinterface();
        System.out.println(di.getName());
        System.out.println(di.speedUp());
        System.out.println(di.speedDown());
        System.out.println(di.turnAlarmOn());
        System.out.println(di.turnAlarmOff());
    }
}