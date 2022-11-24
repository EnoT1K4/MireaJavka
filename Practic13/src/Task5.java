

import java.lang.module.Configuration;

public class Task5 {
    static String CountryCode;
    static String ten;
    public static String getNumber(String number){
        ten = number.substring(number.length()-10);
        if (number.startsWith("8")) CountryCode = "+7";
        else CountryCode = number.substring(0, number.length()-10);
        return CountryCode + ten.substring(0, 3) + "-" + ten.substring(3, 6) + "-" + ten.substring(6, 8) + "-" + ten.substring(8);
    }
    public static void main(String[] args){
        System.out.println(getNumber("+79207662452"));
        System.out.println(getNumber("88005553535"));
    }
}