class sampleSelectionSort {

    public static void main(String[] args) {
        int[] x = { 4, 3, 2, 1 };
        selectionSort(x);
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}