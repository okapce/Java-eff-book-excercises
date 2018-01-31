/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author nickp_000
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //execDates();
        String formatString ="yyyy/MM/dd hh:mm:ss";
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf= new SimpleDateFormat(formatString);
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    //same as
        System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss")
            .format(Calendar.getInstance().getTime()));
    
        LocalDate lDate = LocalDate.now();
        lDate = LocalDate.of(2018, 1, 18);
        System.out.println(lDate);
        lDate=LocalDate.parse("2018-01-18");
        System.out.println(lDate);
        lDate=LocalDate.now(ZoneId.systemDefault());
        System.out.println(lDate);
        
        //LocalDate(yyyy/MM/dd) != Date(yyyy/MM/dd hh:mm:ss)
        
        LocalDateTime lDateTime = LocalDateTime.now();
        System.out.println(lDateTime);
        lDateTime= LocalDateTime.of(2017, 12, 15, 11, 30);
        System.out.println(lDateTime);
        lDateTime=LocalDateTime.now(ZoneId.systemDefault());
        System.out.println(lDateTime);
        
        System.out.println("Converting");
        Date today = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println(dateFormat.format(today));
        String t1="2017/04/03";
        String t2 = "yyyy/MM/DD";    
        System.out.println("parseDate:");
        Date fecha= new Date();
        fecha=parseDate(t1, t2);
        System.out.println(fecha);
        
        System.out.println("Calender obj:");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("BirthDay: ");
        calendar.set(1985, Calendar.AUGUST, 29);
        calendar.set(Calendar.HOUR_OF_DAY,07);
        calendar.set(Calendar.MINUTE, 32);
//to set time to Date, must create calender instance and assign
        Date myBirthDate=calendar.getTime();
        System.out.println(myBirthDate);
        
//time zone
        System.out.println(TimeZone.getDefault().getDisplayName());
        LocalDate lclDate = LocalDate.now();
        LocalDate futDate = LocalDate.now().plusDays(40);
        System.out.println(lclDate+" "+futDate);
//comparing times
        long days = ChronoUnit.DAYS.between(lclDate, futDate);
        System.out.println("Dias entre ahora y 40 dias --> "+days );
        
        
    }
    
    private static java.sql.Date convert(java.util.Date uDate) {
    java.sql.Date sDate = new java.sql.Date(uDate.getTime());
    return sDate;
    }
    
    private static void execDates(){
    java.util.Date utilDate = new java.util.Date();
    System.out.println("java.util.Date is : " + utilDate);
    java.sql.Date sqlDate = convert(utilDate);
    System.out.println("java.sql.Date is : " + sqlDate);
    DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
    System.out.println("dateFormated date is : " + df.format(utilDate));
    
    }
    
    private static Date parseDate(String formattedDate, String dateFormat){
        Date date = null;
        SimpleDateFormat objDf = new SimpleDateFormat(dateFormat);
        try{
            date=objDf.parse(formattedDate);
        }catch(Exception ex){
            System.out.println("whatever");
    }
        return date;
    }
    
}
