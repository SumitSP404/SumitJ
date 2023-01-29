import java. io.*;
import java.util.*;
class LeakyBuckett {
    public static void main(String args[]) {
        int noq, storage,buck_size;
        int ips,ops, size_left;
        //int bucket_size;
        storage = 0;
        noq = 4;
        buck_size = 10;
        ips = 4;
        ops = 1;
        for(int i =0;i<noq;i++){
            size_left = buck_size - storage;
            if(ips<=(size_left)){
                storage+=ips;
            }
            else{
                System.out.println("packet loss=" +ips);
            }
            System.out.println("Buffer size=" +storage+ "out of bucket size" + buck_size);
            storage-=ops;
        }

    }
}
