import java.util.*;
class SecSmlEle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int result=getSecondSmallest(a);
        System.out.println(result);

    }
    public static  int getSecondSmallest(int[] arr) {
        // code here
        int n=arr.length;
        int L=arr[0];
        int SL=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<L)
            {
                SL=L;
                L=arr[i];
            }
            else if(arr[i]<SL && arr[i]>L)
            {
                SL=arr[i];
            }
        }
        return SL;
    }
}
