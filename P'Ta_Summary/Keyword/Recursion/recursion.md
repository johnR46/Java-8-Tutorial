# Recursion
 
 * ปกติหน้าตา method Recursion จะเป็นแบบนี้

    /*

        public static int name_method(int n){
            if(n == 1 ){
                return อะไรสักอย่าง
            }
            else{
                return name_method(n-1);
            }
        }

    */

    * Example
        * fac.java
    
    * ปกติไม่ค่อยเจอ 
        * อันที่เจอในโจทย์บางประเภท เช่น Tower of Hanoi 
            * กฏ 
                * ย้าย disk ทั้งหมดไปเสาสุดท้าย
                * ย้ายได้ครั้งละ disk เท่านั้น
                * อันใหญ่กว่าห้ามทับอันเล็กกว่า  (อันนี้แหละที่ทำให้ยาก)
            *  towerHanoi.java

