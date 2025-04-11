package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); //반환된 참조값을 사용해서 메서드 호출을 계속 이어갈 수 있다.
        System.out.println("result = " + result);

    }
}
