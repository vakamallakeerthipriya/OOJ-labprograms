import java.util.Scanner;

class shapes{
public static void main(String[] args) {

Scanner in= new Scanner(System.in); 
while(true)
{
System.out.println("Select a shape");
System.out.println("1:Cone");
System.out.println("2:Cylinder");
System.out.println("3:Sphere");
System.out.println("4:Exit");
int choose= in.nextInt();
 double pi=3.14159;
switch(choose)
{
case 1:
 System.out.println("Enter radius");
double r1= in.nextDouble();
System.out.println("Enter hight");
double h1= in.nextDouble();
double a1= pi*r1*(r1+ Math.sqrt(r1*r1+h1*h1));
double v1= pi*r1*r1*h1/3 ;
System.out.println("The area is " + a1 );
System.out.println("The volume is " + v1 );
break;       

case 2:
System.out.println("Enter radius");
double r2= in.nextDouble();
System.out.println("Enter hight");
double h2= in.nextDouble();
double a2= 2*pi*r2*h2+2*pi*r2*r2;
double v2= pi*r2*r2*h2;
System.out.println("The area is " + a2 );
System.out.println("The volume is " + v2 );
break;

case 3:
System.out.println("Enter radius");
double r3= in.nextDouble();  
double a3= 4*pi*r3*r3;
double v3= 4*pi*r3*r3*r3/3 ;
System.out.println("The area is " + a3 );
System.out.println("The volume is " + v3 );
break;
case 4: System.exit(0);

}
}
}
}