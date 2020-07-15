public class MainWypożyczalnia {
    public static void main(String[] args) {
        RentableCar rentableCar1 = new RentableCar("Skoda", 2020, 5);
        RentableCar rentableCar2 = new RentableCar("Ford", 2010, 5);
        RentableCar[] rentableCars = {rentableCar1, rentableCar2};
        System.out.println(rentableCar1.toString());
        System.out.println(rentableCar2.toString());
        rentableCar1.rent("aa", "as", "1wada");
        System.out.println(rentableCar1.toString());
        rentableCar1.handOver();
        System.out.println(rentableCar1.toString());
    }
}
