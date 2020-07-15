public class RentableCar extends Car implements Rentable {
    Person renter;

    public RentableCar(String name, int productionYear, int numberOfSeats) {
        super(name, productionYear, numberOfSeats);
    }


    @Override
    public void rent(String firstName, String lastName, String id) {
        renter = new Person(firstName, lastName, id);
    }

    @Override
    public void handOver() {
        renter = null;
    }

    @Override
    public boolean isRent() {
        return renter != null;
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "renter=" + renter +
                ", numberOfSeats=" + numberOfSeats +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", direction='" + direction + '\'' +
                '}';
    }
}
