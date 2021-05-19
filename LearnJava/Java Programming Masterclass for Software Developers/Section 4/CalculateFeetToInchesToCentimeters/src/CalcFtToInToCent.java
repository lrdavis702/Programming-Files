public class CalcFtToInToCent {

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double cent = inches * 2.54;
            cent =+ feet * 12 * 2.54;
            System.out.println(cent + " centimeters.");
            return cent;
        }
        else return -1;
    }
        public static double calFeetAndInchesToCentimeters(double inches){
            if (inches <= 0) return (double) -1;
            else {
                double feet = inches / 12;
                double remainder = inches % 12;
                System.out.print((int)feet + " feet and " + (int)remainder + " inches equals ");
                return calFeetAndInchesToCentimeters(feet, remainder);
            }
        }
    }
