package practice.ch12_BaseModule.p1;

public class Student {
    String name;
    int studentId;
    int age;

    Student(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', studentId='%d', age='%d'}", name, studentId, age);
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;

        if(this.studentId == student.studentId) return true;
        else return false;
    }
}
