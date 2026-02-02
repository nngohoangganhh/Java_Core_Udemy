package chapter13.video134;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Video134{
//    public static void writeData(List<Student> students , double diemTb) {
//    try (FileWriter fw = new FileWriter("src\\chapter13\\video132\\reports.txt");
//         BufferedWriter bw = new BufferedWriter(fw);
//         PrintWriter pw = new PrintWriter(bw);) {
//
//          pw.println("====== STUDENT REPORT ======");
//        pw.printf("%-12s %-7s %-8s\n", "Name", "Score", "Pass/Fail");
//        pw.println("----------------------------------------");
//        for (Student s : students) {
//            String status = s.getScore() >= 5.0 ? "PASS": "FAIL";
//            pw.printf("%-12s %5.2f %-8s\n", s.getName(), s.getScore(), status);
//        }
//        pw.println("----------------------------------------");
//
//        pw.printf("Average Score: %.2f\n", diemTB);
//        pw.println("========================================");
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
    public static void writeData (List<Student> students, double diemTB) {
    try (FileWriter fw = new FileWriter("src/chapter13/video134/report.txt");
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);) {
        pw.println("====== STUDENT REPORT ======");
        pw.printf("%-12s %-7s %-8s\n", "Name", "Score", "Pass/Fail");
        pw.println("----------------------------------------");
        for (Student s : students) {
            String status = s.getScore() >= 5.0 ? "PASS": "FAIL";
            pw.printf("%-12s %5.2f %-8s\n", s.getName(), s.getScore(), status);
        }
        pw.println("----------------------------------------");
        pw.printf("Average Score: %.2f\n", diemTB);
        pw.println("========================================");
    } catch (Exception e) {
        // TODO: handle exception
    }
}
    public static void handleReadWrite(){
        try (FileReader fr = new FileReader("src\\chapter13\\video134\\students.txt");
                   BufferedReader br = new BufferedReader(fr);){
            List<Student> listST=  new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
               // System.out.println(line);
                String[] temp = line.split(",");
                double score = Double.valueOf(temp[1]);

                listST.add(new Student(temp[0], score));
            }
                double sumScore= 0;
                for (Student student : listST) {
                   // System.out.println(student);
                    sumScore+= student.getScore();
                }
                double diemtb = sumScore /(listST.size());
                writeData(listST,diemtb);
               // System.out.println("diemTb = " +diemtb);


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
     handleReadWrite();

    }

}
