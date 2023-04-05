import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        //Declaring and initalizing a linked list
        LinkedList<String> name = new LinkedList<>();

        //Adding items to a linked list
        name.add("Komal");
        name.add("Tariq");
        name.add("Govindam");
        name.add("Shivam");
        System.out.println(name);

        name.remove();
        System.out.println(name);

        name.remove();
        System.out.println(name);

        //remove method removes items in a sequential manner as it is in the list
        //add method adds items in a sequential manner in the list

        //adding a item to the 1st position in the list
        name.addFirst("Komal");
        System.out.println(name);

        //adding an item to last position in the list
        name.addLast("Shubham");
        System.out.println(name);

        name.removeFirst();
        System.out.println(name);

        name.removeLast();
        System.out.println(name);

        name.add("Charity");
        name.add("Shaun");
        name.add("Modi");
        System.out.println(name);

        System.out.println(name.getFirst());
        System.out.println(name.getLast());
        System.out.println(name.size());
    }
