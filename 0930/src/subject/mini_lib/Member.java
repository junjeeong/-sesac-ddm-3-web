package subject.mini_lib;

import java.util.ArrayList;
import java.util.List;

public class Member {
    String name;
    String memberId; //고유 회원 ID
    List<Book> borrowedBooks = new ArrayList<>(); // List는 jdk가 제공하는 라이브러리 -> java.util 모듈에서 import해와야 함

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId =memberId;
    }
}
