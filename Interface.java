//interface in java
import java.util.*;
interface student{
    void getstudentdata();//interface method (does not have a body)
}
interface academic{
    void marks();//interface method (does not have a body)
}
class college implements student, academic
/*College 'implements' student and acadmic interface*/
{
    Scanner sc=new Scanner(System.in);
    public void getstudentdata()/*The body of getstudentdata() */
    {
        String name, cname, address,mob;
        int roll_no;
        System.out.println("Enter roll no: ");
        roll_no=sc.nextInt();
        System.out.println("Enter name: ");
        name=sc.nextLine();
        name=sc.nextLine();
        System.out.println("Enter course name: ");
        cname=sc.nextLine();
        System.out.println("Enter your Address: ");
        address=sc.nextLine();
        System.out.println("Enter mobile no: ");
        mob=sc.nextLine();
        
        //printing the get student data.
        
        System.out.println("\n***Student Information***\n");
        System.out.println("Roll no :" +roll_no);
        System.out.println("Name : " +name);
        System.out.println("course name : " +cname);
        System.out.println("Address : " +address);
        System.out.println("Mobile no : " +mob);
    }
    public void marks()/*The body of marks() */{
        Scanner sc1=new Scanner(System.in);
        
        //Inputing four subject mark.
     
        int m1, m2, m3, m4;
        System.out.println("Enter subject first: ");
        m1=sc1.nextInt();
        System.out.println("Enter subject second: ");
        m2=sc1.nextInt();
        System.out.println("Enter subject third: ");
        m3=sc1.nextInt();
        System.out.println("Enter subject fourth: ");
        m4=sc1.nextInt();
        
        //Printing marks.
        
        System.out.println("\n Inputed marks is \n Subject first "+m1+ "\nSubject second "+m2+ "\nSubject third "+m3+"\nsubject fourth "+m4);
        
        //Percentage for subjects.
        
        System.out.println("\n**Percenatge**\n");
        float per;
        per=(m1+m2+m3+m4)/4;
        System.out.println("Percantage is " +per+"%");
        
        //less than 18 percentage to fail.
        
        if(per>18)
         System.out.println("your are pass..");
        else 
         System.out.println("you are fail...");
    }
}
public class Main{
    public static void main(String args[]){
        college C=new college(); //Creating an object for college.
        System.out.println("\n**Input Student information**\n");
        C.getstudentdata();
       System.out.println("\n**Enter marks**\n");
        C.marks();
    }
}