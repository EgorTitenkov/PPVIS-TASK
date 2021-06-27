package implementation;

import abstraction.AbstractGroup;
import abstraction.AbstractStudent;
import abstraction.AbstractTutor;
import abstraction.AbstractUniversityDataBase;
import exception.GroupNotFoundException;
import exception.StudentNotFoundException;

import java.util.List;
import java.util.Map;

public class Tutor implements AbstractTutor {
    private AbstractUniversityDataBase universityDataBase;

    public Tutor(AbstractUniversityDataBase universityDB) {
        this.universityDataBase = universityDB;
    }

    @Override
    public List<AbstractStudent> getStudentsByGroup(AbstractGroup group) throws GroupNotFoundException {
        return universityDataBase.getStudentsFromGroup(group);
    }

    @Override
    public Map<AbstractStudent, AbstractGroup> searchStudentsBySurname(String surname) throws StudentNotFoundException {
        return universityDataBase.searchStudentsBySurname(surname);
    }

    @Override
    public void setUniversityDB(AbstractUniversityDataBase universityDB) {
        this.universityDataBase = universityDB;
    }
}
