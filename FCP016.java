public class FCP016{
public static void main(String[]args){
int y=2000;
if(y%400==0)
{ 
System.out.println("Leap year");
}
else if(y%4==0)
{
if (y%100!=0)
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a leap year");
}
}}}