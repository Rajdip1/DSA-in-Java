import java.util.*;

//using collection frameworks

class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("World");
        System.out.println(list);

        list.addLast("very");
        list.addLast("pretty");
        System.out.println(list);

        list.addFirst("The");
        list.addLast("though");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + "-->");
        }
        System.out.println("Null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(3);  //remove at indexes
        System.out.println(list);
    }
}
