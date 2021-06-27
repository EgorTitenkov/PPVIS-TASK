package abstraction;

import exception.GroupNotFoundException;
import exception.StudentNotFoundException;

import java.util.List;
import java.util.Map;

public interface AbstractTutor extends UniversityEmployee {
    List<AbstractStudent> getStudentsByGroup(AbstractGroup group) throws GroupNotFoundException;

    Map<AbstractStudent, AbstractGroup> searchStudentsBySurname(String surname) throws StudentNotFoundException;
}
