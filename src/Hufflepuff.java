public class Hufflepuff extends Student {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff() {

    }
    public Hufflepuff(String faculty, String fullName, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public String toString() {
        return super.toString() +
                ", Hardworking: " + getHardworking() +
                ", Loyal: " + getLoyal() +
                ", Honest: " + getHonest();
    }
}
