package ca.bytetube._03_method;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(new int[]{1, 3, 4, 2, 5}));
    }

    /**
     * {1,3,4,2,5}
     * 1:null
     * 3:1
     * 4:1,3
     * 2:1
     * 5:1,3,4,2
     * sum = 1+1+3+1+1+3+4+2=16=4*1 + 2*3 + 1*4 + 1*2 =
     */
    public static int sum(int[] arr) {
//        int sum = 0;
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] < arr[i]) {
//                    sum += arr[j];
//                }
//            }
//        }
//        return sum;

        return mergeSort(arr);
    }

    private static int mergeSort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);

    }

    private static int mergeSort(int[] arr, int l, int r) {
        if (l == r) return 0;
        int mid = (l + r) >> 1;
        return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r) + merge(arr, l, mid, r);

    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int p1 = l;
        int p2 = mid + 1;
        int index = 0;
        int sum = 0;
        int[] help = new int[r - l + 1];
        while (p1 <= mid && p2 <= r) {
            sum += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) help[index++] = arr[p1++];
        while (p2 <= r) help[index++] = arr[p2++];
        for (int i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }

        return sum;
    }
}
