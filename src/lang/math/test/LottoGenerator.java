package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random(); //랜덤클래스 생성
    private int[] lottoNumbers;                 //로또 번호 저장 배열 생성
    private int count;                          //저장된 번호 갯수

    public int[] generate() {       //실행할 때 마다 새롭게 만듦
        lottoNumbers = new int[6];  //로또 배열 초기화(6칸)
        count = 0;                  //count 0으로 초기화

        while (count < 6) {         //6개를 뽑을 때까지 반복

            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;

            //중복되지 않은 경우에만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number; //count는 곧 다음에 저장될 인덱스를 의미
                count++;    //중복되지 않으면 인덱스 하나 증가
            }
        }
        return lottoNumbers;    //최종적으로 완성된 6개 로또 번호 배열 봔환
    }

    //이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) { //
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }

}
