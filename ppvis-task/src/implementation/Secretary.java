package implementation;

import abstraction.AbstractGroup;
import abstraction.AbstractSecretary;
import abstraction.AbstractStudent;
import abstraction.AbstractUniversityDataBase;
import exception.GroupAlreadyExistsException;
import exception.GroupNotFoundException;
import exception.StudentAlreadyExistsException;
import exception.StudentNotFoundException;

import java.util.List;

public class Secretary implements AbstractSecretary {
    private AbstractUniversityDataBase universityDataBase;

    public Secretary(AbstractUniversityDataBase universityDB) {
        this.universityDataBase = universityDB;
    }

    @Override
    public void createGroup(String name, int course) throws GroupAlreadyExistsException {
        AbstractGroup group = new Group(name, course);
        universityDataBase.addGroup(group);
    }

    @Override
    public void deleteGroup(AbstractGroup group) throws GroupNotFoundException {
        universityDataBase.deleteGroup(group);
    }

    @Override
    public void addStudentToGroup(AbstractStudent student, AbstractGroup group) throws StudentAlreadyExistsException,
            GroupNotFoundException {
        universityDataBase.addStudentToGroup(student, group);
    }

    @Override
    public List<AbstractStudent> getStudentsFromGroup(AbstractGroup group) throws GroupNotFoundException {
        return universityDataBase.getStudentsFromGroup(group);
    }

    @Override
    public List<AbstractStudent> getStudentsByCourse(int course) throws StudentNotFoundException {
        return universityDataBase.getStudentsByCourse(course);
    }

    @Override
    public void setUniversityDB(AbstractUniversityDataBase universityDB) {
        this.universityDataBase = universityDB;
    }
}
