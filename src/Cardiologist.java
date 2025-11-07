public class Cardiologist extends HealthProfessional {

        private String specialty;


        public Cardiologist() {
            super();
            this.specialty = "Unknown";
        }

        public Cardiologist(int id, String name, String department, String specialty) {
            super(id, name, department);
            this.specialty = specialty;
        }

        public void printCardioDetails() {
            System.out.println("The health professional details are:");
            System.out.println("Type: Cardiologist (心脏病科医生)");
            super.printDetails();
            System.out.println("Specialty: " + specialty);
        }

        public String getSpecialty() {
            return specialty;
        }
}
