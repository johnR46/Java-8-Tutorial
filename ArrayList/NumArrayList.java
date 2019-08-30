import java.util.ArrayList;
public class NumArrayList {

    public static void main(String[] args) {
   //      System.out.println("Hello world !");



   ArrayList<Num>  list = new ArrayList<Num>();

   Num n1 = new Num(1);
   Num n2 = new Num(2);
   Num n3 = new Num(3);
   
   list.add(n1);
   
   list.add(n2);
   
   list.add(n3);


   for(int i = 0 ;i < list.size(); i++){
       System.out.println("list :" + list.get(i).getNum2());
   }
   

   
   

    }

}

class Num {
    private int A;

    public Num(int a) {
        A = a;
    }

    public int getNum2() {
        return A * A;
    }
}

