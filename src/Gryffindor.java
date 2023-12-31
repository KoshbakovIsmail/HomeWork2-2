public class Gryffindor extends Student {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String faculty, String fullName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(faculty, fullName, magicPower, transgressionDistance);
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

    public int calculateTotalPowerSpecialGryffindor() {
        return nobility + honor + bravery;
    }

    public static String comparisonStudentsFacultyGryffindor(Student student1, Student student2) {
        if (student1.calculateTotalPowerSpecialGryffindor() > student2.calculateTotalPowerSpecialGryffindor()) {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialGryffindor() +
                    ", Stronger than a student, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialGryffindor();
        } else if (student1.calculateTotalPowerSpecialGryffindor() < student2.calculateTotalPowerSpecialGryffindor()) {
            return student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialGryffindor() +
                    ", Stronger than a student, " +
                    student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialGryffindor();
        } else {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialGryffindor() +
                    ", and, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialGryffindor() +
                    " have equal power";
        }
    }

    public String toString() {
        return super.toString() +
                ", Nobility: " + getNobility() +
                ", Honor: " + getBravery() +
                ", Bravery: " + getBravery();

    }

}
