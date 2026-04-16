public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        // User valid
        try {
            User user1 = new User("testuser", 25);
            repo.addUser(user1);
            System.out.println("User adăugat: " + user1.getUsername());
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        // AdminUser valid
        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            repo.addUser(admin);
            System.out.println("Admin adăugat: " + admin.getUsername());
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        // Username prea scurt
        try {
            User user2 = new User("ab", 22);
            repo.addUser(user2);
            System.out.println("User adăugat: " + user2.getUsername());
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        // Age negativ
        try {
            User user3 = new User("baduser", -5);
            repo.addUser(user3);
            System.out.println("User adăugat: " + user3.getUsername());
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        //User null
        try {
            User userNull = null;
            repo.addUser(userNull);
            System.out.println("User adăugat: null");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adăugare user null: " + e.getMessage());
        }
        // Afișare utilizatori validați
        System.out.println("\nUtilizatori validați:");
        for (User u : repo.getUsers()) {

            if (u instanceof AdminUser) {
                AdminUser admin = (AdminUser) u;
                System.out.println("Admin -> user: " + admin.getUsername() +
                        " varsta: " + admin.getAge() +
                        " permission level: " + admin.getPermissionLevel());
            } else {
                System.out.println("User -> user: " + u.getUsername() +
                        " varsta: " + u.getAge());
            }
        }
        }
    }