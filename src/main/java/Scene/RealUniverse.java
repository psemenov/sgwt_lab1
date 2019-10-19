package Scene;

public class RealUniverse extends Universe {

    public void setName(String name){
        this.name = name;
    }

    public void bend_under(They they){
        they.setName(this.name);
    }

    public void set_nausea(They they){
        they.setNausea(true);
    }
}
