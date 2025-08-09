import java.util.*;
public class FCP048{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
for(int i=m;i<=n;i++)
{
int sum=0;
int count=0,temp=i;
while(temp>0)
{
a=
count=count+1; 
temp=temp/10;
}
int t1=i;
while(t1>0)
{
int b=t1%10;
while(count>0){
int p=1;
for(int j=1;j<=count;j++) 
{
p=p*b;
}
sum = sum + p;
t1 = t1 / 10;
}
	
if(sum==i)
System.out.println(sum);
}
}
}
}
