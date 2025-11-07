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
        }
}
