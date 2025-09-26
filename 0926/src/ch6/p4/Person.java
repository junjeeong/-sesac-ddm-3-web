package ch6.p4;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public void setAge(int age){
        if(age > 150 || age < 0 ) {
            System.out.println("나이는 0~150 사이여야 합니다.");
            return;
        }
        this.age = age;
    }

    public void setEmail(String email){
        if(!email.contains("@")){
            System.out.println("이메일 형식이 아닙니다.");
            return;
        }
        this.email = email;
    }

    public void printPersonInfo(){
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("이메일: " + this.email);
    }
}
