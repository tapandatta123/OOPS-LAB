class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void showDoctor() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPatient() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Appointment {
    Doctor doctor;
    Patient patient;
    String date;

    Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    void schedule() {
        System.out.println("Appointment Scheduled on: " + date);
        doctor.showDoctor();
        patient.showPatient();
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }

    void showHospital() {
        System.out.println("Hospital Name: " + name);
    }
}

// Main class
public class Main {
    public static void main(String args[]) {

        Hospital h = new Hospital("City Hospital");

        Doctor d = new Doctor("Dr. Ravi", "Cardiologist");
        Patient p = new Patient("Usha", 25);

        Appointment a = new Appointment(d, p, "10-04-2026");

        h.showHospital();
        a.schedule();
    }
}