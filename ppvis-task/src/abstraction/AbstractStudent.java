package abstraction;

public interface AbstractStudent {
    String getSurname();

    String getTown();

    boolean isLearns();

    void setStudying(boolean status);

    boolean hasSameSurname(AbstractStudent student);
}
