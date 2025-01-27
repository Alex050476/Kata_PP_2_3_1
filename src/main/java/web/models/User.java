package web.models;

public class User {
    private static int idGenerator;
    private int id;
    private String name;
    private String nickname;

    public User(String name, String nickname) {
        this.id = ++idGenerator;
        this.name = name;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
