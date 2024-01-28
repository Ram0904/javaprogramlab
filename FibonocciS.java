import java.util.*;
class Fibonacci
{
public static int recFib(int n)
{
if (n<=1)
 return n;
else
 return recFib(n-1) + recFib(n-2);
}
public static int nonrecFib(int n)
{
if(n<=1)
{
 return n;
}
int first=0,second=1,res=0;
for(int i=2;i<=n;i++)
{
res=first+second;
first=second;
second=res;
} 
return res;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int res1=recFib(n);
System.out.println("Recursive Fibonacci("+n+"):"+res1);
int res2=nonrecFib(n);
System.out.println("Non Recursive("+n+"):"+res2);
}
}