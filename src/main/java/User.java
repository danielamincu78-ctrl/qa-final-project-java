public class User {
    private String username;
    private int age;

    // Constructor
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Getteri
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    // Setteri
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
}