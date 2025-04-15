package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) { //Process 인터페이스를 매개변수로 받는다.
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randaomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위= " + randaomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++){
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}

//변하지 않는 부분은 유지하고 변하는 부분의ㅣ 코드 조각을 어떻게 전달 할 것이냐를 고민
