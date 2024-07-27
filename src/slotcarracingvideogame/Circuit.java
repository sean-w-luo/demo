package slotcarracingvideogame;

public class Circuit {
	private String layout;
    private double size;
    private int racingTime;
    private int numberOfTracks;

    public Circuit(String layout, double size, int racingTime, int numberOfTracks) {
        this.layout = layout;
        this.size = size;
        this.racingTime = racingTime;
        this.numberOfTracks = numberOfTracks;
    }

    public String getLayout() {
        return layout;
    }

    public double getSize() {
        return size;
    }

    public int getRacingTime() {
        return racingTime;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void selectCircuit() {
        // Logic to select a circuit
        System.out.println("Circuit selected: " + layout);
    }
}
