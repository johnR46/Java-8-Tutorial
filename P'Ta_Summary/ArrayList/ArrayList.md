# Array List 
ref java programming ขีทพี่ต้า 
* มันก็ Array 1 D ดีๆ นี่แหละ แค่ถูกทำให้งงมากขึ้น ???
    * ข้อดี 
        * จะยัดเข้าไปเท่าไหร่ก็ได้
        *  +  - แทรกข้อมูลง่าย 
    * ข้อเสีย
        * งง ! ปวดหัวเวลาใช้ สำหรับคนที่ไม่ถนัด Array อยู่แล้วอะนะ 


*   การใช้งาน
    * ต้อง import java.util.ArrayList; ก่อนใช้งาน 
    * การประกาศตัวแปร
        * ธรรมดา
            * String [] A = new String [3];
        * ArrayList 
            * ArrayList<String> B = new ArrayList<String>()

    * การใส่ค่าเข้าข้างใน
        * ธรรมดา
            * A[0] = "John";
            * A[1] = "Nonphala";
        * ArrayList
            * B.add("John");
            * B.add("Nonphala");

    * การลบข้อมูล,ค่า ทิ้ง
        * ธรรมดา
            * A[1] = null;
            * A[2] = null;
                * ข้อมูลหายไปนะแต่ช่องยังอยู่
        * ArrayList
            * B.remove(1);
            * Bremove("John");
                * ลบออบเจ็คในตำแหน่ง 1 ทิ้งไปเลย
    * ความยาว
        * ธรรมดา
            * System.out.println(A.length);
        * ArrayList
            * System.out.println(B.size());

    * การดึงข้อมูลออกมาใช้
        * ธรรมดา
            * for(int i = 0; i < A.length; i++){
                System.out.println(A[i]);
            }

        * ArrayList
            * for(int i = 0; i < B.size(); i++){
                System.out.println(B.get(i));
            }
        
    * Trick 
        *  เมื่อบอกว่าสร้าง B เป็น ArrayList ก็เหมือนกับสร้างห้องเก็บของชื่อ B ไว้
        * ถ้าจะยัดข้อมูลเข้าไปตำแหน่งนึงก็ใส่เลขไปซะ 
            * B.add(1,"LUY");

* มาถึงอันที่ปวดหัวละ ArrayList ของ Class 
    * Array สามารถเก็บหลาๆ Object ของตัว Class ได้ (Array ธรรมดายังทำได้ อันนี่ก็ต้องทำได้อะนะ )
        * ArrayList<nameClass> nameArrayList  = ArrayList<nameClass>(); 
        * ยกตัวอย่างด้วย NumArrayList.java
    * นอกเรื่อง
        * ปกติเวลาสร้าง object เราจะสร้างแบบ  class name_class  = new class(); โดยที่ไม่รู้ว่าทำไมต้อง new เช่นการสั่ง Num n1 = new Num(1);
            * สั่ง Num n1 จะทำหน้าที่คล้ายๆ สร้างป้ายชื่อ ว่า n1 มา 
            * สั่ง new Num(1); จะมีการสร้าง object มาใหม่ก้อนหนึ่ง  แล้วเอาป้ายชื่อติดเข้าไป จบนอกเรื่อง

    * อธิบายโค้ดสักเล็กน้อย
        * list.get(i).getNum2();
            * list.get(i) อ้างถึง object ตัวนึงสมมุติว่า get(1) มันจะมองว่าเป็น n2
                * n2.getNum2();
                    * n2 เป็น Num มี getNum2() 
                        * getNum2() เมื่อถูกเรียกจะ return A*A มาให้ ซึ่ง A ของ n2 มีค่าเท่ากับ 2
        * สรุป list.get(1).getNum2(); มีค่าเท่ากับ  2*2 = 4  
    


    
        