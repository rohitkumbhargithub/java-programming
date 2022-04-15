//using array for matrix from with arthimatic operation.
import java.util.*;
class matrix{ 
public static void main(String args[]){
   Scanner sc=new Scanner (System.in);
   int a, b, c, d, ch;
   char e;
   System.out.println("\n**Matrix operations**\n");
   System.out.println("Frist Matrix:\nEnter row: ");
       a=sc.nextInt();
       System.out.println("Enter coloumn: ");
       b=sc.nextInt();
       System.out.println("Secnod Matrix:\nEnter row: ");
       c=sc.nextInt();
       System.out.println("Enter coloumn: ");
       d=sc.nextInt();
       if(a==c && b==d)
       {
           int x[][]=new int [a] [b];
           int y[][]=new int [c] [d];
           int z[][]=new int [c] [d];  
       System.out.println("Enter the all element in first matrix: ");
       for(int i=0; i<a; i++){
           for(int j=0; j<b; j++){
               x[i][j]=sc.nextInt();
               
           }
           
       }
       System.out.println("Enter the all element in second matrix: ");
       for(int i=0; i<c; i++){
           for(int j=0; j<d; j++){
               y[i][j]=sc.nextInt();
           }
           
       }
       System.out.println("first matrix: ");
       for(int i=0; i<a; i++){
           for(int j=0; j<b; j++){
               System.out.print(x[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println("second matrix: ");
       for(int i=0; i<c; i++){
           for(int j=0; j<d; j++){
               System.out.print(y[i][j]+" ");
           }
           System.out.println();
       }
       do{
    System.out.println("\n**Arthamatic methods**\n");
    System.out.println("1.Addition 2.Susbstraction 3.Multiflication 4.Division");
    System.out.println("Enter your choice: ");
    ch=sc.nextInt();
switch(ch){
    case 1: System.out.println("Addtion is: ");
    for(int i=0; i<a; i++){
        for(int j=0; j<d; j++){
            for(int k=0; k<b; k++){
                z[i][j]=x[i][j]+y[i][j];
            }
        }
    }
    for(int i=0; i<a; i++){
        for(int j=0; j<d; j++){
            System.out.print(z[i][j]+" ");
        }
        System.out.println();
    }
    break;
    case 2:  System.out.println("Susbstraction is: ");
      for(int i=0; i<a; i++){
          for(int j=0; j<d; j++){
              for(int k=0; k<b; k++){
                  z[i][j]=x[i][j]-y[i][j];
              }
          }
      }
      for(int i=0; i<a; i++){
          for(int j=0; j<d; j++){
              System.out.print(z[i][j]+" ");
          }
          System.out.println();
      }
      break;
      case 3: System.out.println("Multiflication is: ");
      for(int i=0; i<a; i++){
          for(int j=0; j<d; j++){
              for(int k=0; k<b; k++){
                  z[i][j]=x[i][j]*y[i][j];
              }
          }
      }
      for(int i=0; i<a; i++){
          for(int j=0; j<d; j++){
              System.out.print(z[i][j]+" ");
          }
          System.out.println();
      }
      break;
    case 4: System.out.println("Division is: ");
    for(int i=0; i<a; i++){
       for(int j=0; j<d; j++){
           for(int k=0; k<b; k++){
               z[i][j]=x[i][j]/y[i][j];
           }
       }
    }
    for(int i=0; i<a; i++){
        for(int j=0; j<d; j++){
            System.out.print(z[i][j]+" ");
        }
        System.out.println();
    }
    break;
    default:
    System.out.println("The choice "+ch+" not work..?");
}
    System.out.println("Do you run again this Arthimatic operation..?");
    System.out.println("YES='y' and NO='n'");
    e=sc.next().charAt(0);
    }
    while(e=='y');
 }
   else
   {
       System.out.println("The matrix row and column not same..?");
   }
}
}
