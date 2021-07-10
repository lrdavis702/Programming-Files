package udemy;

public class Main {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.toString());
        VipCustomer person2 = new VipCustomer("Renee", 75000);
        System.out.println(person2.toString());
        VipCustomer person3 = new VipCustomer("Davis", 10000, "renee@default.com");
        System.out.println(person3.toString());
    }
}
