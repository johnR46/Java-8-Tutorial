class towerHanoi {

    public static void main(String[] args) {
        hanoi(10, 1, 3);

    }

    public static void hanoi(int n, int start, int end) {
        // n = จำนวน disk
        // start = เสาที่เริ่ม
        // end = เสาที่ย้ายไป

        // ถ้ามีอันเดียว ย้าย หนึ่ง ไป 3 จบ
        if (n <= 1) {
            System.out.println("Movd Disk from peg " + start + "to" + end);
        } else {
            // ย้าย n disk
            /**
             * 1 ย้าย n-1 ก้อนข้างบนไปไว้ที temp (temp หมายถึงเสาที่ไม่ได้ใช้ ) 2
             * ย้ายก้อนที่ใหญ่ที่สุดจาก start -> end (ในที่นี้คือ 1-3) 3 ย้าย n-1 ก้อน
             * จากเสา2(temp) ไป end(เสา3) จบ!
             */

            int temp = 6 - start - end;
            // การหา temp เสาที่เหลืออยู่ โดยการเอา 6 ไปลบกับ start และ end
            // * มีเสาสามต้น คือ 1 2 3 โดยที่ 1 + 2 + 3 = 6
            // ถ้ามีเสาอยู่ 2 ต้น อยากรู็ว่าเสาต้นที่เหลือคือต้นไหน ก็เอา 6 - 2
            // ต้นที่เหลือที่รู้อยู่
            hanoi(n - 1, start, temp); // ย้าย n-1 ก้อน จาก start - > temp
            hanoi(1, start, end); // ย้าย 1 ก้อน(ฐาน) จาก start -> end
            hanoi(n - 1, temp, end); // ย้าย n-1 ก้อน จาก temp -> start
        }

    }
}