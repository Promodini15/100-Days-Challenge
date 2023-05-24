//Day 98
import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
int t=0 ;
if (sc.hasNextInt())
t= sc.nextInt();
while(t-->0){
int n = sc.nextInt();
D[] dishes = new D[n];
for (int i = 0; i < n; i++) {
long a= sc.nextLong();
long c= sc.nextLong();
long l= sc.nextLong();
long r= sc.nextLong();
dishes[i]=new D(a,c,l,r);
}
int res = solution(dishes, n);
System.out.println(res);
}
}catch(Exception e){
e.printStackTrace();
return;
}
finally {
sc.close();
}
}
private static int solution(D[] dishes, int n) {
Arrays.sort(dishes,0,n,(a,b) -> Long.compare(a.cost, b.cost));
TreeSet<Long> v = new TreeSet<Long>();
long max = 0;
boolean fail = false;
for(int i = 0; i < n; ++i){
long l=dishes[i].l;
long r=dishes[i].r;
long a=dishes[i].attr;
if(r <= max){
fail = true;
break;
}
while(!v.isEmpty() && v.last() >= r)
v.remove(v.last());
if(a > max){
if(v.isEmpty() || a> v.last())
v.add(a);
else {
long pos = v.ceiling(a);
v.remove(pos);
v.add(a);}
}
max = Math.max(max, l);
}
if(!fail)
return n - v.size();
return -1;
}
}
class D {
long attr;
long cost;
long l;
long r;
public D(long attr, long cost, long lattr, long rattr) {
this.attr = attr;
this.cost = cost;
this.l = lattr;
this.r = rattr;
}
}
