# Inheritance 
    * คือการสืบทอดหรือส่งต่อ จาก class หนึ่งไปอีก class หนึ่ง โดย class ที่รับการสืบทอดมา จะมีความสามารถเหมือนกัน หรือมากกว่า class ต้นแบบ 
    * เมื่อไหร่ถึงจะใช้ Inheritance  
        * code in SampleInheritance.java
        * จะเห็นว่า รถบรรทุก (Truck) มี method เหมือนกับใน car 
            * พูดง่าย ๆ Truck ก็เป็น Car ก็เลยมีความสามารถของ Car ทุกอย่าง 
                * เมื่อเป็นแบบนี้ เราจะสั่งให้ Truck extends Car 
    
    * หลักการ 
        * class name_subclass  extends name_masterclass
            * เขียน Car กับ Truck มาเขียนใหม่ 
                * code in SampleInheritance.java
                    * ถ้าเขียนแบบนี้ เราจะมองว่า Truck เป็น Car ในเมื่อเป็น Car แล้ว ก็สามารถใช้ metod ของ Car ได้
                    ปัญหาคือ อะไรคือ super()

        * super & this 
            * เวลา สั่ง extends มันไม่เหมือน implements ที่เราต้องเขียน method ใหม่เอง เช่นในทีนี้ Truck สามารถเรียกใช้ drive() กับ getGas() ได้  เรียก gas ที่เป็น Variable ไม่ได้เพราะ ประกาศ private ไว้อยู่ โดยที่ Truck เองก็ไม่มี method พวกนั้นอยู่ 
                - จะใช้ต้องทำไง 
                    - keyword : super 
                        * หมายถึง การให้ไปดูที่ classแม่ของมัน ส่วน super(inGas) หมายถึง ให้โยนค่า inGas ไปให้ constructor ของ class แม่
                    - เราอาจจะเรียก super.drive() และ super.getGas()จากใน Truck ได้ (ถ้า inGas ไม่ใช่ private เราอาจจะเรียก super.gas มาเลยก็ได้ )
    * ดูตัวอย่างการจาก class SampleInheritance 

        * สร้าง Truck โดยให้ น้ำมันเป็น 200
         * โยน 200 เข้า Constructor ของ Truck 
            * constructor สั่ง super(inGas) ก็โยนต่อไปให้ class แม่ 
                * มีค่าเท่ากับ โยนค่า 200 ให้ Car(inGas)
        * สั่ง getGas() ขอค่าน้ำมันเหลือตอนนี้ 
            * เหมือนเดิม ใน Truck ไม่มี getGas()  มันเลยไปหาดูใน Car
                *   ไปดูใน Car มัน  return gas มาให้ 
        * ส่วนคำสั่ง this ใช้สำหรับ เรียกใช้ method หรือ variable ใน class ตัวเอง (แต่ไม่ค่อยได้ใช้ เพราะการที่ไม่ระบุคำว่า super ก็หมายถึงการเรียกใช้ อะไรสักอย่างใน class นั้นอยู่แล้ว )
    
        * สรุป 
            - ใช้ super เพื่อเรียกใช้ method และ variable จาก class แม่ (ที่ไม่ได้ประกาศ private ไว้ ) ใน class ลูก
            - ใช้ this เมื่อระบุให้ชัดเจนว่า เรากำลังเรียกใช้ method และ variable จากใน class เท่านั้น 

