import java.util.*;

public class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<MedicalProfessional> staff = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addStaff(MedicalProfessional m) {
        staff.add(m);
    }

    public Patient findPatientByName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Patient> filterByDiagnosis(String diagnosis) {
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient p : patients) {
            if (p.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                result.add(p);
            }
        }
        return result;
    }

    public void sortPatientsByAge() {
        patients.sort(Comparator.comparingInt(Person::getAge));
    }
}
