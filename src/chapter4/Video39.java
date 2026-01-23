package chapter4;

public class Video39 {
    public static void main(String[] args) {
        int[] hoanganh = {10,9,3,5,8};
        System.out.println("phan tu dau tien = "+ hoanganh[0]);
        System.out.println("phan tu thu ba = "+ hoanganh[3]);
        System.out.println(hoanganh.length);
        String[] names = {"le van a " , "bla bla", "hoanganh"};

        for (int i = 0; i < names.length;i++  ){
            System.out.println("phan tu "+ i + "= "+ names[i]);
        }
    }
}
