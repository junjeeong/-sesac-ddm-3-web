package ch6.p7;

public class Grade {
    String studentName;
    int korean;
    int english;
    int math;
    int totalScore;
    double average;
    char grade;

    public Grade(String studentName, int korean, int english, int math) {
        this.studentName = studentName;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.totalScore = korean + english + math;
    }

    void calculateTotal(){
        this.totalScore = korean + english + math;
    }

    void calculateAverage(){
        this.average = (korean + english + math)/3;
    }

    void getGrade () {
        if(this.average >= 90) {
            this.grade = 'A';
        } else if (this.average >= 80) {
            this.grade = 'B';
        } else if (this.average >= 70) {
            this.grade = 'C';
        } else if (this.average >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }

    }

    void printReport() {
        System.out.println("===성적표===");
        System.out.println("학생명: " + this.studentName + "점");
        System.out.println("국어: " + this.korean + "점");
        System.out.println("영어: " + this.english + "점");
        System.out.println("수학: " + this.math + "점");
        System.out.println("총점: " + this.totalScore + "점");
        System.out.println("평균: " + this.average + "점");
        System.out.println("등급: " + this.grade);
    }

}
