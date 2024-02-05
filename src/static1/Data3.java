package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++;  // static 으로 해서 공용으로 사용할 것.
    }
}
