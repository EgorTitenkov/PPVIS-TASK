package abstraction;

import exception.GroupNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;
import exception.StudentNotStudyingException;

import java.util.Map;

public interface AbstractDean extends UniversityEmployee {
    void changeStudentCondition(AbstractStudent student, boolean status) throws StudentNotFoundException;

    void transferStudentToGroup(AbstractStudent student, AbstractGroup target) throws StudentNotFoundException,
            StudentAlreadyExistsException, GroupNotFoundException, StudentNotStudyingException;

    Map<AbstractStudent, AbstractGroup> searchStudentsByTown(String town) throws StudentNotFoundException;
}