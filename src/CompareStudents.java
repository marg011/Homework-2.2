public class CompareStudents {
    public void compareStudentsByWitchcraft(Hogwarts st1, Hogwarts st2){
       if (st1.getWitchcraft() > st2.getWitchcraft()){
           System.out.println(st1.getName() + " has larger witchcraft than " + st2.getName());
       } else if (st1.getWitchcraft() == st2.getWitchcraft()){
           System.out.println(st1.getName() + " and " + st2.getName() + " have equal witchcraft");
       } else System.out.println(st2.getName() + " has larger witchcraft than " + st1.getName());
    }

    public void compareStudentsByTransgression(Hogwarts st1, Hogwarts st2){
        if (st1.getTransgression() > st2.getTransgression()){
            System.out.println(st1.getName() + " has larger transgression than " + st2.getName());
        } else if (st1.getTransgression() == st2.getTransgression()){
            System.out.println(st1.getName() + " and " + st2.getName() + " have equal transgression");
        } else System.out.println(st2.getName() + " has larger transgression than " + st1.getName());
    }
}
