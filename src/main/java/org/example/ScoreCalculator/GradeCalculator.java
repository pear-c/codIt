package org.example.ScoreCalculator;

import java.util.ArrayList;

public class GradeCalculator {
    private String name;
    private double score;
    private int credits;
    private ArrayList<Course> list = new ArrayList<>();

    public GradeCalculator(String name, double score, int credits) {
        this.name = name;
        this.score = score;
        this.credits = credits;
    }

    public void addCourse(Course course) {
        list.add(course);
    }

    public void print() {
        // 직전 학기 성적
        System.out.println("직전 학기 성적: " + score + " (총 " + credits + "학점)");

        // 이번 학기 성적
        int nowCredits = 0;
        double nowScore = 0.0;
        for(Course course : list) {
            nowScore += (course.getGrade() * course.getCreditScore());
            nowCredits += course.getCreditScore();
        }
        System.out.println("이번 학기 성적: " + nowScore / nowCredits + " (총 " + nowCredits + "학점)");

        // 전체 예상 학점
        int totalCredits = nowCredits + credits;
        double totalScore = (score*credits) + nowScore;
        System.out.println("전체 예상 학점: " + totalScore / totalCredits + " (총 " + totalCredits + "학점)");
    }
}
