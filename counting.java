import java.io.*;
import java.util.*;
import java.math.*;
class counting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number;
System.out.println("Enter number:");
number=sc.nextInt();
if(number<0)
{
System.out.println("Invalid data");
}
else
{
int len=(int)(Math.log10(number)+1);
System.out.println("Total length of given integer is:"+len);
}
}
