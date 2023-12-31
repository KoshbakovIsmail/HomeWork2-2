public class Hufflepuff extends Student {
    private int hardworking;
    private int loyal;
    private int honest;

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

    public int calculateTotalPowerSpecialHufflepuff() {
        return hardworking + loyal + honest;
    }

    public static String comparsionStudentsFacultyHuffepuff(Student student1, Student student2) {
        if (student1.calculateTotalPowerSpecialHufflepuff() > student2.calculateTotalPowerSpecialHufflepuff()) {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialHufflepuff() +
                    ", Stronger then a student, " +
                    student2.getFullName() + ", total power -  " + student2.calculateTotalPowerSpecialHufflepuff();
        } else if (student1.calculateTotalPowerSpecialHufflepuff() < student2.calculateTotalPowerSpecialHufflepuff()) {
            return student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialHufflepuff() +
                    ", Stronger then a student, " +
                    student1.getFullName() + ", total power -  " + student1.calculateTotalPowerSpecialHufflepuff();
        } else {
            return student1.getFullName() + ", total power - " + student1.calculateTotalPowerSpecialHufflepuff() +
                    ", and, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalPowerSpecialHufflepuff() +
                    " have egual power";
        }
    }

    public String toString() {
        return super.toString() +
                ", Hardworking: " + getHardworking() +
                ", Loyal: " + getLoyal() +
                ", Honest: " + getHonest();
    }
}
