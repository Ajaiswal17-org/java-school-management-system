package sms2point0;

import java.util.*;
import java.io.*;
class start
{
    static int uid;
    public static void startStudent(int id)
    {
        Scanner Sc=new Scanner(System.in);
        uid = id;
        int nop= 0;
        System.out.println("Welcome back!");
        System.out.println("Enter 1 to view  your academic details");
        System.out.println("Enter 2 to view your fees details");
        System.out.println("Enter 3 to exit to main menu");
        System.out.println("Please Enter your option");
        try{
            nop=Sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Error!");

            System.out.println("***Press enter to return to menu***");
            String flush2 = Sc.nextLine();
            System.out.println("\f");
            startStudent(uid);
        }

        choice(nop);
    }

    public static void choice(int op)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("\f");
        switch(op)
        {
            case 1:
            try{
                Percentage nr = new Percentage();
                nr.fninput(uid);
            }
            catch(Exception e){
                System.out.println("Error!");
            }
            System.out.println("***Press enter to return to main menu***");
            String flush2 = Sc.nextLine();
            System.out.println("\f");
            startStudent(uid);

            break;

            case 2:
            Fees.fnFees();
            System.out.println("***Press enter to return to main menu***");
            flush2 = Sc.nextLine();
            System.out.println("\f");
            startStudent(uid);
            break;
            case 3:
            Login.fnLogin();
            break;
            default:
            System.out.println("You have entered a wrong option");
            System.out.println("Retry(press enter) ");
            System.out.println("\f");
            startStudent(uid);
        }
    }

    public static void startTeacher()
    {
        Scanner Sc=new Scanner(System.in);

        System.out.println("Welcome back!");
        System.out.println("Enter 1 to view  student academic details");
        System.out.println("Enter 2 to add new student details");
        System.out.println("Enter 3 to exit to main menu");
        System.out.println("Please Enter your option");
        int nop=Sc.nextInt();
        choice2(nop);
    }

    public static void choice2(int op)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("\f");
        switch(op)
        {
            case 1:
            System.out.println("Enter Student id:");
            try{
                uid = Sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("error! try again(Press enter)");
                String flush =Sc.nextLine();
                System.out.println("\f");

            }

            try{
                Percentage.fninput(uid);

            }
            catch(Exception e){
                System.out.println("Error!");
            }
            System.out.println("***Press enter to return to main menu***");
            String flush2 = Sc.nextLine();
            flush2 = Sc.nextLine();
            System.out.println("\f");
            start.startTeacher();

            break;
            case 2:
            try{
                Database dr = new Database();
                dr.fnWriteInFile();
            }
            catch(Exception e){
                System.out.println("Error!");
            }

            System.out.println("Added successfully!");           
            startTeacher();
            break;
            case 3:
            Login.fnLogin();
            break;
            default:
            System.out.println("You have entered a wrong option");

            startTeacher();
        }
    }
}
