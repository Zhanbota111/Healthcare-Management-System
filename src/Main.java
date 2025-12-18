public class Patient {
    private String name;
    private int age;
    private String illness;

    // Constructor
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    // Method
    public void displayInfo() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Illness: " + illness);
    }
}
public class MedicalProfessional {
    private String name;
    private String specialization;
    private int experience;

    // Constructor
    public MedicalProfessional(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Method
    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " +
                specialization + ", Experience: " + experience + " years");
    }
}
public class Hospital {
    private String name;
    private String address;

    // Constructor
    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method
    public void displayInfo() {
        System.out.println("Hospital: " + name + ", Address: " + address);
    }
}
public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Ali", 20, "Flu");
        Patient patient2 = new Patient("Aruzhan", 22, "Cold");

        MedicalProfessional doctor =
                new MedicalProfessional("Dr. Smith", "Therapist", 10);

        Hospital hospital =
                new Hospital("City Hospital", "Almaty");

        // Output to console
        patient1.displayInfo();
        patient2.displayInfo();
        doctor.displayInfo();
        hospital.displayInfo();

        // Compare patients
        if (patient1.getAge() > patient2.getAge()) {
            System.out.println(patient1.getName() + " is older than " + patient2.getName());
        } else {
            System.out.println(patient2.getName() + " is older than " + patient1.getName());
        }
    }
}
