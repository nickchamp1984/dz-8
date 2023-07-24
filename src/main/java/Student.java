public class Student {

    private int id = 1;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isTaskIsCompleted() {
        return taskIsCompleted;
    }

    private boolean taskIsCompleted = false;

    public void setTaskIsCompleted(boolean completed) {
        this.taskIsCompleted = completed;
    }

    public Student(int id, String firstName, String lastName, boolean taskIsCompleted) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setTaskIsCompleted(taskIsCompleted);
    }

    public Student() {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setTaskIsCompleted(taskIsCompleted);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(int id) {
        this.id = id++;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
