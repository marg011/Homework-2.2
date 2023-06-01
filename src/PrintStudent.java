public class PrintStudent {
    public void print(Gryffindor student){
        System.out.println("Student " + student.getName() + " - witchcraft: " + student.getWitchcraft()
                + ", transgression: " + student.getTransgression()
                + ", nobility: " + student.getNobility()
                + ", honor: " + student.getHonor()
                + ", bravery: " + student.getBravery()
        );
    }

    public void print(Ravenclaw student){
        System.out.println("Student " + student.getName() + " - witchcraft: " + student.getWitchcraft()
                + ", transgression: " + student.getTransgression()
                + ", intelligence: " + student.getIntelligence()
                + ", wisdom: " + student.getWisdom()
                + ", wit: " + student.getWit()
                + ", creativity: " + student.getCreativity()
        );
    }

    public void print(Hufflepuff student){
        System.out.println("Student " + student.getName() + " - witchcraft: " + student.getWitchcraft()
                + ", transgression: " + student.getTransgression()
                + ", diligence: " + student.getDiligence()
                + ", loyalty: " + student.getLoyalty()
                + ", creativity: " + student.getCreativity()
        );
    }

    public void print(Slytherin student){
        System.out.println("Student " + student.getName() + " - witchcraft: " + student.getWitchcraft()
                + ", transgression: " + student.getTransgression()
                + ", cunning: " + student.getCunning()
                + ", decisiveness: " + student.getDecisiveness()
                + ", ambition: " + student.getAmbition()
                + ", resourcefulness: " + student.getResourcefulness()
                + ", powerLust: " + student.getPowerLust()
        );
    }
}
