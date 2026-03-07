import java.util.*;
class Pangram{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s="abcdefghijklmnopqrstuvwxyz";
        String s1=in.next();
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s1.indexOf(ch)==-1)
            {
            flag=false;
            break;
            }
        }
        if(flag)
        System.out.println("It is a Panagram");
        else
        System.out.println("It is a not a panagram");
    }
}
