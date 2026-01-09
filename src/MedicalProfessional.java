public class MedicalProfessional extends Person {
    private String specialization;

    public MedicalProfessional(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "Medical Professional";
    }

    @Override
    public String toString() {
        return super.toString() + ", specialization=" + specialization;
    }
}
