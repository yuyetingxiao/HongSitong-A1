import java.util.ArrayList;
public class AssignmentOne {
    public static void main(String[] args) {
        System.out.println("=== Part 3: Health Professional Objects ===");

        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Lisa", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Mike", "Family Medicine", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah", "Family Medicine", true);
        Cardiologist cardio1 = new Cardiologist(201, "Dr. John", "Cardiology", "Coronary Heart Disease");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Emma", "Cardiology", "Arrhythmia");

        gp1.printGPDetails();
        System.out.println("-----");
        gp2.printGPDetails();
        System.out.println("-----");
        gp3.printGPDetails();
        System.out.println("-----");
        cardio1.printCardioDetails();
        System.out.println("-----");
        cardio2.printCardioDetails();

        System.out.println("------------------------------");

        System.out.println("\n=== Part 5: Appointment Collection ===");

        ArrayList<Appointment> appointmentList = new ArrayList<>();

        createAppointment(appointmentList, "Alice", "0412345678", "09:00", gp1);
        createAppointment(appointmentList, "Bob", "0487654321", "14:30", gp2);
        createAppointment(appointmentList, "Charlie", "0423456789", "10:15", cardio1);
        createAppointment(appointmentList, "Diana", "0498765432", "15:45", cardio2);

        System.out.println("\n1. All Existing Appointments:");
        printExistingAppointments(appointmentList);

        System.out.println("\n2. Canceling Appointment for Mobile: 0487654321");
        cancelBooking(appointmentList, "0487654321");

        System.out.println("\n3. Updated Appointments After Cancellation:");
        printExistingAppointments(appointmentList);

        System.out.println("------------------------------");
    }

    public static void createAppointment(ArrayList<Appointment> list,
                                         String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {

        if (patientName == null || patientName.isEmpty() ||
                patientMobile == null || patientMobile.isEmpty() ||
                timeSlot == null || timeSlot.isEmpty() ||
                doctor == null) {
            System.out.println("Error: Missing required information. Appointment not created.");
            return;
        }

        Appointment newAppt = new Appointment(patientName, patientMobile, timeSlot, doctor);
        list.add(newAppt);
        System.out.println("Appointment created successfully for " + patientName);
    }

    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\nAppointment " + (i + 1) + ":");
            list.get(i).printAppointmentDetails();
        }
    }

    public static void cancelBooking(ArrayList<Appointment> list, String targetMobile) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            Appointment appt = list.get(i);
            if (appt.getPatientMobile().equals(targetMobile)) {
                list.remove(i);
                found = true;
                System.out.println("Success: Appointment for mobile " + targetMobile + " canceled.");
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for mobile " + targetMobile + ".");
        }
    }
}