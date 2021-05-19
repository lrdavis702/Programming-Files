public class StudentScore extends ExamScore{

    // declare variables
    private int idNum;


    // purpose: A no-arg constructor to initialize the instance variable to a
    // value of your choice.
    // returns: void
    // parameters: void
    StudentScore(){
        idNum = 1000;
    } // end no-arg StudentScore

    // purpose: A Constructor with 1 parameter to initialize the instance
    // variables to the argument indicated in the parameter list of the
    // constructor.
    // returns: void
    // parameters: int
    StudentScore(int idNum){
        this.idNum = idNum;
    } // end 1-arg StudentScore

    // purpose: sets student ID, sets name to "FINAL EXAM," sets score to
    // random number between 1 and 100
    // returns: void
    // parameters: int
    public void setIdNum(int idNum) {
        this.idNum = idNum;
        setName("FINAL EXAM");
        setScore((int)(Math.random() * (100 - 1)) + 1);
    } // end setIdNum

    // purpose: gets numerical ID number from keyboard input, gets name & score
    // returns: idNum
    // parameters: void
    public int getIdNum() {
        System.out.println("Enter the identification number for a student");
        idNum = Pa9A.convertStringToInt();
        getName();
        getScore();
        return idNum;
    } // end getIDnum

    // purpose: prints output for super and StudentScore
    // returns: string
    // parameters: void
    public String toString() {
        return super.toString() + " Identification Number: " + idNum;
    } // end toString
} // end StudentScore
