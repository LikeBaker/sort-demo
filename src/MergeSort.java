import java.util.Arrays;

class MergeSort {
    void mergeSort(int[] arr, int[] arr2, int low, int high) {

        System.out.println("mergeSort: low " + low + " high " + high);
        if (low == high) {
            arr2[low] = arr[low];
            System.out.println("merge " + Arrays.toString(arr2));
        } else  {
            int mid = (high + low) / 2;
            int[] arr3;
            arr3 = new int[9];
            mergeSort(arr, arr3, low, mid);
            mergeSort(arr, arr3, mid + 1, high);
            //左右归并
            System.out.println("merge " + Arrays.toString(arr3) + " low-" + low + " mid-"+mid + " high "+ high);
            merge(arr3, arr2, low, mid, high);//将arr3[low..mid]和arr3[mid+1...high]归并到arr2
            System.out.println("merge result " + Arrays.toString(arr2));
        }
    }

    private void merge(int[] arr, int[] arr2, int low, int mid, int high) {
        int i;
        int j;
        int k;

        for (k = low, i = low, j = mid + 1; i <= mid && j <= high; k++) {
            if (arr[i] < arr[j]) {
                arr2[k] = arr[i++];
            } else {
                arr2[k] = arr[j++];
            }
        }

        //todo
        int l;
        if (i <= mid) {
            for (l = 0; l <= mid - i; l++) {
                arr2[k + l] = arr[i + l];
            }
        }

        //2018.07.10-2038.07.10
        if (j <= high) {
            for (l = 0; l <= high - j; j++) {
                arr2[k + l] = arr[j + l];
            }
        }
    }
}


