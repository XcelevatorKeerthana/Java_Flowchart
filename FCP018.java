import java.util.*;

public class FCP018{
public static void main(String[]args){

Scanner keerthi=new Scanner(System.in);


int bs=keerthi.nextInt();
double hra=0;
double da=0;
double gs=0;
if(bs<=10000)
{
	hra=(double)bs*0.2;
	da=(double)bs*0.8;
	gs=bs+hra+da;
	System.out.println(gs);
}
else if (bs<=20000)
{
	hra=(double)bs*0.25;
	da=(double)bs*0.9;
	gs=bs+hra+da;
	System.out.println(gs);
}
else
{
	hra=(double)bs*0.3;
	da=(double)bs*0.95;
	gs=bs+hra+da;
	System.out.println(gs);
}	
}}	