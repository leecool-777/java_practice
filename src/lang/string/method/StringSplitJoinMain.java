package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }


        //join 전
        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr +=string;
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);



        //join() 후
        String joinedStr = String.join("-", "a", "b", "c");
        System.out.println("연결된 문자열: " + joinedStr);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
