
import java.util.LinkedList;
import java.util.List;

public class Group {

    List<Student> studentsList = new LinkedList<>();
    private Student studentLead;
    List<String> tasksList = new LinkedList<>();

    Group(Student studentLead) {
        this.studentLead = studentLead;
        studentsList.add(studentLead);
        }

    public void changeLead(Student newStudentLead){
        studentLead=newStudentLead;
        }

    public void addStudent(Student newStudent) {
        studentsList.add(newStudent);
    }

    public void deleteStudent(Student studentToRemove) {
        studentsList.remove(studentToRemove);
    }

    public void renameStudent(Student studentToChange, String newFirstName, String newLastName ) {
        if (studentsList.contains(studentToChange)) {
            studentToChange.setFirstName(newFirstName);
            studentToChange.setLastName(newLastName);
        }
    }

    public void addTask(String newTask) {
        tasksList.add(newTask);
    }
}

