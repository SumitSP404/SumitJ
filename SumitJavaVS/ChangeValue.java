import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr[] = {1,5,4,3,69};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int nums[])
    {
        nums[4]=96;  //if you make change to the object via this ref variable, same object will be chnaged 
    }
}
