package Scene;

public class IllusoryUniverse extends Universe {

    private They they;

    public boolean rush_along(They they){
        this.they = they;
        return true;
    }

    public They getThey() {
        return they;
    }

    public void setThey(They they) {
        this.they = they;
    }
}
