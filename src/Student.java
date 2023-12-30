
public  class Student {
    private String faculty;
    private String fullName;
    private int magicPower;
    private int transgressionDistance;

    public Student() {

    }

    public Student(String faculty, String fullName, int magicPower, int transgressionDistance) {
        this.faculty = faculty;
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public int calculateTotalMagicPower() {
        return magicPower + transgressionDistance;
    }

    public int calculateTotalPowerSpecialGryffindor() {
        return calculateTotalPowerSpecialGryffindor();
    }
    public int calculateTotalPowerSpecialSlytherin() {
        return calculateTotalPowerSpecialSlytherin();
    }

    public int calculateTotalPowerSpecialHufflepuff() {
        return calculateTotalPowerSpecialHufflepuff();
    }

    public int calculateTotalPowerSpecialRavenclaw() {
        return calculateTotalPowerSpecialRavenclaw();
    }
    public  String comparisonStudentsShcoolHogwart(Student student1, Student student2) {
        if (student1.calculateTotalMagicPower() > student2.calculateTotalMagicPower()) {
            return  student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower() +
                    ", Stronger than a student, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalMagicPower();
        } else if (student1.calculateTotalMagicPower() < student2.calculateTotalMagicPower()) {
            return student2.getFullName() + ", total power - " + student2.calculateTotalMagicPower() +
                    ", Stronger than a student, " +
                    student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower();
        } else {
            return student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower() +
                    ", and, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalMagicPower() +
                    " have equal power";
        }
    }

public void printListHogwartsStrudent(Student[] student) {
    for (int i = 0; i < student.length; i++) {
        Student students = student[i];
        System.out.println(students.toString());
    }

}
    public void printStars() {
        System.out.println("*".repeat(140));
    }
    public String toString() {
        return "Faculty: " + getFaculty() +
                ", Full Name: " + getFullName() +
                ", Magic Power: " + getMagicPower() +
                ", Transgression Distance: " + getTransgressionDistance();
    }

}
