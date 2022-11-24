import java.text.*;
import java.util.*;

import static java.lang.Math.abs;


public class InfoAboutDev {
    public static String fio;
    static Date getDateofTask;
    static Date getDateofFinish;

    public static String InputFio(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Fio");
        fio = scan.nextLine();
        System.out.println("Your input is: " + fio);
        return fio;
    }

    public static Date getdateofTask(){
        Date getDateofTask = new Date();
        Long time = getDateofTask.getTime();
        long anotherDate = -7;
        time = time + (60*60*24*1000*anotherDate);
        getDateofTask = new Date(time);
        System.out.println("Date of start is: " + getDateofTask);
        return getDateofTask;
    }

    public static Date getDateofFinich(){
        Date getDateofFinish = new Date();
        Long time = getDateofFinish.getTime();
        long anotherDate = +7;
        time = time + (60*60*24*1000*anotherDate);
        getDateofFinish = new Date(time);
        System.out.println("Date of finish is: " + getDateofFinish);
        return getDateofFinish;
    }



    public static void main(String[] args) throws ParseException {

        InputFio();
        getdateofTask();
        getDateofFinich();
        Date neww = new Date();
        System.out.println(neww);


        //2

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date in format: dd/MM/yyyy ");
        String dateInString = scan.nextLine();
        Date date = formatter.parse(dateInString);
        System.out.println(date);
        long start = System.currentTimeMillis();
        System.out.println(new Date() + "\n");
        long end = date.getTime();
        long diff = (end - start)/86400000; // из миллисекунд в дни
        System.out.println("Разница между датами: " + abs(diff) + " дней");





    }
}
