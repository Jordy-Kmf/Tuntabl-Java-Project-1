package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    public List<Student> studentList = new ArrayList<>();

    public boolean enter (Student student) {
        this.studentList.add(student);
        return true;
    }

    public double getHighestAverage(){
        double highest = 0.0;
        for (Student student : this.studentList){
            if (student.getAverageGrade() > highest) {
                highest = student.getAverageGrade();
            }
        }
        return highest;

    }

}
