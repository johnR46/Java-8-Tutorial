interface Measureable {
    public abstract int getMeasure(); // สิ่งที่สามารถวัดค่าได้มันก็คืนค่ามาได้ แปลเงี้ย
}

class Tester {
    public static void main(String[] args) {

        DataSet data = new DataSet(); // สร้าง object

        data.add(new BankAccount(1000));
        data.add(new BankAccount(2000));

        int avg = data.getAverage();

        BankAccount maxBank = (BankAccount) data.getMax(); // wtf ต้นทางอธิบายว่า มันเป็น Measureable
                                                           // ก็เลยต้องแปลงกลับเป็น BankAccount ก่อน จับเท่ากับ maxBank

        System.out.println("Bank :" + avg);
        System.out.println("max :" + maxBank.getMeasure());

        DataSet data2 = new DataSet();

        data2.add(new Coin(5));
        data2.add(new Coin(10));

        int avg2 = data2.getAverage();

        Coin maxCoin = (Coin) data2.getMax();

        System.out.println("Coin :" + avg2);
        System.out.println("max :" + maxCoin.getMeasure());

    }
}

class BankAccount implements Measureable {
    private int balance;

    public BankAccount(int inAmount) {
        balance = inAmount;
    }

    /*
     * public static void main(String[] args) {
     * 
     * 
     * DataSet d = new DataSet(); BankAccount b1 = new BankAccount(2); BankAccount
     * b2 = new BankAccount(4);
     * 
     * d.add(b1); d.add(b2);
     * 
     * System.out.println(d.getAverage());
     * System.out.println(d.getMax().getBalance());
     * 
     * 
     * }
     * 
     *
     * 
     * /* public int getBalance() { return balance; }
     */

    public int getMeasure() {
        return balance;
    }

}

class Coin implements Measureable {
    private int value;

    public Coin(int inValue) {
        value = inValue;
    }

    /*
     * public int getValue() { return value; }
     */

    public int getMeasure() {
        return value;
    }
}

class DataSet {
    private int count;
    private int sum;
    private Measureable max; // max เก็บเป็น object แบบ Measureable
    // private BankAccount max;

    public DataSet() {
        count = 0;
        sum = 0;
        max = null;

    }

    /*
     * public void add(BankAccount b) { sum += b.getBalance(); if (count == 0 ||
     * max.getBalance() < b.getBalance()) { max = b; } count++; }
     */

    public void add(Measureable x) { // รับมาเป็น Obejct ที่เป็น Measureable
        sum += x.getMeasure();
        if (count == 0 || max.getMeasure() < x.getMeasure()) {
            max = x;
        }
        count++;
    }

    public Measureable getMax() { // return เป็น Measureable
        return max;
    }

    /*
     * public BankAccount getMax() { return max; }
     */

    public int getAverage() {
        return sum / count;
    }
}