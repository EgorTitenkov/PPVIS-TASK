package implementation;

import abstraction.AbstractStudent;

public class Student implements AbstractStudent {
    private final String surname;
    private final String town;
    private boolean studying;

    public Student(String surname, String town) {
        this.surname = surname;
        this.town = town;
        studying = false;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public boolean isLearns() {
        return studying;
    }

    @Override
    public boolean hasSameSurname(AbstractStudent student) {
        return student.getSurname().equals(surname);
    }

    @Override
    public synchronized void setStudying(boolean status) {
        this.studying = status;
    }
}
