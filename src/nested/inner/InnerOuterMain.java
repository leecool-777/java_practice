package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        //내부 클래스는 바깥 클래스의 인스턴스에 소속되어야 한다. 따라서 내부클래스를 생성할 때 ,
        //바깥 클래스의 인스턴스 참조가 필요하다.
        //바깥 클래스를 인스턴스를 먼저 생성해야 내부클래스의 인스턴스를 생성할 수 있다.

        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
