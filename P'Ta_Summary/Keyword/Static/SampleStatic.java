class Count {
    private int count = 0;

    public void plus() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Count2 {
    private static int count = 0; // ไว้แชร์ตัวแปรร่วมกัน

    public void plus() {
        count++;
    }

    public  int getCount() {
        return count;
    }
}