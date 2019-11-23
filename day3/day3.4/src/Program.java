import java.time.LocalTime;

class Program
{
    public static void main(String[] args) {
        LocalTime ltt = LocalTime.now();

        int hr=ltt.getHour();
        int min=ltt.getMinute();
        int sec=ltt.getSecond();
        int nsec=ltt.getNano();

        System.out.println("Current Time "+hr+":"+min+":"+sec+":"+nsec);
    }

}