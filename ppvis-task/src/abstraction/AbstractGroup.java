package abstraction;

import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;

import java.util.List;

public interface AbstractGroup {
    List<AbstractStudent> getStudents();

    AbstractStudent getStudentBySurname(String surname) throws StudentNotFoundException;

    void addStudent(AbstractStudent student) throws StudentAlreadyExistsException;

    void deleteStudent(AbstractStudent student) throws StudentNotFoundException;

    List<AbstractStudent> getStudentsByTown(String town) throws StudentNotFoundException;

    int getCourse();

    String getName();

    boolean contains(AbstractStudent student);
}
