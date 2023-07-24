import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student groupLeader;
    private List<Student> group;
    private List<String> completedTasksByStudent;


    public StudentsGroup(Student groupLeader){
        if (groupLeader.getFirstName() == null && groupLeader.getLastName() == null){
            System.err.println("Group must have a Leader!");
        } else {
            this.groupLeader = groupLeader;
        }
        this.group = new ArrayList<>();
        this.completedTasksByStudent = new ArrayList<>();
    }
    public void changeGroupLeader(Student newGroupLeader) {
        if (newGroupLeader != null) {
            this.groupLeader = newGroupLeader;
        } else {
            System.err.println("Error: New group leader cannot be null!");
        }
    }
    public void addStudent(Student student) {
        if (groupLeader != null) {
            group.add(student);
        } else {
            System.err.println("Error: Group should have a leader!");
        }
    }

    public void removeStudent(Student student) {
        group.remove(student);
    }

    public void addTask(String task) {
        completedTasksByStudent.add(task);
    }

    public void removeTask(String task) {
        completedTasksByStudent.remove(task);
    }

    public void taskIsCompleted(Student student, String task) {
        if (group.contains(student)) {
            student.setTaskIsCompleted(true);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " completed Task: " + task);
        } else {
            System.err.println("Error: Student not found in the group.");
        }
    }


    public Student getGroupLeader() {
        return groupLeader;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(group);
    }

    public List<String> getCompletedTasks() {
        return new ArrayList<>(completedTasksByStudent);
    }}
