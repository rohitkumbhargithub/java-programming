//using interface for college
import java.util.*;
interface student{
 void getdata();//interface method (does not have a body)
 void displaydata();//interface method (does not have a body)
 }
 interface marksDetails{
  void marks();//interface method (does not have a body)
  void displaymarks();//interface method (does not have a body)
  }
  class course implements student, marksDetails
  //course 'implements' student and marksDetails interface
{
   Scanner sc=new Scanner(System.in);
   Scanner sc1=new Scanner(System.in);
   int rollno;
   float per;
   int m1, m2, m3, m4, total;
   String name, cname, dob, mname;
   public void getdata()
     //The body of getdata() 
  {
   System.out.println("Enter Student Roll no: ");
   rollno=sc.nextInt();
   System.out.println("Enter Student Full name: ");
   name=sc.nextLine();
   name=sc.nextLine();
   System.out.println("Enter Student Course name: ");
   cname=sc.nextLine();
   System.out.println("Enter Student Birth date: ");
   dob=sc.nextLine();
   System.out.println("Enter Mother name: ");
   mname=sc.nextLine();
   }
 public void displaydata()
  //The body of displaydata()
{
   System.out.println("Roll no: " +rollno);
   System.out.println("Student name: " +name);
   System.out.println("Course name: " +cname);
   System.out.println("Brith date: " +dob);
   System.out.println("Mother name: " +mname);
   }
  public void marks()
  //The body of marks() 
{
   System.out.println("\n**ENTER MARK**\n");
    System.out.println("Enter Subject 1: ");
    m1=sc1.nextInt();
    System.out.println("Enter Subject 2: ");
    m2=sc1.nextInt();
    System.out.println("Enter Subject 3: ");
    m3=sc1.nextInt();
    System.out.println("Enter Subject 4: ");
    m4=sc1.nextInt();
    total=m1+m2+m3+m4;
    }
    public void displaymarks()
    //The body of displaymarks() 
{
    System.out.println("out of 400 = " +total);
    per=total/4;
    System.out.println("Percentage is " +per);
    if(m1<=35 || m2<=35 || m3<=35 || m4<=35)
    {
      System.out.println("You are fail..");
      }
     else if(per<=50)
     {
     System.out.println("You are pass..");
     }
     else if(per<=75)
     {
     System.out.println("Secnod class..");
     }
     else if(per<=100)
     {
     System.out.println("First class..");
     }
     else
     {
     System.out.println("Your input is wrong..");
     }
     }
  }
     class college{
      public static void main(String args[]){
        course cr= new course(); ////Creating an object for course.
        System.out.println("\n**Student information**\n");
        cr.getdata();
        cr.marks();
        System.out.println("\n**Given information**\n");
        cr.displaydata();
        cr.displaymarks();
}
} 



