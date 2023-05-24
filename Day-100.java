//Day 100
import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for (int i = 0; i < t; i++) {
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
HashSet<Integer> set=new HashSet<>();
set.add(a);
set.add(b);
set.add(c);
set.add(d);
if (set.size()==4)
System.out.println(2);
else if(set.size()==1)
System.out.println(0);
else if (set.size()==2) {
if ((a^b^c^d)==0)
System.out.println(2);
else
System.out.println(1);
}
else if (set.size()==3)
System.out.println(2);
}
}
}
