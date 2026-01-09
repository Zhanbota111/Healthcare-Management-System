public class Patient extends Person {
    private String diagnosis;

    public Patient(String name, int age, String diagnosis) {
        super(name, age);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return super.toString() + ", diagnosis=" + diagnosis;
    }
}
