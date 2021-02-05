package io.turntabl.tests;

import io.turntabl.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAverageGrade() {
        List<Double> grades = new ArrayList<>(Arrays.asList(10.0,40.0,30.0,20.0));
        Student stella = new Student(grades);
        assertEquals(25.0, 20.0, stella.getAverageGrade());
    }
}
