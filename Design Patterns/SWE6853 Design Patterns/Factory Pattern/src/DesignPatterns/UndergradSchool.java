package DesignPatterns;

public class UndergradSchool extends University {
    public Student createStudent(String type) {
            Student student = null;

            if (type.equals("National")) return new UndergraduateNationalStudent();
            else if (type.equals("International")) return new UndergraduateInternationalStudent();
            else return null;
        }
    }