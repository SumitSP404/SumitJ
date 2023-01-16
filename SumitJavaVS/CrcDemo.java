import java.io.*;
import java.util.*;

class CrcDemo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("please enter a number for the size of the array: ");
        size = sc.nextInt();
        int dat[] = new int[size];
        System.out.println("please enter bits into the array : ");
        for (int i = 0; i < size; i++) {
            System.out.println("please enter bit " + (size - i) + ":");
            dat[i] = sc.nextInt();
        }
        System.out.println("please enter the divisor array size :");
        size = sc.nextInt();
        int divArray[] = new int[size];
        System.out.println("please enter div bits into the array : ");
        for (int i = 0; i < size; i++) {
            System.out.println("please enter bit " + (size - i) + ":");
            divArray[i] = sc.nextInt();
        }
         int remdr[] = DataAndDivisorDivsion(dat, divArray);
         for (int i = 0; i < remdr.length - 1; i++) {
            System.out.print(remdr[i]);
        }
        System.out.println("\n CRC code that generated is: ");
        for (int j = 0; j < dat.length; j++) {
            System.out.print(dat[j]);
        }
        for (int k = 0; k < remdr.length - 1; k++) {
            System.out.print(remdr[k]);
        }
        System.out.println();
         int dataSent[] = new int[dat.length + remdr.length - 1];
        System.out.println("please enter bits needed to send into the array: ");
        for (int i = 0; i < dataSent.length; i++) {
            System.out.println("please enter bit " + (dataSent.length - 1) + ":");
            dataSent[i] = sc.nextInt();
        }
        recData(dataSent, divArray);
    }
   static int[] DataAndDivisorDivsion(int preDat[], int divArray[]) {
        int remdr[] = new int[divArray.length];
        int l;
        int dat[] = new int[preDat.length + divArray.length];
        System.arraycopy(preDat, 0, dat, 0, preDat.length);
        System.arraycopy(dat, 0, remdr, 0, divArray.length);
        for (l = 0; l < preDat.length; l++) {
            System.out.println((l + 1) + ".) First data bit is : " + remdr[0]);
            System.out.print("Remainder : ");
            if (remdr[0] == 1) {
                for (int j = 1; j < divArray.length; j++) {
                    remdr[j - 1] = exOrOpertn(remdr[j], divArray[j]);
                    System.out.print(remdr[j - 1]);
                }
            } else {
                for (int j = 1; j < divArray.length; j++) {
                    remdr[j - 1] = exOrOpertn(remdr[j], 0);
                    System.out.print(remdr[j - 1]);
                }
            }
            remdr[divArray.length - 1] = dat[l + divArray.length];
            System.out.println(remdr[divArray.length - 1]);
        }
        return remdr;
    }
   static int exOrOpertn(int x, int y) {
      if (x == y) {
            return 0;
        }
        return 1;
    }
   static void recData(int dat[], int divArray[]) {
    int remdr[] = DataAndDivisorDivsion(dat, divArray);
         for (int j = 0; j < remdr.length; j++) {
            if (remdr[j] != 0) {
                System.out.println(" received Currupted data...");
                return;
            }
        }
        System.out.println("Data received without any error.");
    }
}