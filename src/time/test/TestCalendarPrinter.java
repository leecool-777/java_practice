package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year,month);

    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); //다음 달의 1일 날짜 객체.(while 종료 조건)

        //1일이 무슨요일인지 확인 -> 요일을 숫자로 변환
        //월요일= 1(1%7=1) ... 일요일=0 (7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        //1일이 시작되는 요일 앞에 공백 출력
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            // 현재 날짜의 '일' 출력 (두 자리 정렬)
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            // 현재 날짜가 토요일이면 줄바꿈 (한 주가 끝났으므로)
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            // 날짜 하루 증가
            dayIterator = dayIterator.plusDays(1);
        }
    }
}

