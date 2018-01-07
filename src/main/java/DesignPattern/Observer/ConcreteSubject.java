package DesignPattern.Observer;

public class ConcreteSubject extends Subject {

    public String getSubjectState() {
        return this.subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
