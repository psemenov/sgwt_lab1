import Scene.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BTreeTest {
    private BTree bt;
    private int[] inputValues;// = new int[]{1, 2, 3, 4, 5};
    private String[] logs;
    private String[] expectedOutput;// = new String[inputValues.length];
    private int expectedTreeHeight;

    @Before
    public void setUp() {
        inputValues = new int[]{1, 2, 3, 4, 5, 5, 4, 1};

        expectedOutput = new String[]{
                "[h0 1]",
                "[h0 1][h0 2]",
                "[h0 1][h0 2][h0 3]",
                "(h0 1)[h1 1][h1 2](h0 3)[h1 3][h1 4]",
                "(h0 1)[h1 1][h1 2](h0 3)[h1 3][h1 4][h1 5]",
                "(h0 1)[h1 1][h1 2](h0 3)[h1 3][h1 4](h0 5)[h1 5][h1 5]",
                "(h0 1)[h1 1][h1 2](h0 3)[h1 3][h1 4][h1 4](h0 5)[h1 5][h1 5]",
                "(h0 1)[h1 1][h1 1][h1 2](h0 3)[h1 3][h1 4][h1 4](h0 5)[h1 5][h1 5]"
        };

        logs = new String[inputValues.length];
        expectedTreeHeight = 2;

        bt = new BTree();
        for (int i = 0; i < inputValues.length; i++) {
            bt.put(inputValues[i]);
            logs[i] = bt.outputLog();
        }
    }

    @Test
    public void testPut() {

        for (int i = 0; i < inputValues.length; i++) {
            System.out.println("Step: " + (i+1) + ", value: " + inputValues[i]);
            System.out.println("Expected tree state: " + expectedOutput[i]);
            System.out.println("Actual tree state: " + logs[i]);
            System.out.println();
            assertEquals(expectedOutput[i], logs[i]);
        }
    }

    @Test
    public void testSize() {
        System.out.println("Expected tree size: " + inputValues.length);
        System.out.println("Actual tree size: " + bt.size());
        assertEquals(bt.size(), inputValues.length);
    }

    @Test
    public void testHeight() {
        System.out.println("Expected tree height: " + expectedTreeHeight);
        System.out.println("Actual tree height: " + bt.height());
        assertEquals(expectedTreeHeight, bt.height());
    }

    @Test
    public void testGet1() {
        Integer x = 5;
        assertEquals(x, bt.get(x));
    }

    @Test
    public void testGet2() {
        Integer x = 999;
        assertEquals(x, bt.get(x));
    }

}