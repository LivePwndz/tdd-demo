public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] ints) {
        if(ints == null){
            return null;
        }
        for (int[] arr : ints) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }

        return arrayFlattenerService.flattenArray(ints);
    }
}
