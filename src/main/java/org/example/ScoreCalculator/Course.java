package org.example.ScoreCalculator;

public class Course {
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    private String courseName;
    private int creditScore;
    private String grade;

    public Course(String courseName, int creditScore, String grade) {
        this.courseName = courseName;
        this.creditScore = creditScore;
        this.grade = grade;
    }

    public int getCreditScore() {
        return creditScore;
    }
    public double getGrade() {
        double result = 0.0;
        if(grade.equals("A+"))
            result = 4.5;
        else if(grade.equals("A"))
            result = 4.0;
        else if(grade.equals("B+"))
            result = 3.5;
        else if(grade.equals("B"))
            result = 3.0;
        else if(grade.equals("C+"))
            result = 2.5;
        else if(grade.equals("C"))
            result = 2.0;
        else if(grade.equals("D+"))
            result = 1.5;
        else if(grade.equals("D"))
            result = 1.0;
        else if(grade.equals("F"))
            result = 0.0;

        return result;
    }
}
