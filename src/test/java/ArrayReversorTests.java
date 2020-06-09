import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ArrayReversorTests {
    private ArrayReversor arrayReversor;
    private ArrayFlattenerService arrayFlattenerService;

    @Before
    public void setUp() {
        arrayFlattenerService = Mockito.mock(ArrayFlattenerService.class);
        arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() {
        arrayReversor = null;
    }

    @Test
    public void shouldReverseArray() {
        Mockito.when(arrayFlattenerService.flattenArray(Mockito.any())).thenReturn(new int[]{2, 1, 4, 3, 6, 5});

        int[] expected = {2, 1, 4, 3, 6, 5};
        int[] actual = arrayReversor.reverseArray(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        Mockito.verify(arrayFlattenerService).flattenArray(Mockito.any());
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseArrayWithNULL() {

        int[] expected = null;
        int[] actual = arrayReversor.reverseArray(null);
        Assert.assertArrayEquals(expected, actual);
    }




}
