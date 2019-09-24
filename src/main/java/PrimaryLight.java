public class PrimaryLight {
    private boolean nausea;
    private int brigthness;

    public void addBrigthness(int lumens){
        this.brigthness += lumens;
    }

    public void reduceBrigthness(int lumens){
        this.brigthness -= lumens;
    }

    public boolean splash(SpaceTime spaceTime){
        spaceTime.setSplashed(true);
        return spaceTime.isSplashed();
    }

}
