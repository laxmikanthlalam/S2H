// string reverse
import java.util.*;
class StrRev{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String rev=" ";
    for(int i=0;i<s.length();i++)
    {
      rev=s.charAt(i)+rev;
    }
    System.out.println(rev);
    }
}
