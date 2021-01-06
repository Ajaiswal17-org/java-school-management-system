package sms2point0;
 
import java.util.*;
import java.io.*;
class Percentage
{
    Scanner Sc=new Scanner(System.in);
    static double marks[]=new double[6], avg=0.0;
    static int sub_cde[]={1,2,3,4,5,6};
    static String name="";
    public static void fninput(int id)throws IOException
    {
        FileReader fr=new FileReader("Database.txt");
        BufferedReader br=new BufferedReader(fr);
        
        Scanner Sc=new Scanner(System.in);
        int i,low_cde=0;
        double sum=0.0,low=100.0;
        String p;
        int j=id;

        while(j>0)
        { 
            name=br.readLine();
            marks[0]=Double.parseDouble(br.readLine());
            marks[1]=Double.parseDouble(br.readLine());
            marks[2]=Double.parseDouble(br.readLine());
            marks[3]=Double.parseDouble(br.readLine());
            marks[4]=Double.parseDouble(br.readLine());
            marks[5]=Double.parseDouble(br.readLine()); 
            p = br.readLine();
            j--;
        }
        

        for(i=0;i<6;i++)
        {
            if(low>=marks[i]&& sub_cde[i]!=01)
            {
                low=marks[i];
                low_cde=sub_cde[i];
            }
            sum=sum+marks[i]; 
        }
        sum=sum-low;
        avg=(sum/5.0);
        System.out.print("\f");
        fnResult(low_cde,avg);
    }

    static void fnResult(int low_cde,double avg)
    {
        System.out.println("Result :-");
        System.out.println("Student name: " + name);
        System.out.println("The marks of ENGLISH + Best of any 4 subjects are :");
        for(int i=0;i<6;i++)
        {
            switch(sub_cde[i])
            {
                case 1:
                System.out.println("ENGLISH         "+marks[i]);
                break;
                case 2:
                if(low_cde==sub_cde[i])
                    break;
                else
                    System.out.println("SCIENCE         "+marks[i]);
                break;
                case 3:
                if(low_cde==sub_cde[i])
                    break;
                else
                    System.out.println("MATHS           "+marks[i]);
                break;
                case 4:
                if(low_cde==sub_cde[i])
                    break;
                else
                    System.out.println("SOCIAL STUDIES  "+marks[i]);
                break;
                case 5:
                if(low_cde==sub_cde[i])
                    break;
                else
                    System.out.println("SECOND LANGUAGE "+marks[i]);
                break;
                case 6:
                if(low_cde==sub_cde[i])
                    break;
                else
                    System.out.println("APPLICATIONS    "+marks[i]);
                break;
                default:
                System.out.println("Wrong option");
            }
        }
        System.out.println("\nTOTAL AVERAGE = "+avg+"%");
        if(avg > 33.5){
            System.out.println("\nSTATUS: PROMOTED"); 
        }
        else{
            System.out.println("\nSTATUS: FAILED");        
        }
    }
}

