import java.util.*;
public class FCP037{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int i=1;
int s=0;
int n=sc.nextInt();
while(i<n)
{
if(n%i==0)
{
s=s+i;
}
i++;
}
if(s==n)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}}