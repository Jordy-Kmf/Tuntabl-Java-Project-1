package io.turntabl;

import java.util.List;

public class Student {

    private List<Double> grades;

    //constructor
    public Student(List<Double> grades){
        this.grades = grades;
    }

    // getters
    public List<Double> getGrades() {
        return grades;
    }


    public double getAverageGrade(){
        Double sum = 0.0;

        for (Double grade: grades){
            sum += grade;
        }
//        average = sum/count;
        return sum/grades.size();
    }



}
