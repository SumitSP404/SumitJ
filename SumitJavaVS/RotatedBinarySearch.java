public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Search(arr, 6)); // this gives the answer pivot/i.e the element we search for in rotated binary search
        //System.out.println(findPivot(arr)); thiss gives largest/pivot element in array
    }
    static int Search(int[]nums, int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(pivot == target){
            return pivot;
        }
        if(target  > nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length-1);

        
    }
    static int binarySearch(int[] arr, int target,int start, int end) {
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
       return -1;
   }
    //if ques abt to find largest number in rotated binary search
    //do this part only
    static  int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
