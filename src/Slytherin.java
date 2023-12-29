public class Slytherin extends Student {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin() {

    }
    public Slytherin(String faculty, String fullName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }


    public String toString() {
        return super.toString() +
                ", Cunning: " + getCunning() +
                ", Determination: " + getDetermination() +
                ", Ambition: " + getAmbition() +
                ", Resourcefulness: " + getResourcefulness() +
                ", Thirst For Power: " + getThirstForPower();
    }
}
