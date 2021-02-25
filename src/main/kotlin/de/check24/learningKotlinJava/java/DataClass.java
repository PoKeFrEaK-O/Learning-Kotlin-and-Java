package de.check24.learningKotlinJava.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class DataClass {
    double a;
    double b;
    double c;

    public DataClass(double a, double b ) {
    }

    @Override
    public String toString() {
        return "DataClass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataClass dataClass = (DataClass) o;
        return Double.compare(dataClass.a, a) == 0 && Double.compare(dataClass.b, b) == 0 && Double.compare(dataClass.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public DataClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        DataClass dataClass = new DataClass(3.59, 3.69, 3.79);
        DataClass x = new DataClass(1.1,2.2,3.3);
        DataClass y = new DataClass(2.1,3.2,4.3);
        DataClass z = new DataClass(2.1,3.2,4.3);
        DataClass a = new DataClass(2.1,4.3);


        HashSet<DataClass> set = new HashSet<>();
        set.add(x);
        set.add(y);
        set.add(z);
        System.out.println(set);
    }
}
