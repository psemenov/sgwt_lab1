package Scene;

public class PrimaryLight {
    private int brightness;
    private boolean isShining;

    public void addBrightness(int lumens){
        this.brightness += lumens;
    }

    public boolean splash(SpaceTime spaceTime){
        spaceTime.setSplashed(true);
        return spaceTime.isSplashed();
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isShining() {
        return isShining;
    }

    public void setShining(boolean shining) {
        isShining = shining;
    }
}
