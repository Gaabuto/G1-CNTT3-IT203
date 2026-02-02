package Ex07.bai1;

import javax.crypto.spec.PSource;

public class Student {
    private int studentId;
    private String studentName;

    private static int totalStudent=0;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    };

    public void displayInfor(){
        System.out.println("Mã sinh viên: "+studentId+" |Tên sinh viên: "+studentName);
    }

    public static void displayInforTotal(){
        System.out.println("Tổng số sinh viên: "+totalStudent);
    }

}
