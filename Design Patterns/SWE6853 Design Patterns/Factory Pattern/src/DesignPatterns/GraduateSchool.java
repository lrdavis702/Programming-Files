package DesignPatterns;

public class GraduateSchool extends University {
    public Student createStudent(String type) {
        Student student = null;

        if (type.equals("National")) return new GraduateNationalStudent();
        else if (type.equals("International")) return new GraduateInternationalStudent();
        else return null;
    }
}
