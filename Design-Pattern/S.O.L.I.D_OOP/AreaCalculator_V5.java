public class Circle {
    // คำนวนพื้นที่ของ Circle
    public int area() ...
}

public class AreaCalculator {
    // คำนวนพื้นที่ของ Shape โดย call method "area"
    public int calc(Circle circle) {
        return circle.area();
    }
}
