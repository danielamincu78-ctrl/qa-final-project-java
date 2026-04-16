public class AdminUser extends User {
    private String permissionLevel;

    // Constructor
    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age); // apelăm constructorul clasei de bază
        this.permissionLevel = permissionLevel;
    }

    // Getter
    public String getPermissionLevel() {
        return permissionLevel;
    }

    // Setter
    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}