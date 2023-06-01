public class CompareStudentsByFaculty {

    public void compareStudents(Gryffindor st1, Gryffindor st2) {
        int rank1 = st1.getWitchcraft() + st1.getTransgression() + st1.getNobility()
                + st1.getHonor() + st1.getBravery();
        int rank2 = st2.getWitchcraft() + st2.getTransgression() + st2.getNobility()
                + st2.getHonor() + st2.getBravery();

        if (rank1 > rank2){
            System.out.println(st1.getName() + " better Gryffindor student than " + st2.getName());
        } else if (rank1 == rank2) {
            System.out.println(st1.getName() + " and " + st2.getName() + " are equal Gryffindor students");

        } else {
            System.out.println(st2.getName() + "better Gryffindor student than " + st1.getName());
        }

    }

    public void compareStudents(Slytherin st1, Slytherin st2) {
        int rank1 = st1.getWitchcraft() + st1.getTransgression() + st1.getCunning()
                + st1.getDecisiveness() + st1.getAmbition() + st1.getResourcefulness() + st1.getPowerLust();
        int rank2 = st2.getWitchcraft() + st2.getTransgression() + st2.getCunning()
                + st2.getDecisiveness() + st2.getAmbition() + st2.getResourcefulness() + st2.getPowerLust();

        if (rank1 > rank2){
            System.out.println(st1.getName() + " better Slytherin student than " + st2.getName());
        } else if (rank1 == rank2) {
            System.out.println(st1.getName() + " and " + st2.getName() + " are equal Slytherin students");

        } else {
            System.out.println(st2.getName() + "better Slytherin student than " + st1.getName());
        }
    }

    public void compareStudents(Ravenclaw st1, Ravenclaw st2) {
        int rank1 = st1.getWitchcraft() + st1.getTransgression() + st1.getIntelligence()
                + st1.getWisdom() + st1.getWit();
        int rank2 = st2.getWitchcraft() + st2.getTransgression() + st2.getIntelligence()
                + st2.getWisdom() + st2.getWit();

        if (rank1 > rank2){
            System.out.println(st1.getName() + " better Ravenclaw student than " + st2.getName());
        } else if (rank1 == rank2) {
            System.out.println(st1.getName() + " and " + st2.getName() + " are equal Ravenclaw students");

        } else {
            System.out.println(st2.getName() + "better Ravenclaw student than " + st1.getName());
        }
    }

    public void compareStudents(Hufflepuff st1, Hufflepuff st2) {
        int rank1 = st1.getWitchcraft() + st1.getTransgression() + st1.getDiligence()
                + st1.getLoyalty() + st1.getCreativity();
        int rank2 = st2.getWitchcraft() + st2.getTransgression() + st2.getDiligence()
                + st2.getLoyalty() + st2.getCreativity();

        if (rank1 > rank2){
            System.out.println(st1.getName() + " better Hufflepuff student than " + st2.getName());
        } else if (rank1 == rank2) {
            System.out.println(st1.getName() + " and " + st2.getName() + " are equal Hufflepuff students");

        } else {
            System.out.println(st2.getName() + "better Hufflepuff student than " + st1.getName());
        }
    }
}
