//Count the number of set bits 
import java.util.*;
class CountofSetBits{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
        while(n>0)
        {
            n=n&(n-1);
            c+=1;
        }
        System.out.println(c);
    }
}
