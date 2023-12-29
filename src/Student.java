

public class Student {
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

    public void calculateStudentPower(Student[] student) {
        int totalPower = 0;
        String faculty = "";
        String fullName = "";
        for (int i = 0; i < student.length; i++) {
            Student students = student[i];
            faculty = students.faculty;
            fullName = students.fullName;
            totalPower = students.getMagicPower() +
                    students.getTransgressionDistance();
            System.out.println(faculty + " " + fullName + " " + totalPower);
        }
    }

    public void comparisonPowerStudent() {

    }

    public void printListHogwartsStudent(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.toString());
        }

    }


    public String toString() {
        return "Faculty: " + getFaculty() +
                ", Full Name: " + getFullName() +
                ", Magic Power: " + getMagicPower() +
                ", Transgression Distance: " + getTransgressionDistance();
    }

}
