package sms2point0;

import java.util.*;
import java.io.*;
public class Database
{
    public void fnWriteInFile()throws IOException
    {
        String fileName="Database.txt";
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter("Database.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);

        int i;
        String nm;
        System.out.println("Enter student name");
        nm=buf.readLine();
        pw.println(nm);
        System.out.print("\f");
        System.out.println("Welcome "+nm);
        System.out.println("Subject Code List:");
        fnList();
        for(i=1;i<=6;i++)
        {

            System.out.println("Enter the marks for subject " + i + ": ");
            double marks = Double.parseDouble(buf.readLine());

            while(marks<0.0 || marks>100.0)
            {
                System.out.println("INVALID marks!please enter again.");
                System.out.println("Enter the marks again for subject" + i  + ": ");
                marks = Double.parseDouble(buf.readLine()); 

            }
            pw.println(marks);
        }
        System.out.println("Create a new password");
        String wordp = buf.readLine();
        pw.println(wordp);

        pw.close();
    }

   

    void fnList()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Subject Name      Subject Code");
        System.out.println("ENGLISH                01");
        System.out.println("SCIENCE                02");
        System.out.println("MATHS                  03");
        System.out.println("SOCIAL STUDIES         04");
        System.out.println("SECOND LANGUAGE        05");
        System.out.println("APPLICATIONS           06 \n");
        System.out.println("***Enter marks out of 100*** \n Press Enter after reading the list");
        String enter=Sc.nextLine();

    }

}

