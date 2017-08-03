package hello;

/**
 * Created by aaron on 8/2/17.
 */
public class UserPojo {

    int id;
    String f_name;
    String l_name;

    public UserPojo(int id, String f_name, String l_name) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
}
