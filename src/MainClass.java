import java.util.Arrays;

public class MainClass {

    private static MainClass mainClass;

    public static void main(String[] args) {
        int[] arr = {0, 16, 7, 3, 20, 17, 8, 16, 7, 3, 20, 17, 8};
//        int[] arr = {1,1,1,2};//todo 快速排序里不能有重复数字吗。这里前三个数字一样，变换来变换去都是那三个数
//        QuickSort quickSort = new QuickSort();
//        quickSort.quickSort(arr, 0, arr.length-1);

//        Heapsort heapsort = new Heapsort();
//        heapsort.heapSort(arr);

//        new InsertionSort().insertionSort(arr);

//        new MergeSort().mergeSort(arr, 0, arr.length-1);

        System.out.println("result " + Arrays.toString(arr));
    }
}
