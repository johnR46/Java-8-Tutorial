# Exception 
    -  การป้องกันข้อผิดพลาด 
    -  throws และ  throw
    - try-catch และ finally 
 * Exception คืออะไร? 
    - มันคือสิ่งผิดพลาดอะไรสักอย่างที่เกิดเวลา run program (และไม่ใช่ bug นะ ) เช่น 
        * int x = Interger.parseInt("abc") 
            - แปลง String เป็นตัวเลข แต่ String เป็นตัวอักษร ก็เกิด Error !
    - แบบนี้แหละที่เรียกว่า Exception 

    * ตรวจ Exception ด้วย throw 

        /*

            class ชือ {
                public void method(...) throws Exception {

                }
            }

                  เขียนอย่างนี้หมายความว่า ถ้า method นี้ทำงาน แล้วมี error เกิดขึ้น ให้โยนไปให้ Execption ทำงานต่อ -> < throws Exception >

        */
    * แล้ว class Exception คืออะไร 
        - Exception เป็น class ที่เอาไว้จัดการ หรือ print สิ่งที่ผิดออกทางหน้าจอ 
    
    * ประเภทของข้อผิดพลาด 
        * แบบไม่ต้องเช็ค ส่วนมากเป็น RuntimeException 
        * แบบที่ต้องเช็ค เป็นการทำอะไรสักอย่างภายนอกโปรแกรม เช่น การเปิดอ่านไฟล์ 

    
    * try-catch 


        /*

                try{
                    // ชุดคำสั่งที่อาจจะเกิด Exception 
                }
                catch(Exception e){
                    // ถ้าเกิด Exception แล้วให้ทำอะไร

                }
                finally{
                    ไม่ว่าจะเกิดอะไร ต้องจบด้วย finally 
                }

                /* ไม่ว่าโปรแกรมจะหยุดการทำงาน แต่ก็ยังคงทำใน finally อยู่ดี */ 

                ex. code in sampleException.java

        */
    
    * สร้างข้อผิดพลาดด้วย throw // คนละตัวกับ throws
        * เอาไว้สร้าง obj ที่ทำให้โปรแกรมเกิด Exception ขึ้น 
        * ex . ต้องการให้เลขที่ input เข้ามาเป็นเลข(t)เท่านั้น ถ้าไม่ใช่ถือว่าเกิด Exception 
            * code in sampleException.java
         
