package lang.string.test;

public class TestString3 {

    public static void main(String[] args) {
        String str = "hello.txt";

        String substring = str.substring(0,5);
        String substring2 = str.substring(5);
        System.out.println("firstName = " + substring);
        System.out.println("extName = " + substring2);
    }
}
