package main.java.util;

import java.time.LocalDate;
import java.util.TreeSet;

public class Generator {

    public static String generateRandomGibberish(Integer length){

        String gibberish = "";
        while(gibberish.length()<length){
            Double seed = Math.random();
            Integer code = (int) (seed*123-seed*97)+97;
            Character ch = (char) code.intValue();
            gibberish+=ch;
        }

        return gibberish.substring(0,1).toUpperCase()+gibberish.substring(1);
    }
    public static String generateRandomNumberSequence(Integer length){

        String cardNumber = "";
        while(cardNumber.length()<length){
            Double seed = Math.random();
            Integer code = (int) (seed*58-seed*48)+48;
            char ch = (char) code.intValue();
            cardNumber+=ch;
        }

        return cardNumber;

    }

    public static LocalDate generateRandomDateWithinRange(int lowerYearLimit,int upperYearLimit){
        double seed = Math.random();
        int year = (int)((seed*upperYearLimit - seed*lowerYearLimit)+lowerYearLimit);
        int month = (int)(seed*12-seed*1)+1;
        int day = (int)(seed*31-seed*1)+1;
        TreeSet<Integer> leapYear = new TreeSet<>();
        for(int i = 2000;i<3000;i+=4){
            leapYear.add(i);
        }
        for(int i = 2000;i>0;i-=4){
            leapYear.add(i);
        }
        switch (month){
            case 2: {
                if(leapYear.contains(year)&&day>29)day=29;
                else if(day>28)day=28;
            } break;
            case 4:
            case 6:
            case 9:
            case 11:if(day>30)day=30;break;
        }

        return LocalDate.of(year,month,day);

    }

}
