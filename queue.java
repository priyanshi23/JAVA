import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //5.1
        Queue<String> name = new LinkedList<>();
        Queue<String> num = new LinkedList<>();

        name.add("Tom Nkuna");
        name.add("Rudolf Zulu");
        name.add("Christine Pandit");
        name.add(" Rose Sambo");
        name.add("Tiyani Xulu");

        num.add("1804041082084");
        num.add("1904041082084");
        num.add("2004041082084");
        num.add("2104041082084");
        num.add("2204041082084");

        System.out.println(name);
        System.out.println(num);

        //5.2
        System.out.println("Next customer being serviced is: "+ name.remove() + " " + num.remove());

        //5.3
        System.out.println("Next customer to be serviced please call out your name: "+ name.peek());

        //5.4
        System.out.println(name);
        System.out.println(num);

        //5.5
        System.out.println(name.size());
        System.out.println(num.size());

        //5.6
        System.out.println("Is Rose Sambo here? " + name.contains("RoseSambo"));

        //5.7
        System.out.println("Next customer being serviced is: "+ name.remove() + " " + num.remove() + " " + name + " " + num);

    }
}
