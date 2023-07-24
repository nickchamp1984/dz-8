public class App {
    public static void main(String[] args) {

        String task1 = "Study encapsulation";
        String task2 = "Study inheritance";
        String task3 = "Study polymorphism";

        Student student1 = new Student(1, "Vasya", "Pupkin");
        Student student2 = new Student(2, "Sveta", "Sokolova");
        Student student3 = new Student(3, "Jane", "Doe");
        Student student4 = new Student();

        StudentsGroup group = new StudentsGroup(student2);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        group.addTask(task1);
        group.addTask(task2);
        group.addTask(task3);

        group.taskIsCompleted(student3, task3);
        group.taskIsCompleted(student2, task2);

        System.out.println("Group Leader is: " + group.getGroupLeader());
        System.out.println("Students list is: " + group.getStudents());
        System.out.println("Tasks assigned to the group are: " + group.getCompletedTasks());

        group.changeGroupLeader(student3);
        group.removeStudent(student3);
        System.out.println("New Group Leader is: " + group.getGroupLeader());
        System.out.println("Students list after removal is: " + group.getStudents());

        System.out.println("Has " + student1.getFirstName() + " " + student1.getLastName() + " completed assigned task? - " + student1.isTaskIsCompleted());

    }
}
