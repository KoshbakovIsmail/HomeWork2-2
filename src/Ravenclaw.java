public class Ravenclaw extends Student {
    private int smart;
    private int mudras;
    private int witty;
    private int creativity;

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

    public int calculateTotalPowerSpecialRavenclaw() {
        return smart + mudras + witty + creativity;
    }

    public static String comparisonStudentsFacultyRavenclaw(Student student1, Student student2) {
        if (student1.calculateTotalPowerSpecialRavenclaw() > student2.calculateTotalPowerSpecialRavenclaw()) {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialRavenclaw() +
                    ", Stronger then a student, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialRavenclaw();
        } else if (student1.calculateTotalPowerSpecialRavenclaw() < student2.calculateTotalPowerSpecialRavenclaw()) {
            return student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialRavenclaw() +
                    ", Stronger then a student, " +
                    student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialRavenclaw();
        } else {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialRavenclaw() +
                    ", and, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialRavenclaw() +
                    " have egual power";
        }
    }

    public String toString() {
        return super.toString() +
                ", Smart: " + getSmart() +
                ", Mudras: " + getMudras() +
                ", Witty: " + getWitty() +
                ", Creativity : " + getCreativity();

    }
}
