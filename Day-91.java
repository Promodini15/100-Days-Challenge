//Day 91
/*
Sridhar was a seasoned traveler. He liked to visit new places. More than all he was a meticulous planner.
This time he was planning to visit Europe. He wrote down his travel itinerary like as follows:
If he wanted to visit Madrid, Paris, Munich, Warsaw and Kiev in this order, he would write it down like as:
Madrid Paris 100
Paris Munich 200
Munich Warsaw 150
Warsaw Kiev 120
More formally, if he wanted to go from A to B directly and the price is C dollars, then he would write
A B C
on a card. Each move was written on a different card. Sridhar was a great planner, so he would never visit the same place twice. Just before starting his journey, the cards got shuffled. Help Sridhar figure out the actual order of the cards and the total cost of his journey.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class TravelCost {
public static void main(String[] args) throws NumberFormatException, IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
HashMap<String,String> start=new HashMap<String,String>();
HashMap<String, String> end=new HashMap<String, String>();
ArrayList<Integer> cost=new ArrayList<Integer>();
int i;
String[] str;
int total=0;
for(i=0;i<n-1;i++)
{

str=br.readLine().split(" ");
start.put(str[0],str[1]);
end.put(str[1],str[2]);
total=total + Integer.parseInt(str[2].replace("$", ""));
}
String costAns=total+"$";
String startCountry="";
Iterator<String> it=start.keySet().iterator();
while(it.hasNext())
{
String c1=it.next();
if(!end.containsKey(c1))
{
startCountry=c1;
break;
}
}
for(i=0;i<n-1;i++)
{
System.out.println(startCountry+" "+start.get(startCountry)+""+end.get(start.get(startCountry)));
startCountry=start.get(startCountry);
}
System.out.println(costAns);

}
}
}
