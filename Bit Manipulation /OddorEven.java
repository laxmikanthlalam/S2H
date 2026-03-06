//Check if a number is odd or not
import java.util.*;
class OddorEven{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if((n&1)==1)
        {
        System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
    }
}
