package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원1", address);
        MemberV2 memberB = new MemberV2("회원2", address);

        //회원 A, 회원 B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


        //회원 B의 주소를 부산으로 변경해야함
        //컴파일 오류memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmutableAddress("부산")); // 새로운 address 객체를 생성함
        System.out.println("부산 - > memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
