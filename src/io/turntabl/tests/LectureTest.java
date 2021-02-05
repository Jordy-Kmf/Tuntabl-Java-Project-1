package io.turntabl.tests;

import io.turntabl.Lecture;
import io.turntabl.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LectureTest {

    Student kelvin = new Student(Arrays.asList(100.0, 80.0, 85.0));
    Student godson = new Student(Arrays.asList(60.0, 92.0, 77.0));
    Student stella = new Student(Arrays.asList(95.0, 99.0, 82.0));
    Student jordan = new Student(Arrays.asList(75.0, 89.0, 69.0));


    Lecture lecture = new Lecture();

    @Test
    public void enter(){
        assertTrue(lecture.enter(kelvin));
    }

    @Test
    public void getHighestAverage() {
        lecture.enter(kelvin);
        lecture.enter(godson);
        lecture.enter(stella);
        lecture.enter(jordan);
        assertEquals(276.0, lecture.getHighestAverage(), 276.0);
    }


}
