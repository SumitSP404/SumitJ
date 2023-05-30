import java.util.Scanner;

public class CeilingOfANum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        System.out.println("enter array length ");
        int[] nums = new int[in.nextInt()];
        System.out.println("Enter sorted array elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Enter target element to find its index");
        int target = in.nextInt();
        int ans = Search(nums, target);
        System.out.println("Element found at index:");
        System.out.println(ans);

    }

    static int Search(int[] arr, int target) {
         if(arr.length == 0){
         return -1;
     }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

