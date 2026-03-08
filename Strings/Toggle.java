import java.io.*;
import java.util.*;

public class Toggle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner in=new Scanner(System.in);
        String s=in.next();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            s2.append(Character.toLowerCase(ch));
            else
            s2.append(Character.toUpperCase(ch));
        }
        System.out.println(s2);

    }
}
