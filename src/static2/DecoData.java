package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue++ -> 인스턴스 변수 접근. compile Error
        // instanceMethod() -> 인스턴스 메서드 접근. compile Error
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    // static 메서드에도 접근할 수 있다
    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue= " + staticValue);
    }
}
