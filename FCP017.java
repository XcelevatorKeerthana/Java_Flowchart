import java.util.*;

public class FCP017{
public static void main(String[]args){

Scanner keerthi=new Scanner(System.in);
int a=keerthi.nextInt();
int b=keerthi.nextInt();
int c=keerthi.nextInt();
int max1=0;
int min1=0;
if(a>b)
{
max1=a;
min1=b;
}
else
{
max1=b;
min1=a;
}
if(max1>c)
{
System.out.println(c);
}
else
{
System.out.println(max1);
}}}