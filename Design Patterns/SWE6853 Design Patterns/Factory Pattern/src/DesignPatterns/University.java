// abstract class for University of students
package DesignPatterns;

public abstract class University {

    // method for creating a new student in the system
    public Student registerStudent(String type){
        Student student;

        student = createStudent(type); // creates new student (graduate/undergrad)

        student.intake(); // calls method for remaining student details

        return student;
    }

    // factory method that instantiates Student
    abstract Student createStudent(String type); // abstract factory method for student
}
