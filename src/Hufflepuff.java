public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int creativity;

    public Hufflepuff(String name, int witchcraft, int transgression, int diligence, int loyalty, int creativity) {
        super(name, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.creativity = creativity;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
