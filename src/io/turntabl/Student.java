package io.turntabl;

import java.util.List;

public class Student implements Nameable {

    private String name;
    private List<Double> grades;

    //constructor
    public Student(List<Double> grades){
        this.grades = grades;
    }

    public Student(String name, List<Double> grades){
        this.name = name;
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

    public double getAverageGrade(Boolean actual) {
        return this.getAverageGrade();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
