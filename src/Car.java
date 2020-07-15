public class Car extends Vehicle {
    int numberOfSeats;

    public Car(String name, int productionYear, int numberOfSeats) {
        super(name, productionYear);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", direction='" + direction + '\'' +
                '}';
    }
}
