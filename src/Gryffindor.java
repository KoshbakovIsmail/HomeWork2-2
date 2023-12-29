public class Gryffindor extends Student {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor() {

    }

    public Gryffindor(String facult, String fullName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(facult, fullName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public String toString() {
        return super.toString() +
                ", Nobility: " + getNobility() +
                ", Honor: " + getBravery() +
                ", Bravery: " + getBravery();
    }

}
