import java.util.Arrays;

public class ArrPassinginFunction {
    public static void main(String[] args) {
        int [] nums = {1,5,6,99,69};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[3] = 52;
    }
}
