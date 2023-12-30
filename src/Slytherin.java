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

    public int calculateTotalPowerSpecialSlytherin() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public String comparisonStudentsFacultySlytherin(Student student1, Student student2) {
        if (student1.calculateTotalPowerSpecialSlytherin() > student2.calculateTotalPowerSpecialSlytherin()) {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialSlytherin() +
                    ", Stronger then a student, " +
                    student2.getFullName() + ", total power -  " + student2.calculateTotalPowerSpecialSlytherin();
        } else if (student1.calculateTotalPowerSpecialSlytherin() < student2.calculateTotalPowerSpecialGryffindor()) {
            return student2.getFullName() + ",  total power - " + student2.calculateTotalPowerSpecialSlytherin() +
                    ", Stronger then a student, " +
                    student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialSlytherin();
        } else {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialSlytherin() +
                    ", and, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialSlytherin() +
                    " have egual power ";
        }
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
