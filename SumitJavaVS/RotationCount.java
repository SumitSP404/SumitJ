public class RotationCount {
    public static void main(String[] args) {
         int [] arr = {5,6,7,8,1,2,3};
         System.out.println(CountRotation(arr));
    }
    static int CountRotation(int[] arr){
        int pivot =findPivot(arr);
        // no need of using if(pivot == -1),bcoz if there is no rotation it gives -1 and with pivot + 1 will become -1+1=0
        //i.e it return 0 if tehers is no rotation;
        return pivot + 1;
    }
    // rotation count for non duplicate Array elements
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
