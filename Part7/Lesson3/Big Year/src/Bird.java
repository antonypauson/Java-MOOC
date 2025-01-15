public class Bird {
    private String birdName;
    private String latinName;
    private int observations;

    public Bird(String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String toString() {
        return birdName + " (" + latinName + "): " + observations + " observations";
    }

    public String getBirdName() {
        return birdName;
    }

    public void incrementObservation() {
        this.observations++;
    }
}
