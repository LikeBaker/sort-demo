
public class ShellSort {

    /**
     * 希尔排序
     */
    int[] shellSort(int[] arr) {

        int i, j;
        int increment = arr.length;
        do {
            increment = increment/3 + 1;
            for (i = increment+1; i<arr.length; i++) {
                if (arr[i] < arr[i-increment]) {
                    int temp = arr[i];//todo 这里必须设置一个临时变量
                    for (j = i-increment; j>=0 && arr[i]<arr[j]; j-=increment) {
                        arr[j+increment] = arr[j];
                    }

                    arr[j+increment] = temp;
                }
            }

        } while (increment>1);

        return arr;
    }
}
