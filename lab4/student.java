import  java.util.*;

class student
{
    String name;
    String usn;
    int marks[]=new int[5];
    int credits[]=new int[5];
    int tot=0;
    int i;
    int grade=0;
    void read_data()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        name=obj.next();
        System.out.println("Enter the USN");
        usn=obj.next();
        System.out.println("Enter the credits and marks for 5 subjects");
        
        for(i=0;i<5;i++)
        {
            System.out.println("Credits for subject"+(i+1)+":");
            credits[i]=obj.nextInt();
            System.out.println("Marks for subject"+(i+1)+": ");
            marks[i]=obj.nextInt();
        }
    }
    void calc_SGPA()
    {
        for(i=0;i<5;i++)
        {
            if(marks[i]>=90&&marks[i]<=100)
            grade=10;
            else  if(marks[i]>=75&&marks[i]<90)
            grade=9;
            else  if(marks[i]>=60&&marks[i]<75)
            grade=8;
            else  if(marks[i]>=50&&marks[i]<60)
            grade=7;
            else  if(marks[i]>=45&&marks[i]<50)
            grade=6;
            else  if(marks[i]>=40&&marks[i]<45)
            grade=5;
            else if(marks[i]<40)
            grade=0;
            
            tot=tot+grade*credits[i];
        }
        tot=tot/20;
        System.out.println("SGPA:"+tot);
    }
        void details()
        {
         System.out.println("Name:"+name);
         System.out.println("USN:"+usn);
         System.out.println("Marks and Credits for all 5 subjects:");
         for(i=0;i<5;i++)
         {
             System.out.println(marks[i]);
             System.out.println(credits[i]);
         }
         calc_SGPA();
        }

public static void main(String args[])
{
    student obj=new student();
    obj.read_data();
    obj.calc_SGPA();
    obj.details();
    
}
}
