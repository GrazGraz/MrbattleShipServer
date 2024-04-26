import java.io.Serializable;

public class Message implements Serializable {
    static final long serialVersionUID = 42L;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
