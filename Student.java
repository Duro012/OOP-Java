public class Student extends Users{
    String matricNo;
    String admissionNo;
    

    @Override
    String register() {
        if (admissionNo.equals("") || matricNo.equals("")) {
            return "can't be empty";
        } else {
            return "success";
        }
    }

    void registerCourses(String course) {
        System.out.println(course);
    }

    String checkResult() {
        return "cmp202" + " " + 70;
    }

    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.getName();
        newStudent.registerCourses("cmp202");
        System.out.println(newStudent.checkResult());
    }

}
