import java.util.Arrays;

//堆排序
class Heapsort {
    void heapSort(int[] arr){

        //依次查看非叶子结点
        for (int i=arr.length/2; i>=0; i--){
            heapAdjust(arr, i, arr.length-1);
        }

        System.out.println("数组重构为大顶堆 " + Arrays.toString(arr));

        for (int i=arr.length-1; i>0; i--){
            swap(arr, 0, i);
            heapAdjust(arr, 0, i-1);
        }

    }

    //交换元素
    private void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    //将数组调整成大顶堆
    private void heapAdjust(int[] arr, int start, int end) {

        int temp = arr[start];
        int i;
        //向下查看叶子结点
        for (i=start*2+1; i<=end; i*=2+1){
            if(i<end && arr[i] < arr[i+1]){
                i++;
            }

            if(temp>arr[i]){
                break;
            }

            arr[start] = arr[i];
            start = i;
        }

        arr[start] = temp;
    }


}















