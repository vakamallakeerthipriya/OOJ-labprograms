import java.util.Scanner;
class primenumbers {
public static void main(String[] args) {
Scanner in= new Scanner(System.in);
int c,s,count;
System.out.println("enter the first number");
c=in.nextInt();
System.out.println("enter the second number");
s=in.nextInt();
for(int k=c;k<=s;k++)
{
count=0;
for(int j=1;j<=k;j++)
{
if(k%j==0)
count=count+1;
}
if(count==2)
System.out.println(k);
}
}
}
