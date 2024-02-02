package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    /**
     * 기본 생성자
     * 1. 매개변수가 없는 생성자를 기본 생성자라 한다.
     * 2. 클래스에 생성자가 하나라도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본생성자를 자동으로 만들어준다.
     * 3. 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
     */

    /**
    추가
     */
void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
