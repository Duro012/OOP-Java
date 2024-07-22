public class Users {
    String name;
    private String schoolName = "bingham university";
    private String password;
    String login() {
        return "logged in";
    }

    String register() {
        if (name.equals("") || password.equals("")) {
            return "field is empty";
        } else {
            return "Success";
        }
    }

    String getName() {
        return schoolName;
    }

    void setName(String name) {
        this.name = name;
    }
}
