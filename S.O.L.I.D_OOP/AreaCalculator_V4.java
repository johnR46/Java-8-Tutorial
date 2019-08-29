public interface shape{
    int area();
}

public class Circle implements shape{
    // คำณวนพื้นที่ circle 
    public int area() ...
}

public class Rectangle implements shape{
    //คำณวนพื้นที่ของ Rectangle
    public int area() ...
}

public class AreaCalculator {
    // คำณวนพื้นที่ของ shape โดย call method area()
    // ท่านี้ไม่เคยยเห็นหวะ  สร้าง interface ให้อันอื่นเอาไปใช้ แล้วก็ พอจะรวมค่าที่ได้ก็จัดการ เรียก interface แล้วโยน interface ไปให้ method เฉยเลย รู้สึกแปลกๆ อะ 
    public int calc(Shape shape){
        return shape.area();
    }
}