import Scene.Scene;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestScene {
    @Test
    public void testSceneObject(){
        Scene scene = new Scene();
        scene.play();
        assertFalse(scene.getRealUniverse().equals(null));
    }
}
