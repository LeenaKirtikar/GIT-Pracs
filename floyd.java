import java.util.Scanner;
public class floyd
{
public static void main(String args[])
{
int p,k=1,i,j,num=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of lines: ");
p=sc.nextInt();
System.out.println();
sc.close();
for(i=1;i<=p;i++)
{
for(j=1;j<=i;j++)
{
	System.out.print(+num);
	num++;
}
System.out.println();
}
}
}