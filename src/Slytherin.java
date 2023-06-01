public class Slytherin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, int witchcraft, int transgression, int cunning, int decisiveness, int ambition, int resourcefulness, int powerLust) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }
}
