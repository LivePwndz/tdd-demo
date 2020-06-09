import java.util.Arrays;

public class ArrayFlattener implements ArrayFlattenerService {

    @Override
    public int[] flattenArray(int[][] ints) {
        if(ints == null)
            return null;
        return Arrays.stream(ints).flatMapToInt(Arrays::stream).toArray();
    }
}
