class binarySearch {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        System.out.println(binarysearch(x,5));
    }

    public static int binarysearch(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }
        return -1;
    }

}