package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CombiningExample2 {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();

        for(int i=0; i<5; i++)
            al.add( new Integer(i) );

        for(int i=0; i<5; i++)
            al.add( new Integer(i) );

        int len = al.size();
        System.out.println(" al ---------------------------");
        for(int i=0; i<len; i++)
            System.out.println( al.get(i) );
        // Inhalt von al :  0  1  2  3  4  0  1  2  3  4


        HashSet hs = new HashSet(al);
        Iterator it = hs.iterator();
        System.out.println("hs ---------------------------");
        while(it.hasNext())
            System.out.println(it.next());
        // Inhalt von hs :  0  1  2  3  4


        al.addAll(hs) ;
        len = al.size();
        System.out.println("al.addAll(hs) ---------------------------");
        for(int i=0; i<len; i++)
            System.out.println( al.get(i) );
        // Inhalt von al :  0  1  2  3  4  0  1  2  3  4  4  3  2  1  0


        hs.addAll(al) ;
        it = hs.iterator();
        System.out.println("hs.addAll(al) ---------------------------");
        while(it.hasNext())
            System.out.println(it.next());
        // Inhalt von hs :  0  1  2  3  4


        HashSet hs2 = new HashSet();
        hs2.add( new Integer(1));
        hs2.add( new Integer(3));
        // Inhalt von hs2 :  1  3

        al.removeAll(hs2) ;  // entfernt alle 1-en und 3-en
        len = al.size();
        System.out.println("al.remove(hs2) ---------------------------");
        for(int i=0; i<len; i++)
            System.out.println( al.get(i) );
        // Inhalt von al :  0  2  4  0  2  4  4  2  0


        hs.removeAll(al) ;
        it = hs.iterator();
        System.out.println("hs.removeAll(al) ---------------------------");
        while(it.hasNext())
            System.out.println(it.next());
        // Inhalt von hs :  1  3

        al.add(new Integer(1));
        al.add(new Integer(1));
        // Inhalt von al :  0  2  4  0  2  4  4  2  0  1  1

        hs2.add( new Integer(4));
        // Inhalt von hs2 :  1  3  4

        al.retainAll(hs2) ;  // "Schnittmenge" von al und hs2
        len = al.size();
        System.out.println("al.retain(hs2) ---------------------------");
        for(int i=0; i<len; i++)
            System.out.println( al.get(i) );
        // Inhalt von al :  4  4  4  1  1

        hs2.retainAll(al);  // "Schnittmenge" von hs2 und al
        it = hs2.iterator();
        System.out.println("hs2.retainAll(al) ---------------------------");
        while(it.hasNext())
            System.out.println(it.next());
        // Inhalt von hs :  4  1

    } // ende main
}
