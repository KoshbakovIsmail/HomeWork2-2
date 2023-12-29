public class Ravenclaw extends Student {
    private int smart;
    private int mudras;
    private int witty;
    private int creativity;

    public Ravenclaw() {

    }
    public Ravenclaw(String faculty, String fullName, int magicPower, int transgressionDistance, int smart, int mudras, int witty, int creativity) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.smart = smart;
        this.mudras = mudras;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getMudras() {
        return mudras;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public String toString() {
        return super.toString() +
                ", Smart: " + getSmart() +
                ", Mudras: " + getMudras() +
                ", Witty: " + getWitty() +
                ", Creativity : " + getCreativity();
    }
}
