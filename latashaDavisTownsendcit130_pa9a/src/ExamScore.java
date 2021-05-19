import java.util.Scanner;

public class ExamScore {

    // create local scanner
    public static Scanner input = new Scanner(System.in);

    // declare variables
    private String name; // name of exam
    private int score; // score on exam

    // create input

    // purpose: no-argconstructor to initialize the instance variables to
    // values of your choice.
    // returns: Void
    // parameters: Void
    ExamScore(){
        name = "Exam 1";
        score = 100;
    } // end no-arg ExamScore

    // purpose: A Constructor with 2 parameters to initialize the instance
    // variables to the arguments indicated in the parameter list of the
    // constructor.
    // returns: void
    // parameters: (String, int)
    ExamScore(String name, int score){
        this.name = name;
        this.score = score;
    } // end 2-arg ExamScore

    // purpose: set value of name field
    // returns: void
    // parameters: String
    public void setName(String name) {
        this.name = name;
    } // end setName

    // purpose: sets the value of score field
    // returns: void
    // parameters: int
    public void setScore(int score) {
        this.score = score;
    } // end setScore

    // purpose: gets a numerical value for score
    // returns: score
    // parameters: void
    public int getScore() {
        score = Pa9A.convertStringToInt();
        return score;
    } // end getScore

    // purpose: gets String for name
    // returns: String
    // parameters: void
    public String getName() {
        System.out.println("Enter the name of an exam and the corresponding score");
        name = input.nextLine();
        return name;
    } // end getName

    // purpose: prints out results of exam for super class
    // returns: String
    // parameters: void
    public String toString() {
        return "Exam Name: " + name + " Score: " + score;
    } // end toString
} // end ExamScore
