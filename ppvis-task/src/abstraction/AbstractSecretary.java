package abstraction;

import exception.GroupAlreadyExistsException;
import exception.GroupNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;

import java.util.List;

public interface AbstractSecretary extends UniversityEmployee {
    void createGroup(String name, int course) throws GroupAlreadyExistsException;

    void deleteGroup(AbstractGroup group) throws GroupNotFoundException;

    List<AbstractStudent> getStudentsFromGroup(AbstractGroup group) throws GroupNotFoundException;

    List<AbstractStudent> getStudentsByCourse(int course) throws StudentNotFoundException;

    void addStudentToGroup(AbstractStudent student, AbstractGroup group) throws StudentAlreadyExistsException,
            GroupNotFoundException;
}
