package Scene;

public class RealUniverse extends Universe {



    public boolean bend_under(They they){
        they.setName(this.name);
        return true;
    }

    public boolean set_nausea(They they){
        they.setNausea(true);
        return true;
    }
}
