/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.Calendar;
public class Test {

    public static void main(String[] args) {
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
    LocalDateTime now=LocalDateTime.now();
    Formatter fm=new Formatter();
    Calendar cal=Calendar.getInstance();
    fm.format("%tB",cal);
        Scanner s=new Scanner(System.in);
     String name;
     boolean b=true;
     System.out.println("\033[35mJARVIS BOOTING UP.........\033[35m");
     while(b){
     name=s.nextLine();
    if (name.contains("good morning")) {
      System.out.println("good morning to you sir");
    }
    else if(name.contains("good evening")) 
    {
      System.out.println("\033[35mGood Evening Sir\033[35m");  
    }
    else if(name.contains("time")) 
    {
      System.out.println("current time is:"+dtf1.format(now));  
    }
    else if(name.contains("date")) 
    {
      System.out.println("current date is:"+dtf.format(now));  
    }
    else if(name.contains("hello jarvis")) 
    {
      System.out.println("\033[35mHello Sir\033[35m");  
    }
    else if(name.contains("your name")) 
    {
      System.out.println("\033[35mMy Name Is Jarvis\033[35m");  
    }
    else if(name.contains("created you")) 
    {
      System.out.println("\033[35mI am created by Tony Stark\033[35m");  
    }
    else if(name.contains("current month")) 
    {
      System.out.println(fm);  
    }
        else if(name.contains("your age")) 
    {
      System.out.println("\033[35m I don't have age,I am immortal\033[35m");  
    }
         else if(name.contains("from where")) 
    {
      System.out.println("\033[35m i am from burdwan\033[35m");  
    }
         else if(name.contains("hello")) 
    {
      System.out.println("\033[35m Hello Sir! \033[35m");  
    }
    else
    {
        System.out.println("\033[35mNot found\033[35m");
    }
     }
 }
}