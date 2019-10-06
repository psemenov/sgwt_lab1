public class Scene {
    RealUniverse realUniverse;
    IllusoryUniverse illusoryUniverse;
    They they;
    PrimaryLight primaryLight;
    SpaceTime spaceTime;
    Time time;
    GreatestPrimaryNumber greatestPrimaryNumber;
    Substance substance;

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
}
