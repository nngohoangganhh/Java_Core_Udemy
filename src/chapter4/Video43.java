package chapter4;

public class Video43 {
    public static void main(String[] args) {
            double[] scores = {8 ,10, 6.5, 7 , 1, 3.5};
            double sum =0, diemTB = 0;
            for (double score : scores) {
                sum += score;
            }
        System.out.println("Tổng điểm =  "+ sum );
            diemTB = sum/ (scores.length);
        System.out.println("Điểm Trung bình = "+diemTB);
    }
}
