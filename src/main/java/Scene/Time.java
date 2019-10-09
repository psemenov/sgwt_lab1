package Scene;

public class Time {
    private boolean bloomed;

    public boolean bloom(){
        return this.bloomed = true;
    }

    public boolean isBloomed() {
        return bloomed;
    }

    public void setBloomed(boolean bloomed) {
        this.bloomed = bloomed;
    }
}
