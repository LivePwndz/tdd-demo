import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTests {
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() {
        arrayFlattener = new ArrayFlattener();
    }

    @After public void tearDown(){
        arrayFlattener = null;
    }

    @Test
    public void shouldFlattenArray() {
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = arrayFlattener.flattenArray(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFlattenArrayWithAssignmentExample() {
        int[] expected = {1, 3, 0, 4, 5, 9};
        int[] actual = arrayFlattener.flattenArray(new int[][]{{1, 3}, {0}, {4, 5, 9}});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFlattenArrayWithNULL() {
        int[] actual = arrayFlattener.flattenArray(null);
        Assert.assertArrayEquals(null, actual);
    }
}
