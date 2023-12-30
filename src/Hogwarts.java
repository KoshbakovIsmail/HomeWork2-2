

public class Hogwarts {
    public static void main(String[] args) {
        Student students = new Student();
        Gryffindor gryffindor = new Gryffindor();
        Slytherin slytherin = new Slytherin();
        Hufflepuff hufflepuff = new Hufflepuff();
        Ravenclaw ravenclaw = new Ravenclaw();

        Student[] student = new Student[12];
        student[0] = new Gryffindor("Gryffindor", "Harry Potter", 100, 95, 98, 99, 100);
        student[1] = new Gryffindor("Gryffindor", "Hermione Granger", 98, 94, 90, 95, 95);
        student[2] = new Gryffindor("Gryffindor", "Ron Weasley", 90, 85, 85, 85, 95);
        student[3] = new Slytherin("Slytherin", "Draco Malfoy", 75, 75, 85, 90, 90, 90, 100);
        student[4] = new Slytherin("Slytherin", "Graham Montague", 60, 65, 70, 75, 70, 85, 70);
        student[5] = new Slytherin("Slytherin", "Gregory Goyle", 70, 75, 85, 60, 65, 70, 60);
        student[6] = new Hufflepuff("Hufflepuff", "Zachariah Smith", 80, 85, 85, 90, 80);
        student[7] = new Hufflepuff("Hufflepuff", "Cedric Diggory", 75, 70, 60, 80, 55);
        student[8] = new Hufflepuff("Hufflepuff", "Justin Finch-Fletchley", 60, 60, 55, 45, 30);
        student[9] = new Ravenclaw("Ravenclaw", "Zhou Chang", 60, 65, 55, 50, 85, 60);
        student[10] = new Ravenclaw("Ravenclaw", "Padma Patil", 65, 65, 70, 75, 60, 65);
        student[11] = new Ravenclaw("Ravenclaw", "Marcus Belby", 60, 65, 55, 50, 85, 60);
        students.printStars();
        students.printListHogwartsStrudent(student);
        students.printStars();
        System.out.println(students.comparisonStudentsShcoolHogwart(student[0], student[4]));
        students.printStars();
        System.out.println(gryffindor.comparisonStudentsFacultyGryffindor(student[1], student[2]));
        students.printStars();
        System.out.println(slytherin.comparisonStudentsFacultySlytherin(student[3], student[5]));
        students.printStars();
        System.out.println(hufflepuff.comparsionStudentsFacultyHuffepuff(student[6], student[8]));
        students.printStars();
        System.out.println(ravenclaw.comparisonStudentsFacultyRavenclaw(student[9], student[11]));
    }
}










