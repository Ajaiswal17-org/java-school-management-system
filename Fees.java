package sms2point0;

import java.util.*;
class Fees
{
    
    static void fnFees()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Welcome to the FEES department");
        System.out.println("Enter 1 to check Fees details");
        System.out.println("Enter 2 to pay Fees");
        System.out.println("Enter 3 to go to main menu");
        System.out.println("Enter your option");
        int op=Sc.nextInt();
        switch(op)
        {
            case 1:
            fnFeesDetails();
            break;
            case 2:
            fnFeesPayment();
            break;
            case 3:
            System.out.println("\f");
            Login.fnLogin();
            default:
            System.out.println("Invalid option entered \nRetry");//DO WHILE DAL DE FOR RETRYING
        }
    }
    static void fnFeesDetails()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Total Fees : ");
        //APNE HISAB SE KARDE
        System.out.println("Fees Paid : ");
        //APNE HISAB SE KARDE
        System.out.println("Fees Due :");
        //APNE HISAB SE KARDE
    }
    static void fnFeesPayment()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("MONTH      MONTH NUMBER");
        System.out.println("JANUARY         01");
        System.out.println("FEBRUARY        02");
        System.out.println("MARCH           03");
        System.out.println("APRIL           04");
        System.out.println("MAY             05");
        System.out.println("JUNE            06");
        System.out.println("JULY            07");
        System.out.println("AUGUST          08");
        System.out.println("SEPTEMBER       09");
        System.out.println("OCTOBER         10");
        System.out.println("NOVEMBER        11");
        System.out.println("DECEMBER        12 \n");
        System.out.println("Press Enter after reading the list");
        String enter=Sc.nextLine();//YAHA PAR FLUSH USE KARLENA AGAR LAGE TOH 
        System.out.println("Enter the number of month(s) you want to pay for");
        //INPUT LE LO
        System.out.println("Enter the Month Number of that Month (Refer to the list)");
        //INPUT LE LO
    }
}