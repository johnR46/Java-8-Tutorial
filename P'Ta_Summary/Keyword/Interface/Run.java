interface Flyable {
    public String fly();

}

public class Run {

    public static void main(String[] args) {
        /*
         * Plane p = new Plane(); System.out.println(p.fly());
         * 
         * Brid b = new Brid(); System.out.println(b.fly());
         */

        /*
         * Flyable p = new Plane(); // ท่านี้ก็ได้เหรอ เออ พึ่งเคยเห็น 5555555
         * System.out.println(p.fly());
         */

         Flyable someting  = new Plane();
         System.out.println(someting.fly());
         someting  = new Brid();
         System.out.println(someting.fly());
    }

}

class Plane implements Flyable {
    public String fly() { // บอกว่าเครื่องบินบินยังไง
        return "บินแบบเครื่องบิน";

    }
}

class Brid implements Flyable {
    public String fly() {
        return "บินแบบนก";

    }
}
