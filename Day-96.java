//Day 96
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{ static boolean isPowerOfTwo(int x)
{
return x != 0 && ((x & (x - 1)) == 0);
}
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int count = 0;
while (n>0) {
count += n & 1;
n >>= 1;
}
System.out.println(count-1);
}
}
}
