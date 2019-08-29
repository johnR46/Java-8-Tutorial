public interface Shape{
    int area();
}
public interface Solid{
    int volume();

}

public class Square implements Shape{
    public int area() ...

}

public class Cuboud implements Solid,Shape{
    public int area() ...
    public int volume() ...
}