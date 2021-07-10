public class Floor {
    private double length;
    private double width;

    public Floor (double width, double length){
        if(length < 0) this.length = 0;
        else this.length = length;

        if(width < 0) this.width = 0;
        else this.width = width;
    }

    // calculates the area
    public double getArea() {
        return this.length * this.width;
    }
}
