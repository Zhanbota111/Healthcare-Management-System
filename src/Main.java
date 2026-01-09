public class Main {
    public static void main(String[] args) {


        Hospital hospital = new Hospital();

        Patient p1 = new Patient("Ali", 20, "Flu");
        Patient p2 = new Patient("Aruzhan", 25, "Cold");
        Patient p3 = new Patient("Dias", 30, "Flu");

        MedicalProfessional d1 =
                new MedicalProfessional("Dr. Smith", 45, "Cardiologist");
        MedicalProfessional d2 =
                new MedicalProfessional("Dr. Lee", 38, "Therapist");

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        hospital.addStaff(d1);
        hospital.addStaff(d2);

        System.out.println("Search patient by name:");
        System.out.println(hospital.findPatientByName("Ali"));

        System.out.println("\nPatients with Flu:");
        for (Patient p : hospital.filterByDiagnosis("Flu")) {
            System.out.println(p);
        }

        hospital.sortPatientsByAge();
        System.out.println("\nPatients sorted by age:");
        for (Patient p : hospital.filterByDiagnosis("Flu")) {
            System.out.println(p);
        }

        Person person = p1;
        System.out.println("\nPolymorphism check:");
        System.out.println(person.getRole());
    }
}
