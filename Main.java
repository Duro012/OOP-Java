public class Main {
    String name, password;
    int age;
    float height;

    void printUserDetails() {
        age = 23;
        height = 170;
        name = "jojoOOP";
        name.length(); //gets the length of string name
        password = "abcdef";
        if (password.contains("123456") || password.contains("abcdef")) {
            System.out.println("password is too short");
        }
    }

    public static void main(String[] args){
        CMP202 student = new Main();
        student.printUserDetails();
    }
}
