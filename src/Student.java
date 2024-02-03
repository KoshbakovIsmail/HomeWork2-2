
public class Student {
    private String faculty;
    private String fullName;
    private int magicPower;
    private int transgressionDistance;

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

    public static String comparisonStudentsShcoolHogwart(Student student1, Student student2) {
        if (student1.calculateTotalMagicPower() > student2.calculateTotalMagicPower()) {
            return student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower() +
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

    public static void printListStudentHogwarts(Student student1, Student student2, Student student3,
                                                Student student4, Student student5, Student student6,
                                                Student student7, Student student8, Student student9,
                                                Student student10, Student student11, Student student12
                                                ) {
        System.out.println(" ".repeat(28) + "**********" + " ".repeat(10) + "List of Hogwarts School students" + " ".repeat(10) + "**********");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());
        System.out.println(student7.toString());
        System.out.println(student8.toString());
        System.out.println(student9.toString());
        System.out.println(student10.toString());
        System.out.println(student11.toString());
        System.out.println(student12.toString());
    }

    public static void printStars() {
        System.out.println("*".repeat(140));
    }

    public  String toString() {
        return "Faculty: " + getFaculty() +
                ", Full Name: " + getFullName() +
                ", Magic Power: " + getMagicPower() +
                ", Transgression Distance: " + getTransgressionDistance();
    }

}
