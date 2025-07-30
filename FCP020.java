import java.util.*;

public class FCP020{
public static void main(String[]args){

Scanner keer=new Scanner(System.in);
int max1=0;
int min1=0;
int max2=0;
int min2=0;
int maxi=0;
int mini=0;
int a=keer.nextInt();
int b=keer.nextInt();
int c=keer.nextInt();
int d=keer.nextInt();
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
	maxi=max2;
        mini=min1;
}
else
{
	maxi=max1;
	mini=min2;
}
if(maxi>mini)
{
	System.out.println(maxi);
}
else
{
	
	System.out.println(mini);
}
}}