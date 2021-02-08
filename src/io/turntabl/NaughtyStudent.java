package io.turntabl;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    @Override
    public double getAverageGrade() {
        double actualGrade = super.getAverageGrade();
        return actualGrade + (actualGrade * (10/100));
    }

}
