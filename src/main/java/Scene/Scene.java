package Scene;

public class Scene {
   private RealUniverse realUniverse;
   private IllusoryUniverse illusoryUniverse;
   private They they;
   private PrimaryLight primaryLight;
   private SpaceTime spaceTime;
   private Time time;
   private GreatestPrimaryNumber greatestPrimaryNumber;
   private Substance substance;

    public void play(){
        realUniverse = new RealUniverse();
        they = new They();
        realUniverse.bend_under(they);
        they.setNausea(true);
        illusoryUniverse = new IllusoryUniverse();
        illusoryUniverse.rush_along(they);
        primaryLight = new PrimaryLight();
        primaryLight.addBrigthness(9999);
        spaceTime = new SpaceTime();
        spaceTime.setSplashed(true);
        time = new Time();
        time.bloom();
        substance = new Substance();
        substance.setSize(0);
        greatestPrimaryNumber = new GreatestPrimaryNumber();
        greatestPrimaryNumber.collapse();
        greatestPrimaryNumber.dissapear();
    }

    public RealUniverse getRealUniverse(){
        return realUniverse;
    }

}
