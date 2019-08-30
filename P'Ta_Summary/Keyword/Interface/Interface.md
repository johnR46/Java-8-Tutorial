# Interface 
* intro
    * เรื่องไม่ง่ายเท่าไหร่ ที่อธิบายยาก อันนี้ยาวหน่อยนะ 
    * interface มักตั้งชื่อลงท้ายด้วย -able 


* interface 
    * เป็น class พิเศษที่จะบอกว่าสามารถทำอะไรได้เท่านั้น แต่ไม่มีวิธีทำ (มีแต่ ชื่อ method แต่ไม่มีกะบวนการว่าทำอะไรยังไง ) งงป้ะล่า อ่านต่อไปป 5555 

    * ส่วนประกอบของ interface 

        --------------------------------------
        * interface name_interface{
            method1(); // abstract method ประกาศชื่อไว้เฉยๆ 
            method2();

            instance var; // 
        }
        --------------------------------------
    * แล้วมีไว้ทำไม interface 
        * เวลาสร้าง class มาหลายๆ อัน เราอาจจะมี  method ที่ทำงานเหมือนกัน หรือชื่อเหมือนกัน เช่นมี class เครื่องบิน และ class นก อยู่ ทั้งนกเเละเครื่อ
        งบินมีความสามารถเหมือนกันอยู่หนึ่งอย่างคือ บิน();
            * เมื่อมันมีบิน เหมือนกัน เราก็ควรสร้าง interface สามารถบินได้ (flyable) แล้วใส่ความสามารถบินได้นี้ให้กับเครื่องบิน กับนก  ทีนี้  ทั้งนกและเครื่องบินก็สามารถบินได้ (แต่จะบินยังไงไปทำเอาใน class นกเเละเครื่องบิน ) รู้แค่ว่าเออ ตอนนี้บินได้นะ 
       * code in Run.java //  Line 10-12
       * ข้อควรระวัง
         * การ implements  interface ต้องเอาทุก method ใน interface นั้นมา เขียนใหม่ด้วย เช่นถ้า interface flyableถ้ามี method ชื่อ public String wing(); เพิ่มเข้ามาแล้ว ถ้า Plane กับ Brid ไม่มี wing() เวลาคอมไฟล์ จะ Error ! 
       
    * การสร้าง object จาก interface 
        * การสร้าง object นี้ จะต่างจากการสร้าง object จาก class   ... ปกติแล้ว เราจะเขียนแบบนี้ 
            * class name_object = new class();
                * class name_object คือการสร้าง ตัวแปรมา 1 ตัว เอามาเก็บข้อมูลประเภท class เท่านั้น
                 * new class(); ให้สร้าง object  มาตัวนึง  ที่มีคุณสมบัติเหมือน class (ราวๆ ไป copy class ต้นแบบมา )
                 * class name_object = new class(); จับให้ตัวแปรให้มีค่าเท่ากับ object ที่สร้างมะกี้ 
        * ถ้าเราจะสร้าง object จาก interface หละ ถ้าทำแบบนี้ ?
            * interface name_obj  = new interface();  // ผิดอย่างแรง มั่วด้วย ถถถถถ
                * สร้างแบบนี้ไม่ได้ เพราะ interface มีแต่ชื่อ method แต่ไม่ได้บอกว่า method พวกนี้ไปทำอะไรได้
                    * วิธีแก้ 
                        * เวลาสั่ง new ให้ new จาก class ที่ implements interface ตัวนั้นไป
                            * Ex อยากเอา interface Flyable มาสร้าง object สักตัว 
                            * Step 1 
                                * Flyable โบอิ้ง 747  // สร้าง object ที่บินได้ มาหนึ่งตัว ชื่อ โบอิ้ง 747 
                            * Step 2
                                * Flyable โบอิ้ง 747 = new Plane() // บอกว่า object ที่บินได้ตัวนี้ บินได้เหมือนเครื่องบิน (Plane)
                            * code in Run.java //  Line 15-16

                        * ถ้าจะให้ object Flyable บินแบบอื่นๆ บ้างละ ?
                            * code in Run.java // Line 20 - 23 
                                * จะเห็นว่า สั่ง someting.fly(); เหมือนกัน แต่ output ต่างกัน เพราะ fly() มาจากคนละ class กัน 

        * สรุป ถ้าจะสร้าง object interface ก็สร้างตามนี้ 
            * interface name_obj = new class();  // โดยที่ class นั้นจะต้อง implements interface นั้นๆ แล้ว 



    * การเอา interface ไปผสมกับการรับค่าทาง parameter // เริ่มปวดหัวแล้ววว
        * ตอนนี้จะพูดถึง Bank กัน มี 3 class คือ BankAccount Coin และ Dataset กัน
            * Code in Bank.java 
                * DataSetเอาไว้เก็บข้อมูล เรา add object เข้าไปได้เรื่อยๆ โดย DataSet จะเช็คหาค่า max เก็บเอาไว้ในรูปแบบ object BankAccount และคิดค่า sum เอาไว้ทุกรอบที่มีการ add(); 
                ถ้าทางฝั่ง main เรียก getMax ก็จะ return ตัวที่ Max กลับไปในรูปแบบ object , getAverage() จะ return ค่าเฉลี่ย แบบ int กลับไป (ค่าอาจจะเพี้ยนเพราะใช้ int)
                
                * มาถึงตอนนี้ เราใช้ DataSet() กับ BankAccount ได้ไม่มีปัญหา ถ้าจะใช้กับ Coin ละ ก็งานเข้าสิ เพราะ 
                    * parameter ของตัวรับ(method add เป็นของ BankAccount ) ทำให้รับ obj ของ Coin ไม่ได้

                * สังเกตุว่า BankAccount กับ Coin มี method คล้ายๆ กันคือ getBalance()กับ getValue() (เหมือนตรงที่คืนค่าหลักของ class เหมือนกัน )

                * ที่ผ่านมาเราให้ Plane กับ Brid เป็น Flyable เพราะพวกมันบินได้ fly() 
                    * งั้นเราก็มองว่า BankAccount กับ Coin คืนค่ากับทำหน้าที่เหมือนกัน(หาค่าคงเหลือ ก็ implements มันซะสิ )
                    ------------------------------------------------------------------
                        * code in Bank.java 
                            * BankAccount,Coin implements interface 
                                * หลังจาก implements แล้ว เปลี่ยน getBalance() และ getValue() ให้เป็น getMeasure() เพราะทั้ง 2 ตัวนี้ ทำหน้าที่เหมือนกัน

                            * DataSet เปลี่ยน parameter ก้บ max
                                 * จากปกติการรับ parameter รับได้อย่างเดียว (Coin หรือ BankAccount อย่างไดอย่างหนึ่ง)
                                 * ตอนนี้บอกว่า รับ object อะไรก็ได้ที่สามารถวัดค่าได้ มา (รับเป็น Measureable )
                                    * ที่ต้องบอกว่ารับมาเป็น Measureable เพราะเดี๋ยวจะมีการเรียกใช้ method   getMeasureable() ซึ่ง obj ที่จะมี method นี้แน่ๆ  100% ก็คือ object  ที่สร้างจาก class ที่ implements Measureable ไป (ตามกฏ  อะไรที่ได้ implements ไปต้องไปเขียน method ให้ครบ ไม่งั้น error ) -> แปลว่ามีแน่ 100% ไง lol
                                        * Measureable
                                            * BankAccount ที่ติดความสามารถของ Measureable แล้ว
                                            * Coin ที่ติดความสามารถของ Measureable แล้ว
                                            
                                            * DataSet สิ่งที่ผ่านไปได้ต้องสามารถ Measureable

                            * ลองเขียน class Tester เพื่อรันผลดู(ทดสอบความเข้าใจ )
                                * สังเกตว่า หลังจากเรียก data.getMax() เราเปลี่ยนมันให้กลายเป็น BankAccount ได้ โดยวิธีเดียวกับการเปลี่ยน double -> int ( int x = (int) 5.5; ) 
                                โดยการเปลี่ยนแบบนี้เราต้องชัวร์ว่า object Measureable ก้อนนั้นเป็น BankAccount (ถ้ามันดันเป็น Measureable แบบ Coin มันจะ Error ) วิธีการเเบบนี้เรียกว่า การ Cast 
                    ------------------------------------------------------------------


                            
                            

                 

            

