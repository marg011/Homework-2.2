public class Hogwarts{
    private String name;
    private int witchcraft;
    private int transgression;
    public Hogwarts(String name, int witchcraft, int transgression){
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }
}
