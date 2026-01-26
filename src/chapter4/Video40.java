package chapter4;

import java.util.Scanner;

public class Video40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] listNumber = new int[5];
         for(int i= 1 ; i <= 5; i++){
             System.out.println(" Nhập  phần tử của mảng  " + i + " : ");
             int input = scanner.nextInt();
             listNumber[i-1] = input;
         }

         int sum = 0, max = 0;
         for (int j = 0; j < listNumber.length;j++){
             sum+=listNumber[j];
             if(max < listNumber[j]){
             max = listNumber[j];
             }
         }


        System.out.println("========================");
        System.out.println(" Tổng các số vừa nhập: " +sum);
        System.out.println(" Số lớn nhất trong mảng là: " +max);
        scanner.close();
    }
}
