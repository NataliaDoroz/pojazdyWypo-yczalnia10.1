public class Vehicle implements Moveable {
    String name;
    int productionYear;
    String direction;

    public Vehicle(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public void turnLeft() {
        direction = "prawo";
    }

    @Override
    public void turnRight() {
        direction = "lewo";
    }

    @Override
    public void goFoward() {
        direction = "prosto";
    }

    @Override
    public void goBack() {
        direction = "tył";
    }
}
