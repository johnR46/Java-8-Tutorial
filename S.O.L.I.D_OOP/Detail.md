#S.O.L.I.D -- 5 หลักการของ Object - Oriented Design
  * ต้นทาง 
    *   https://medium.com/@phayao/s-o-l-i-d-5-%E0%B8%AB%E0%B8%A5%E0%B8%B1%E0%B8%81%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B8%82%E0%B8%AD%E0%B8%87-object-oriented-design-3c8a52821783

 * กล่าวนำ
    * S.O.L.I.D เป็นตัวย่อของหลักการหลักๆ ของการออกแบบโปรแกรมเชิงวัตถุ หรือ Object-Oriented Design ของ Robert C. Martin หรือเรียกกันติดปากว่า Uncle Bob

 * S.O.L.D ย่อมาจากอะไร 
    * ถ้าเราไม่ได้มองเป็นตัวย่อ เราอาจจะเข้าใจผิด (SOLD แปลว่าของเเข็ง - -) แต่จริงๆ แล้ว มันย่อมาจากหลักการต่างๆ ดังนี้ 
     * S --- Single-Responsibility  Principle 
     * O --- Open/Close principle
     * L --- Liskov Subtituion principle
     * I --- Interface Segreation principle
     * D --- Dependency Inversion principle
* ต่อไปก็จะขยายความของแต่ละหลักการ 
    * S — Single-Responsibility (S.R.P)
      เป็นหลักการแรก S.O.L.D ที่แนะนำ developer ว่าเขียน Class ให้มีเหตุผลเดียวที่จะเปลี่ยนแปลงแก้ไข โดยลุงกล่าวไว้ว่า :
      ------------------------------------------------------------
         A Class Should have one, and only one, reason to change.
      ------------------------------------------------------------
      ถ้า Class มีมากกว่าหนึ่งเหตุผลที่จะเปลี่ยนแปลงแก้ไขมัน นั้นก็หมายความว่า มันมีมากกว่า หนึ่ง  ความรับผิดชอบ (Responsibility) คิอว่า Class นั้น ทำหลายๆ อย่าง ไม่เพี่ยงแต่ทำงานอย่างเดียว เมื่อเราเจอ Class ที่มีลักษณะแบบนี้แล้ว เราควรที่จะแตก Class นั้นออกเป็น Class ย่อยๆ ตามความรับผิดชอบของงานนั้นเพียงงานเดียว
      ตัวอย่างเช่น Class AreaCalculator จะรับค่าเป็น Class Circle และมี 2 Method ที่ ทำหน้าที่รับผิดชอบการบวก และ การแสดงผลรวมบนหน้าจอ ดังนั้น ทำให้มี 2 เหตุผลในการเปลี่ยนแปลง คือ 1 การคำณวน และการแสดงผล ทำให้ไม่ตรงตามหลักการดังนี้ 

      -------------------------------------

      code in file AreaCalculator_V1.java

      -------------------------------------

      ดังนั้นเราควรจะแตก class ออกตามความรับผิดชอบ ซึ่งจะเหลือเหตุผลเดียวของแต่ละ Class ในการเปลี่ยนแปลงแก้ไข Class นั้น ๆ


      -------------------------------------

      code in file AreaCalculator_V2.java

      -------------------------------------



* O --- Open/Close(OCP)
   * เป็นหลักการที่สองที่แนะนำ developer ว่าควรเขียนหน่วยของ Software (Calsses,Modules,Functuions เป็นต้น) ทั้งหลาย ต้องเปิดต่อการขยาย แต่ปิดต่อการแก้ไข โดย Mayer ได้นิยามให้เข้าใจง่ายว่า :

      -------------------------------------------------------
      Software entites (Classes,Modules,functions,etc.) should be open for extension,but close for modification

      -------------------------------------------------------

      นั้นก็หมายความว่า Class ควรจะง่ายต่อการขยายความสามารถ โดยจะต้องไม่ แก้ไข calss นั้น ซึ่งจะต้องไม่แก้ไข source code หรือ binary ของ class  เดิม 
      จากตัวอย่างด้านบน ถ้าเราต้องการจะขยายความสามารถของ AreaCalculator ให้สามารถคำณวณรูปแบบอื่นๆ ด้วย เช่นตอนนี้คำณวน circle ได้  แต่ต้องการขยาย ให้สามารถคำณวนพื้นที่ ของ Rectangle เราจะต้องสร้าง metod เพิ่มเพื่อให้รองรับความสามารถใหม่นี้ และเพิ่ม method เรื่อยๆ เพื่อรองรับรูปแบบที่เพิ่มขึ้น ทำให้ไม่ตรงกับหลักการนี้ ที่เราต้องมาแก้ source ของ AreaCalculator เสมอ

      
      -------------------------------------

      code in file AreaCalculator_V3.java

      -------------------------------------

      // พักเบรกแปป https://www.nekopost.net/manga/4159/25 ซัดไป 25 ตอน lol 
     
      ดังนั้นเราจะดึง method คำณวนพื้นที่ออกมาสร้างเป็น interface เพื่อให้ class circle และ Rectangle สืบทอดมาและเรียกใช้ใน class AreaCalculator 

      
      -------------------------------------

      code in file AreaCalculator_V4.java

      -------------------------------------


   * L --- Liskov Substitution (LSP) 
      * เป็นหลักการนำแนวคิดของ Liskov ที่นำเสนอในปี 1987 (นานอะ ) โดยเป็นหลักการแทนที่ ของ type ใน software นั้นก็คือ class ย่อยจะต้องสามารถแทนที่สำหรับ class หลักของตัวเอง 

      ---------------------------------------

      Derived classes must be substitution for their base classes.

      Let q (x) be a property provable about object of x type T. Then q(y) shoud  be provable  for objects y of type S where S is a subtype of T.

      Barbara Liskov 

      ---------------------------------------      

      ตัวอย่างเช่น สร้างคลาสย่อย VolumnCalculator สืบทอดจาก AreaCalculator แต่ทว่า return type เป็น long ซึงไม่ตรงหลักการนี้ ที่จะทำให้ คลาสย่อยต้องสามารถแทนที่ได้ด้วยคลาสหลัก 


      ---------------------------------------

      Code in VolumnCalculator_1.java

      ---------------------------------------

      ดังนั้นเราก็เพียงเปลี่ยน return type ของ method    calc ให้เหมือนกับคลาสหลัก  ( ตรง long ให้เป็น int )

      ---------------------------------------

      Code in VolumnCalculator_2.java

      ---------------------------------------
   
   * I --- Interface Segregation (ISP)
      * เป็นหลักการทื่ว่า Client ควรจะไม่โดนบังคับให้ implement interface โดยที่ไม่ใด้ใช้ implement นั้น 

      -------------------------------

      Client shoud not be forced to implement interface they do not use.

      -------------------------------

      นั้นคือ class ที่ implement interface จะต้องไม่โดนบังคับให้ implement method ที่ class นั้นไม่ได้ใช้งาน ดังนั้นจะต้องแบ่ง interface ย่อยตามลักษณะการใช้งาน 
      ตัวอย่างเช่น เราเพิ่ม method "volume" ของ interface "shape" ทำให้มี 2 metod และทุก class ที่สืบทอด  interface "Shape" จะต้อง implement ทั้ง 2 method ซึ่งบาง class อย่างเช่น Square ไม่มีปริมาตร ดังนั้นไม่จำเป็นต้อง implement method "Volume" ดังนั้น ทำให้ไม่ตรงกับหลักการนี้ 
      
      -------------------------------
       Code in interface_1.java

      -------------------------------
      
      ดังนั้นเราจะต้องแยก  interface ออกเพื่อที่จะให้ class implement เฉพาะสิ่งที่ต้องการเท่านั้น โดยที่ Shape จะ implement interface "Shape" เท่านั้น

      -------------------------------
       Code in interface_2.java

      -------------------------------

      

















