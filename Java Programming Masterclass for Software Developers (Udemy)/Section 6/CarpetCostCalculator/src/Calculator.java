public class Calculator {
    private Floor floor = new Floor(0,0);
    private Carpet carpet = new Carpet(0);

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}
