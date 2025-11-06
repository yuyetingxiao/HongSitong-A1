public class GeneralPractitioner extends HealthProfessional {

        private boolean providesFamilyCare;

        public GeneralPractitioner() {
            super();
            this.providesFamilyCare = false;
        }

        public GeneralPractitioner(int id, String name, String department, boolean providesFamilyCare) {
            super(id, name, department);
            this.providesFamilyCare = providesFamilyCare;
        }

        public void printGPDetails() {
            System.out.println("The health professional details are:");
            System.out.println("Type: General Practitioner (全科医生)");
            super.printDetails();
            System.out.println("Provides Family Care: " + (providesFamilyCare ? "Yes" : "No"));
        }

        public boolean isProvidesFamilyCare() {
            return providesFamilyCare;
        }
}
