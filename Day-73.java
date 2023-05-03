//Day 73
/*You are given a string S of length N, consisting of lowercase english alphabets. 
Find the length of the longest boring substring of S which occurs more than once.*/
import java.util.*;
import java.io.*;
public class BoringString {
    static void boringString() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Vector<String> v = new Vector<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //  Map map=new HashMap();  
        for (int i = 0; i < n; i++) {
            String s1 = "";
            s1 += s.charAt(i);
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                s1 += s.charAt(i);
                i++;
            }
            v.add(s1);
        }
        int a = 0, t = 0, a1 = 0;
        for (int i = 0; i < v.size(); i++) {
          map.put(v.get(i), map.getOrDefault(v.get(i), 0) + 1);
            int p = v.get(i).length();
            a1 = Math.max(a1, p);
            t = Math.max(t, map.get(v.get(i)));
        }
        if (t > 1) {
            for (int i = 0; i < v.size(); i++) {
                if (map.get(v.get(i)) > 1) {
                    int p = v.get(i).length();
                    a = Math.max(a, p);
                }
            }
        }
        System.out.println(Math.max(a1 - 1, a));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            boringString();

        }
    }
}
