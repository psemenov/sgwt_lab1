import Scene.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestScene {
    private RealUniverse realUniverse;
    private They they;
    private IllusoryUniverse illusoryUniverse;
    private IllusoryUniverse illusoryUniverse2;
    private IllusoryUniverse illusoryUniverse3;
    private PrimaryLight primaryLight;
    private SpaceTime spaceTime;
    private Time time;
    private Substance substance;
    private GreatestPrimaryNumber greatestPrimaryNumber;

//  Setting up scene
    @Before
    public void setUp(){
        realUniverse = new RealUniverse();
        they = new They();
        illusoryUniverse = new IllusoryUniverse();
        illusoryUniverse2 = new IllusoryUniverse();
        illusoryUniverse3 = new IllusoryUniverse();
        primaryLight = new PrimaryLight();
        spaceTime = new SpaceTime();
        time = new Time();
        substance = new Substance();
        greatestPrimaryNumber = new GreatestPrimaryNumber();
    }

    @Test
    public void universe_isReal() {
//        Реальная вселенная
        assertEquals(realUniverse.getClass().getSimpleName(), "RealUniverse");
    }

    @Test
    public void universe_Bend() {
//        выгнулась под ними
        realUniverse.setName(realUniverse.getClass().getSimpleName());
        realUniverse.bend_under(they);
        assertEquals("RealUniverse" , they.getName());
    }

    @Test
    public void nausea_Left() {
//        оставив ощущение тошноты
        assertFalse(they.isNausea());
        realUniverse.set_nausea(they);
        assertTrue(they.isNausea());
    }

    @Test
    public void different_IllusoryUniverses() {
//        а различные иллюзорные вселенные
        assertNotEquals(illusoryUniverse , illusoryUniverse2);
        assertNotEquals(illusoryUniverse , illusoryUniverse3);
        assertNotEquals(illusoryUniverse2 , illusoryUniverse3);
    }

    @Test
    public void illusoryUniverse_rushAlongThey() {
//         беззвучно помчались мимо, как горные козы
        illusoryUniverse.rush_along(they);
        illusoryUniverse2.rush_along(they);
        illusoryUniverse3.rush_along(they);
        assertEquals(they, illusoryUniverse.getThey());
        assertEquals(they, illusoryUniverse2.getThey());
        assertEquals(they, illusoryUniverse3.getThey());
    }

    @Test
    public void primaryLight_Flashed() {
//        Вспыхнул Первичный свет
        primaryLight.setShining(true);
        assertTrue(primaryLight.isShining());
        primaryLight.addBrigthness(9999);
        assertEquals(9999 , primaryLight.getBrigthness());
    }

    @Test
    public void spaceTime_Splashed() {
//        расплескав пространство-время, как сметану.
        assertFalse(spaceTime.isSplashed());
        primaryLight.splash(spaceTime);
        assertTrue(spaceTime.isSplashed());
    }

    @Test
    public void time_Bloomed() {
//        Время расцвело пышным цветом
        assertFalse(time.isBloomed());
        time.bloom();
        assertTrue(time.isBloomed());
    }

    @Test
    public void substance_Shrink() {
//        а материя сжалась в ничто
        assertTrue(substance.getSize() > 0);
        substance.setSize(0);
        assertEquals(0 , substance.getSize());
    }

    @Test
    public void greatestPrimaryNumber_Collapse() {
//        Величайшее простое число свернулось тихонько в углу
        greatestPrimaryNumber.collapse();
        assertTrue(greatestPrimaryNumber.isCollapsed());
    }

    @Test
    public void greatestPrimaryNumber_Disappeared() {
//            и исчезло навсегда
        greatestPrimaryNumber.disappear();
        assertEquals(0 , greatestPrimaryNumber.getValue() );
    }

}
