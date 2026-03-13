import java.util.*;

class RotandSort {

    public static boolean check(int[] nums) {

        int n = nums.length;
        int c = 0;
        int pos = -1;

        for(int i = 1; i < n; i++) {

            if(nums[i] < nums[i-1]) {
                c++;
                pos = i;

                if(c > 1)
                    return false;
            }
        }

        if(c == 0)
            return true;

        for(int i = pos; i < n; i++) {
            if(nums[i] > nums[0])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = check(nums);

        System.out.println(result);
    }
}
