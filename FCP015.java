public class FCP015{
public static void main(String[]args){
int max1=0;
int min1=0;
int max2=0;
int min2=0;
int a=98;
int b=13;
int c=29;
int d=109;
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
if(c>d)
{
max2=c;
min2=d;
}
else
{
max2=d;
min2=c;
}
if(max1>max2)
{
System.out.println(max1);
}
else
{
System.out.println(max2);
}}}