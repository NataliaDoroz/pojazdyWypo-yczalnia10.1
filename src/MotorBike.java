public class MotorBike extends Vehicle {
    int speedLimit;

    public MotorBike(String name, int productionYear, int speedLimit) {
        super(name, productionYear);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "speedLimit=" + speedLimit +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
