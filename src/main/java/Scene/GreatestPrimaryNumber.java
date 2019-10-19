package Scene;

public class GreatestPrimaryNumber extends PrimaryNumber {
    private boolean collapsed = false;

    public void disappear(){
        this.setValue(0);
    }

    public void collapse(){
        this.collapsed = true;
    }

    public boolean isCollapsed() {
        return collapsed;
    }


}
