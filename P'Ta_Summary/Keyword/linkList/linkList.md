 # LinkList
    มี 2 class ที่ใช้ในเรื่องนี้คือ 
        LinkedList -> เป็น list ที่เก็บ data ไปเรื่อยๆ อะ 
        ListIteraqtor - > คล้ายๆ pointer บอกว่ากำลังจัดการกับ data ตัวไหนใน LinkedList อยู่ 

        - รูปแบบการประกาศ 
            - LinkedList <class>  nameList = new LinkedList<class>();
            - method ของ LinkedList มันไม่มี index แบบ array เราเลยจะ add,get,remove ได้เฉพาะหัวกับท้ายเท่านั้น
        
        - Start 
            -> Obj node -> Obj
                            - node -> Obj
                                        -node -> END
            
            - ListIterator <class>  name_Iterator = objList.listIterator();
                - sampleLinkedList.java