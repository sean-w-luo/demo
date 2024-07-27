package slotcarracingvideogame;

public class Player {
	private String name;
    private Car car;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void chooseCar(Car car) {
        this.car = car;
    }
}
