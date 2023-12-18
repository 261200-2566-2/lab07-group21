import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        hashSet<Integer> m = new hashSet<>();
        m.add(1);
        m.add(5);
        hashSet<Integer> p = new hashSet<>();

        //size
        System.out.println("*size");
        System.out.println("Hash Set size : " + m.size());
        System.out.println("----------");

        //is empty
        System.out.println("*is empty");
        System.out.println("Is hash set m empty? : " + m.isEmpty() );
        System.out.println("Is hash set p empty? : " + p.isEmpty() );
        System.out.println("----------");

        //contains
        System.out.println("*contains");
        System.out.println("Is hash set m contain 1? : " + m.contains(1));
        System.out.println("Is hash set m contain 2? : " + m.contains(2));
        System.out.println("----------");

        //iterator
        System.out.println("*iterator");
        Iterator value = m.iterator();
        System.out.print("The iterator values are : ");
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
        System.out.println();
        System.out.println("----------");

        //add
        System.out.println("*add");
        System.out.println("add 1 to hash set p : " + p.add(1));
        System.out.println("add 1 to hash set p again : " + p.add(1));
        System.out.println("----------");

        //remove
        System.out.println("*remove");
        p.add(1);
        System.out.println("Is hash set p empty? : " + p.isEmpty() );
        p.remove(1);
        System.out.println("Is hash set p empty? : " + p.isEmpty() );
        System.out.println("----------");

        //addAll
        System.out.println("*add all");
        p.add(2);
        m.addAll(p);
        printAll(m);
        System.out.println("----------");

        //clear
        System.out.println("*clear");
        p.clear();
        System.out.println("Is hash set p empty? : " + p.isEmpty() );
        System.out.println("----------");

        //remove all
        System.out.println("*remove all");
        p.add(1);
        printAll(m);
        m.removeAll(p);
        printAll(m);
        System.out.println("----------");

        //retain all
        System.out.println("*retain all");
        m.add(1);
        printAll(m);
        printAll(p);

        m.retainAll(p);
        printAll(m);
        System.out.println("----------");

        //contains all
        System.out.println("*contains all");
        m.add(4);
        p.add(4);
        System.out.println("Is m contains all of p? : " + m.containsAll(p));
        p.add(3);
        System.out.println("Is m contains all of p? : " + m.containsAll(p));
        System.out.println("----------");
    }
    public static void printAll(hashSet h) {
        Iterator value = h.iterator();
        System.out.print("elements: ");
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
        System.out.println();
    }


}