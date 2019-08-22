# Java-8-Tutorial
https://howtodoinjava.com/java-8-tutorial/


 > Table of Contents
1. Lambda Expression
2. Functional Interface
3. Default Methods
4. Streams
5. Date/Time API Changes

#Lambda Expression

1. What is a lambda expression ?
    * ในทางโปรแกรมมิ่ง  แลมป์ดาเอ็กเพรสซั่น  หรือฟังก์ชั่น เป็น ฟังก์ชั่นไร้ชื่่อ หรือเรียกอีกอย่างว่าไม่มีชื่อ และไม่ถูกผูกไว้กับตัวที่เรียก 
    *  The most important features of Lambda Expressions is that they execute in the context of their appearance. So, a similar lambda expression can be executed differently in some other context (i.e. logic will be same but results will be different based on different parameters passed to function).
    * คุณลักษณะที่สำคัญที่สุดของแลมบ์ดานิพจน์คือพวกมันทำงานในลักษณะที่ปรากฏ ดังนั้นการแสดงออกแลมบ์ดาที่คล้ายกันสามารถดำเนินการแตกต่างกันในบริบทอื่น ๆ (เช่นตรรกะจะเหมือนกัน แต่ผลลัพธ์จะแตกต่างกันไปตามพารามิเตอร์ที่แตกต่างกันที่ส่งผ่านไปยังฟังก์ชัน)
    
    1.1 Lambda Syntax

        * A typical lambda expression syntax will be like this:
            * (x, y) -> x + y  //This function takes two parameters and return their sum.

    1.2 Lambda examples

        * Let's see some examples of lambda expression as well :
            * (int a,int b) -> a * b  // takes two integers and returns their multiplication
            * (a, b)          ->   a - b   // takes two numbers and returns their difference
            * () -> 99 // takes no values and returns 99
            * (String a) -> System.out.println(a)     // takes a string, prints its value to the console, and returns nothing
            * a -> 2 *a // take a number and return the result of doubleing it.
            * c -> { // some complex statements  } // take a collection and do some processing  
    
    1.3 Feature of Lambda Expression 

        Let's identify some features of lambda expression :
        * A Lambda expression can have zero , one more parameters 
        * The types of parameters can be explicitly declare or it can be inferred from the context .
        * Multiple parameters are enclose in mandatory parenthese and separated by commas. Empty parenthese are use to represent an empty set of parameters.
        * When there is a single parameter, if its type is inferred, it is not mandatory to use parentheses. e.g. a -> return a*a.
        *  
    #Java 8 Functional Interface 
    



 


    