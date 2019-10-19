import Scene.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestScene {
    @Test
    public void testSceneObject(){
//        Реальная вселенная
        RealUniverse realUniverse = new RealUniverse();
        realUniverse.setName("RealUniverse");
        assertEquals(realUniverse.getName() , "RealUniverse");
//        выгнулась под ними
        They they = new They();
        realUniverse.bend_under(they);
        assertEquals(they.getName() , "RealUniverse");
//        оставив ощущение тошноты
        they.setNausea(true);
        assertTrue(they.isNausea());
//        а различные иллюзорные вселенные
        IllusoryUniverse illusoryUniverse = new IllusoryUniverse();
        IllusoryUniverse illusoryUniverse2 = new IllusoryUniverse();
        IllusoryUniverse illusoryUniverse3 = new IllusoryUniverse();
//         беззвучно помчались мимо, как горные козы
        illusoryUniverse.rush_along(they);
        illusoryUniverse2.rush_along(they);
        illusoryUniverse3.rush_along(they);
        assertEquals(they , illusoryUniverse.getThey());
        assertEquals(they , illusoryUniverse2.getThey());
        assertEquals(they , illusoryUniverse3.getThey());
//        Вспыхнул Первичный свет
        PrimaryLight primaryLight = new PrimaryLight();
        primaryLight.addBrigthness(9999);
        assertEquals(primaryLight.getBrigthness() , 9999);
//        расплескав пространство-время, как сметану.
        SpaceTime spaceTime = new SpaceTime();
        spaceTime.setSplashed(true);
        assertTrue(spaceTime.isSplashed());
//        Время расцвело пышным цветом
        Time time = new Time();
        time.bloom();
        assertTrue(time.isBloomed());
//        а материя сжалась в ничто
        Substance substance = new Substance();
        substance.setSize(0);
        assertEquals(substance.getSize() , 0);
//        Величайшее простое число свернулось тихонько в углу и исчезло навсегда
        GreatestPrimaryNumber greatestPrimaryNumber = new GreatestPrimaryNumber();
        greatestPrimaryNumber.collapse();
        greatestPrimaryNumber.dissapear();
        assertTrue(greatestPrimaryNumber.isCollapsed());
        assertEquals(greatestPrimaryNumber.getValue() , 0);
    }
}
