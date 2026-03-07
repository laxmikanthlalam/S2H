import java.io.*;
import java.util.*;

public class CheckBit{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int i=in.nextInt();
    if((N&(1<<i))!=0)
    {
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }


    }
}
