public class InsertionSort {

    /**
     * 数组的第一位必须是哨兵
     */
    void insertionSort(int[] arr) {

        for (int i=2; i<arr.length; i++) {
            if (arr[i] < arr[i-1]){
                arr[0] = arr[i];

                int j;
                for (j=i-1; arr[j]>arr[0]; j--) {
                    arr[j+1] = arr[j];
                }

                arr[j+1] = arr[0];
            }
        }
    }
}
