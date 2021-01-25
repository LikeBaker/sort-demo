/**
 * 快速排序
 */
public class QuickSort {
    public void quickSort(int[] arr, int left, int right){
        if (left<right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot);
            quickSort(arr, pivot+1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        return sort(arr, left, right);
    }

    private int sort(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= pivot) {//pivot 写成 arr[pivot]
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = pivot;//todo 最后为什么返回arr[left]

        return left;
    }
}
