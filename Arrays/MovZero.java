
import java.util.Scanner;

class MovZero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        moveZeroes(a);
    }
    public static void moveZeroes(int[] nums) {
    int j=-1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            j=i;
            break;
        }


    }
    if(j==-1) return;
    for(int i=j+1;i<nums.length;i++)
    {
        int temp;
        if(nums[i]!=0)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
     
    }  
    }
}
/* 2nd approach 
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}*/
