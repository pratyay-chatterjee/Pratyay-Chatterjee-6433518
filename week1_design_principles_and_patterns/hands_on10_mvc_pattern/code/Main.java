public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student("John Doe", "12022002028084", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        System.out.println("\n--- Updating Student Details ---\n");

        // Update data
        controller.setStudentName("Pratyay Chatterjee");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
