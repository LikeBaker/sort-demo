import java.util.Arrays;

class Heapsort {
    void heapSort(int[] arr){
        for (int i=(arr.length/2-1); i>=0; i--) {// 将arr够构建成一个大顶堆。每次循环，处理一个根节点
            //从第一个非叶子节点从下至上，从右至左调整结构
            HeapAdjust(arr, i, arr.length);
        }

        System.out.println("第一次调整完毕");

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = arr.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            //重新对堆进行调整
            HeapAdjust(arr, 0, i);
        }
    }

    private void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private void HeapAdjust(int[] arr, int parent, int length) {
        int temp, j;
        temp = arr[parent];//父节点
        int lChild = 2 * parent + 1;//左孩子

        while (lChild<length) {
            //右孩子
            int rChild = lChild + 1;
            //如果右孩子右节点，并且右孩子节点大于左孩子节点，则选取右孩子节点
            if (rChild<length && arr[rChild]>arr[lChild]) {
                lChild++;
            }

            //如果父节点的值已经大于孩子节点的值，则直接结束
            if (temp>arr[lChild]) {
                break;
            }

            //把孩子节点的值赋给父节点
            arr[parent] = arr[lChild];

            //选取孩子节点的左孩子节点，继续向下筛选， todo 向下筛选的过程
            parent = lChild;
            lChild = lChild*2 + 1;
        }

        arr[parent] = temp;

        System.out.println(Arrays.toString(arr));
//        for (j=2*parent; j<length; j*=2) {
//            if (j<length && arr[j]<arr[j+1]) {
//                ++j;
//            }
//
//            if (temp>=arr[j]){
//                break;
//            }
//
//            arr[parent] = arr[j];
//            parent = j;
//        }
//
//        arr[parent] = temp;
    }
}
