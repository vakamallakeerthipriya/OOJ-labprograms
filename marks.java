import java.util.Scanner;
class marks {
public static void main(String[] args) {
Scanner in= new Scanner(System.in);
int c,s,h,sum;
System.out.println("enter the CIE out of 50");
c=in.nextInt();
System.out.println("enter the SEE out of 100");
s=in.nextInt();
h=s/2;
sum=h+c;
if((sum==100)&&(sum>=90))
System.out.println("grade-S");
else if(sum>=80)
System.out.println("grade-A");
else if(sum>=70)
System.out.println("grade-B");
else if(sum>=60)
System.out.println("grade-C");
else if(sum>=50)
System.out.println("grade-D");
else if(sum>=40)
System.out.println("grade-E");
else if(sum>=0)
System.out.println("grade-F");
}
}
