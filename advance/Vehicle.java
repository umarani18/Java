public interface Vehicle{
    String getName();
    String speedUp();
    String speedDown();

    default String turnAlarmOn(){
        return "Alarm is turning ON...";
    }

    default String turnAlarmOff(){
        return "Alarm is turning OFF...";
    }
}