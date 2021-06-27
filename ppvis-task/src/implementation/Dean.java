package implementation;

import abstraction.AbstractDean;
import abstraction.AbstractGroup;
import abstraction.AbstractStudent;
import abstraction.AbstractUniversityDataBase;
import exception.GroupNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;
import exception.StudentNotStudyingException;

import java.util.Map;

public class Dean implements AbstractDean {
    private AbstractUniversityDataBase universityDataBase;

    public Dean(AbstractUniversityDataBase universityDataBase) {
        this.universityDataBase = universityDataBase;
    }

    @Override
    public void changeStudentCondition(AbstractStudent student, boolean status) throws StudentNotFoundException {
        universityDataBase.changeStudentStatus(student, status);
    }

    @Override
    public void transferStudentToGroup(AbstractStudent student, AbstractGroup target) throws StudentNotFoundException,
            StudentAlreadyExistsException, GroupNotFoundException, StudentNotStudyingException {
        universityDataBase.moveStudentToGroup(student, target);
    }

    @Override
    public Map<AbstractStudent, AbstractGroup> searchStudentsByTown(String town) throws StudentNotFoundException {
        return universityDataBase.searchStudentsByTown(town);
    }

    @Override
    public void setUniversityDB(AbstractUniversityDataBase universityDB) {
        this.universityDataBase = universityDB;
    }
}