import java.util.LinkedList;
import java.util.ListIterator;

class sampleLinkList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.addLast("Kemono");
        list.addLast("Neko mimi");
        list.addFirst("Yuri & Yaoi");
        list.addFirst("Loli");
        
        ListIterator<String> pointer = list.listIterator();
        String temp = pointer.next();
        pointer.next();

        pointer.remove();
        pointer.add("Maid");
        pointer.next();
        pointer.add("Tsunder");
        System.out.println(temp);
        for(String name:list){
            System.out.println(name +" ");
        }



        

    }
}
