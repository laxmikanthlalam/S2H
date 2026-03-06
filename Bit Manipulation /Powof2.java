//Check if a number is power of 2 or not
import java.util.*;
class Powof2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=(n>0)&&((n&(n-1))==0);
        System.out.println(ans);
    }
}
