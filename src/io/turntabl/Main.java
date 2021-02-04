package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Double> marks = new ArrayList<>();
        marks.add(89.0);
        marks.add(87.0);
        marks.add(45.0);
        marks.add(72.0);
        marks.add(99.0);
        Student Stella = new Student(marks);

    }
}
