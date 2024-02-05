package static1;

public class DataCountMain1 {
    public static void main(String[] args) {


        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");  // 새로운 인스턴스값이 생성되는 거고 아예 count 초기 값이 1임
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");  // 멤버 인스턴스끼리 공유되지 않는다
        System.out.println("C count=" + data3.count);

    }
}
