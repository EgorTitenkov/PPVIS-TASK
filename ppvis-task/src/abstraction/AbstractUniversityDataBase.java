package abstraction;

import exception.*;

import java.util.List;
import java.util.Map;

public interface AbstractUniversityDataBase {
    List<AbstractStudent> getStudentsFromGroup(AbstractGroup group) throws GroupNotFoundException;

    Map<AbstractStudent, AbstractGroup> searchStudentsBySurname(String surname) throws StudentNotFoundException;

    void addGroup(AbstractGroup group) throws GroupAlreadyExistsException;

    void deleteGroup(AbstractGroup group) throws GroupNotFoundException;

    List<AbstractStudent> getStudentsByCourse(int course) throws StudentNotFoundException;

    void addStudentToGroup(AbstractStudent student, AbstractGroup group) throws StudentAlreadyExistsException,
            GroupNotFoundException;

    Map<AbstractStudent, AbstractGroup> searchStudentsByTown(String town) throws StudentNotFoundException;

    void moveStudentToGroup(AbstractStudent student, AbstractGroup target) throws StudentNotFoundException,
            GroupNotFoundException, StudentAlreadyExistsException, StudentNotStudyingException;

    void changeStudentStatus(AbstractStudent student, boolean status) throws StudentNotFoundException;
}