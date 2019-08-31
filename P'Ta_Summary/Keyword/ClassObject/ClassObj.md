# Class Object 
    * Class Object (ขึ้นต้นด้วย O ใหญ่ เพราะฉะนั้นมันเป็น Class ก็คล้ายๆ กับ String เป็น class ที่มากับ java )
        * สิ่งที่น่าสนใจ 
             * Object เป็น Class แม่ ของทุกๆ class 
                * class ทุกๆ class เป็น สับเซ็ตของ  Object 
                    * แล้วในเมื่อ Object มันใหญ่สุด  object ที่สร้างจาก obj จึงเก็บ obj  จาก class อื่นๆ ได้ทุก class 

             * Obj obj1 = new String("O-b-j-e-c-t...");
                * Obj เก็บ String ได้ 
             * String str = obj1 
                * String เก็บ obj1 ไม่ได้ เพราะ String เล็กกว่า obj1 
                 * ถ้าต้องการเก็บจริงๆ ใช้วิธี Cast เอา 
                    * String str  = (String) obj;
                        * (String) obj บอกให้เปลี่ยน obj1 เป็น String 
                        -> str เก็บ obj1 ได้แล้ว 
            * Object ที่สร้างจาก Object เก็บได้ทุกอย่าง 
            และ class ทุก class ไม่ว่าจะสร้างเองหรือมากับ java มีการ extends Object ทั้งหมด เพียงแต่ไม่ได้เขียนลงไป Compiler จัดการให้เอง 
            


