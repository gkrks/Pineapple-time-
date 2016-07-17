import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long s = sc.nextLong();
        long x = sc.nextLong();
        
        long a = x-t;
        if(t == s){
            System.out.println("YES");
        }
        else{
            if(a%s == 0 || a%s == 1 && x>= s+t){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
