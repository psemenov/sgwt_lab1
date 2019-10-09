package Scene;

public class GreatestPrimaryNumber extends PrimaryNumber {
    private boolean collapsed;

    public void dissapear(){
        this.setValue(0);
    }

    public void collapse(){
        this.collapsed = true;
    }
}
