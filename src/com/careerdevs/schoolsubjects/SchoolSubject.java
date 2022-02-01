package com.careerdevs.schoolsubjects;

public class SchoolSubject {
    public String subject;
    public int grade;
    public boolean isFav;

    public SchoolSubject(String subject, int grade, boolean isFav) {
        this.subject = subject;
        this.grade = grade;
        this.isFav = isFav;
    }

    @Override
    public String toString() {
        return "High School{" +
                "subject='" + subject + '\'' +
                ", grade ='" + grade + '\'' +
                ", is favorite=" + isFav +
                '}';
    }

}
