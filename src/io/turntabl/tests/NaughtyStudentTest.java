package io.turntabl.tests;

import io.turntabl.Lecture;
import io.turntabl.NaughtyStudent;
import io.turntabl.Student;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NaughtyStudentTest {
    Lecture lecture = new Lecture();
    NaughtyStudent jordan = new NaughtyStudent(Arrays.asList(75.0, 89.0, 69.0));
    NaughtyStudent godson = new NaughtyStudent(Arrays.asList(60.0, 92.0, 77.0));
    NaughtyStudent kelvin = new NaughtyStudent(Arrays.asList(100.0, 80.0, 85.0));

    //Not satisfied according Kelvin and s's liking
//    Student jordanAgain = new Student(Arrays.asList(75.0, 89.0, 69.0));
    @Test
    public void checkNaughtyStudent(){
        assertTrue(jordan instanceof Student);
    }

    @Test
    public void checkReportedAverageGrade() {
//
        assertEquals(((10/100)*jordan.getAverageGrade(true))+jordan.getAverageGrade(true), jordan.getAverageGrade(), 1.0);
//        assertEquals(85.43, jordan.getAverageGrade(), 85.5); // Almost working solution by Godson
    }

    @Test
    public void NaughtyStudents() {
        lecture.enter(jordan);
        lecture.enter(godson);
        lecture.enter(kelvin);
        assertEquals(((10/100)*jordan.getAverageGrade(true))+jordan.getAverageGrade(true), jordan.getAverageGrade(), 1.0);
        assertEquals(((10/100)*godson.getAverageGrade(true))+godson.getAverageGrade(true), godson.getAverageGrade(), 1.0);
        assertEquals(((10/100)*kelvin.getAverageGrade(true))+kelvin.getAverageGrade(true), kelvin.getAverageGrade(), 1.0);
    }
}
