import java.io.*;
import java.util.*;

public class StrRot {

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String A=in.next();
        String B=in.next();
        if(A.length()!=B.length())
        {
            System.out.println("no");
            return;
        }
        String temp=B+B;
        if(temp.contains(A))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
