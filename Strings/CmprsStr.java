import java.io.*;
import java.util.*;

public class CmprsStr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        int c=1;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(i < n-1 && ch==s.charAt(i+1))
            {
                c++;
            }
            else
            {
            s1.append(ch);
            s1.append(c);
            c=1;
            }
        }
        String s2=s1.toString();
        System.out.println(s2);
    }
}
