package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter(); // 0으로 초기화


        Data2 data1 = new Data2("A", counter);
        System.out.println("A count= " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count= " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count= " + counter.count);
    }
}
