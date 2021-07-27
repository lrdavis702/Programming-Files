package DesignPatterns;

import java.util.Scanner;

public abstract class Student {
    Scanner input = new Scanner(System.in);

    String name;
    String major;
    int studentNo;
    String classification;

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public void intake (){
        System.out.print("Enter student name: ");
        name = input.next();
        setName(name);

        System.out.print("Enter major: ");
        major = input.next();
        setMajor(major);

        System.out.print("Enter Student Number: ");
        studentNo = input.nextInt();
        setStudentNo(studentNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", studentNo=" + studentNo +
                ", classification='" + classification + '\'' +
                '}';
    }
}