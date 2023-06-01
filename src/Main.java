public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 77,67,67, 67,87);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger ", 80,68,78,88,70);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50, 69, 70, 70, 40);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 70, 54, 70, 80, 57, 67, 100);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 45, 67, 56, 48, 22, 67, 10);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 46, 66, 54, 45, 45, 32, 12);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 34, 56, 78, 95, 26);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 70, 80,89,90, 67);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 55, 64, 77, 53, 31);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 45, 64, 77, 63, 54, 22);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",69, 80, 89, 87, 65, 48);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 42, 45, 62, 12, 34, 51);

        PrintStudent printStudent = new PrintStudent();
        printStudent.print(harryPotter);
        printStudent.print(dracoMalfoy);

        CompareStudentsByFaculty compareStudentsByFaculty = new CompareStudentsByFaculty();
        compareStudentsByFaculty.compareStudents(harryPotter, hermioneGranger);
        compareStudentsByFaculty.compareStudents(dracoMalfoy, gregoryGoyle);

        CompareStudents compareStudents = new CompareStudents();
        compareStudents.compareStudentsByWitchcraft(harryPotter, dracoMalfoy);
        compareStudents.compareStudentsByTransgression(hermioneGranger, marcusBelby);

    }
}