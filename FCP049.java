import java.util.*;
public class FCP049{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long tot = 0;
long N =sc.nextInt();
for(long i= 2;i < N;i++)
{
long count = 0;
	for(long s = 1;s <= i;s++)
	{
		if (i % s==0)
		{
		count++;
		}
	}		
		if (count == 2)
		{
		tot++;
		}
}
	System.out.println(tot);
}}