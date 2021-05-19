public class Main {

    public static void main(String[] args){
        double area = AreaCalculator.area(5.0);
        System.out.println(area);

        area = AreaCalculator.area(-1);
        System.out.println(area);

        area = AreaCalculator.area(5.0,4.0);
        System.out.println(area);

        area = AreaCalculator.area(-1.0,4.0);
        System.out.println(area);
    }
}
