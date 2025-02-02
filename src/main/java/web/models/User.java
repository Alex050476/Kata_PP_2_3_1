package web.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    private static int idGenerator;
    private int id;

    @NotEmpty(message = "Fill the field")
    @Size(min = 2, max = 50, message = "Name should be between 2 & 50 chars")
    private String name;

    @NotEmpty(message = "Fill the field")
    @Size(min = 2, max = 50, message = "Name should be between 2 & 50 chars")
    private String nickname;

    public User() {}

    public User(String name, String nickname) {
        this.id = ++idGenerator;
        this.name = name;
        this.nickname = nickname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        User.idGenerator = idGenerator;
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
