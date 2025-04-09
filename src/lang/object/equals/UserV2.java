package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override //equlas() 오버라이딩
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //UserV2로 다운캐스팅 Object에는 id인스턴스가 없기때문
        return id.equals(user.id);
    }
    */

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}
