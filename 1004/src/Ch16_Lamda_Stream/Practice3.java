package Ch16_Lamda_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 22),
                new User("David", 28)
        );

        List<String> userNameList = users.stream()
                .filter(user -> user.getAge() >= 25)
                .map(user -> user.getName())
                .toList();

        System.out.println(userNameList);

        // 목표 출력 :  [Alice, Bob, David]
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}