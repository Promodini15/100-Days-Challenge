//Day 93
import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;
class Set{
static Scanner sc = new Scanner(System.in);
static String i(){
 return sc.next();
}

 public static void main( String[] args ) throws IOException{

 int n = sc.nextInt();
 BitSet[] ar = new BitSet[n];
 for(int i=0;i<n;i++)
 {
 String s = i();
 ar[i] = new BitSet(n);
 for(int j=0;j<n;j++)
 {
 if(s.charAt(j) == '1')
 ar[i].set(j);
 }
 }

 long c=0;
 for(int i=0;i<n;i++)
 {
 for(int j=i+1;j<n;j++)
 {
 if(!ar[i].get(j) && ar[i].intersects(ar[j]))
 {
 c+=2;
 }
 }
 }
 System.out.print(c);

 }
}
