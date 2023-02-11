//Day-35
//Write a Program to Count the sum of numbers in a string
import java.util.*;
public class CountNumbers {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String str1=sc.next();
int sum=0;
for(int i=0;i<str1.length();i++){
if(Character.isDigit(str1.charAt(i))){
sum=sum+Character.getNumericValue(str1.charAt(i));
}
}
System.out.println(sum);
}
}
