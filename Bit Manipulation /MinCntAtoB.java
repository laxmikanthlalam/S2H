//Count number of bits to be  lipped to convert A to B
import java.util.*;
class MinCntAtoB{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int result= minBitFlips(n,m);
        System.out.println(result);

    }
    public static int minBitFlips(int start, int goal) {
        int ans = 0;
        int xor = start ^ goal;
        while (xor != 0) {
            ans += xor & 1;
            xor >>= 1;
        }
        return ans;
    }
}
