class normalSearch {

    public static void main(String[] args) {
        int[] x = { 5, 4, 1, 10, 9 };
       System.out.println(normalsearch(x,5));
    }

    public static int normalsearch(int[] a,int value) {
        int i = 0;
        while (i < a.length && a[i] != value) {
            i++;
        }
        if (i >= a.length){
            return -1;
        }
        return i; // return ตำแหน่งที่หาเจอ 
        

        

    }
}