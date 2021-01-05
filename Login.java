package sms2point0;

import java.util.*;
import java.io.*;
public class Login
{
     
    static void fnStudent()
    {
        
        System.out.println("\f");
        Scanner Sc=new Scanner (System.in);
       
        int flag = 0, uid = 0;
        int rpw= 0;
        System.out.println("Please enter your userid:");
        try{
            uid = Sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("error! try again(Press enter)");
            
        }
        
       
        start.startStudent(uid);

    }

    static void fnTeacher()
    {
        System.out.println("\f");
        Scanner Sc=new Scanner (System.in);
        String adminpw = "adminpassword";
        String pword = "";
        System.out.println("Please enter ADMIN password:");

        pword = Sc.nextLine();
        if(pword.equals(adminpw))
        {
            System.out.println("\f");
            start.startTeacher();
        }

        else
        {
            System.out.println("Sorry! wrong credentials \n1.)Press enter to retry:\n2.)Press 1 to exit to main menu");
            String flush = Sc.nextLine();
            System.out.println("\f");
            if(flush.equals("1"))
                fnLogin();
            fnTeacher();

        }
    }

    public static void fnLogin()
    {
        Scanner Sc=new Scanner (System.in);
        int ch = 0;
        System.out.println("**********WELCOME TO VIRTUAL HIGH SCHOOL********** " +
            "\n1.)Enter 1 to login as a student. \n2.)Enter 2 to login as a teacher. \n3.)Enter 3 to exit.");
        try{
            ch = Sc.nextInt();
        }
        catch(Exception e)
        {            

        }
        switch(ch)
        {
            case 1:
            fnStudent();
            break;
            case 2:
            fnTeacher();
            break;
            case 3:
            System.out.println("Thanks for visiting!");

            break;
            default:
            System.out.println("Invalid option entered \nPress enter to Retry");
            String flush = Sc.nextLine();
            flush = Sc.nextLine();
            System.out.println("\f");
            fnLogin();

        }
        
    }
    
}

