package org.example.sinfishigrade;

public class PercentageGrade implements GradingStrategy {
    @Override
    public String getGrade(double grade) {
        return grade + "%";
    }
}
