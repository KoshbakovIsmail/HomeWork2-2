public class Hogwarts {
    public static void main(String[] args) {
       Student students = new Student();
        Gryffindor gryffindor = new Gryffindor();
        Slytherin slytherin = new Slytherin();
        Hufflepuff hufflepuff = new Hufflepuff();
        Ravenclaw ravenclaw = new Ravenclaw();
        Student[] student = {
                new Gryffindor("Gryffindor", "Harry Potter", 100, 95, 98, 99, 100),
                new Gryffindor("Gryffindor", "Hermione Granger", 98, 94, 90, 95, 95),
                new Gryffindor("Gryffindor", "Ron Weasley", 90, 85, 85, 85, 95),
                new Slytherin("Slytherin", "Draco Malfoy", 75, 75, 85, 90, 90, 90, 100),
                new Slytherin("Slytherin", "Graham Montague", 60, 65, 70, 75, 70, 85, 70),
                new Slytherin("Slytherin", "Gregory Goyle", 70, 75, 85, 60, 65, 70, 60),
                new Hufflepuff("Hufflepuff", "Zachariah Smith", 80, 85, 85, 90, 80),
                new Hufflepuff("Hufflepuff", "Cedric Diggory", 75, 70, 60, 80, 55),
                new Hufflepuff("Hufflepuff", "Justin Finch-Fletchley", 60, 60, 55, 45, 30),
                new Ravenclaw("Ravenclaw", "Zhou Chang", 60, 65, 55, 50, 85, 60),
                new Ravenclaw("Ravenclaw", "Padma Patil", 65, 65, 70, 75, 60, 65),
                new Ravenclaw("Ravenclaw", "Marcus Belby", 65, 75, 65, 85, 55, 60)
        };
        students.printListHogwartsStudent(student);
        students.calculateStudentPower(student);
    }
}










