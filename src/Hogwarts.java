
public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Gryffindor", "Harry Potter", 100, 95, 98, 99, 100);
        Gryffindor hermioneGranger = new Gryffindor("Gryffindor", "Hermione Granger", 98, 94, 90, 95, 95);
        Gryffindor ronWeasly = new Gryffindor("Gryffindor", "Ron Weasley", 90, 85, 85, 85, 95);
        Slytherin dracoMalfoy = new Slytherin("Slytherin", "Draco Malfoy", 75, 75, 85, 90, 90, 90, 100);
        Slytherin grahamMontague = new Slytherin("Slytherin", "Graham Montague", 60, 65, 70, 75, 70, 85, 70);
        Slytherin gregoryGoyle = new Slytherin("Slytherin", "Gregory Goyle", 70, 75, 85, 60, 65, 70, 60);
        Hufflepuff zachariahSmith = new Hufflepuff("Hufflepuff", "Zachariah Smith", 80, 85, 85, 90, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Hufflepuff", "Cedric Diggory", 75, 70, 60, 80, 55);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Hufflepuff", "Justin Finch-Fletchley", 60, 60, 55, 45, 30);
        Ravenclaw zhouChang = new Ravenclaw("Ravenclaw", "Zhou Chang", 60, 65, 55, 50, 85, 60);
        Ravenclaw padmaPatil = new Ravenclaw("Ravenclaw", "Padma Patil", 65, 65, 70, 75, 60, 65);
        Ravenclaw marcusBelby = new Ravenclaw("Ravenclaw", "Marcus Belby", 60, 65, 55, 50, 85, 60);
        Student.printStars();
        Student.printListStudentHogwarts(harryPotter,hermioneGranger,ronWeasly,
                dracoMalfoy, grahamMontague,gregoryGoyle,
                zachariahSmith, cedricDiggory,justinFinchFletchley,
                zhouChang, padmaPatil, marcusBelby);
        Student.printStars();
        System.out.println(Student.comparisonStudentsShcoolHogwart(harryPotter, dracoMalfoy));
        Student.printStars();
        System.out.println(Gryffindor.comparisonStudentsFacultyGryffindor(hermioneGranger, ronWeasly));
        Student.printStars();
        System.out.println(Slytherin.comparisonStudentsFacultySlytherin(grahamMontague, gregoryGoyle));
        Student.printStars();
        System.out.println(Hufflepuff.comparsionStudentsFacultyHuffepuff(cedricDiggory, justinFinchFletchley));
        Student.printStars();
        System.out.println(Ravenclaw.comparisonStudentsFacultyRavenclaw(zhouChang, marcusBelby));
        Student.printStars();

    }
}










