package Scene;

public class PrimaryLight {
    private int brigthness;
    private boolean isShining;

    public void addBrigthness(int lumens){
        this.brigthness += lumens;
    }

    public boolean splash(SpaceTime spaceTime){
        spaceTime.setSplashed(true);
        return spaceTime.isSplashed();
    }

    public int getBrigthness() {
        return brigthness;
    }

    public boolean isShining() {
        return isShining;
    }

    public void setShining(boolean shining) {
        isShining = shining;
    }
}
