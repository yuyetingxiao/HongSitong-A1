public class Appointment {

        private String patientName;
        private String patientMobile;
        private String timeSlot;
        private HealthProfessional selectedDoctor;

        public Appointment() {
            this.patientName = "Unknown";
            this.patientMobile = "Unknown";
            this.timeSlot = "Unknown";
            this.selectedDoctor = new HealthProfessional();
        }

        public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
            this.patientName = patientName;
            this.patientMobile = patientMobile;
            this.timeSlot = timeSlot;
            this.selectedDoctor = selectedDoctor;
        }

        public void printAppointmentDetails() {
            System.out.println("Patient Name: " + patientName);
            System.out.println("Patient Mobile: " + patientMobile);
            System.out.println("Appointment Time: " + timeSlot);
            System.out.println("Selected Doctor Information:");

            if (selectedDoctor instanceof GeneralPractitioner) {
                ((GeneralPractitioner) selectedDoctor).printGPDetails();
            } else if (selectedDoctor instanceof Cardiologist) {
                ((Cardiologist) selectedDoctor).printCardioDetails();
            } else {
                selectedDoctor.printDetails();
            }
        }

        public String getPatientMobile() {
            return patientMobile;
        }
}
