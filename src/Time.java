/**
 * Created by scott_000 on 9/24/2016.
 */
public class Time {

    private double hour;
    private double minute;
    private double second;

    //no arg constructor
    public Time() {
       long time = System.currentTimeMillis();
        setTime(time);

    }

    public Time(long time) {

    }



    public double getHour() {
        return hour;
    }


    public double getMinute() {
        return minute;
    }


    public double getSecond(){
        return second;
    }


    public void setTime(long time) {
        //elapsedTime should be converted to hours/minutes/seconds
        //print in hours/minute/seconds
        hour = (time/1000) % 60;
        minute = (time / (1000*60)) % 60;
        second = (time / (1000 * 60 * 60) % 24);

        System.out.println("\n" + hour + ":" + minute + ":" + second);



    }
}
