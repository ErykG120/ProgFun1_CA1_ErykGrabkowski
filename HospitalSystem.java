/**
 * Write a description of class HospitalSystem here.
 *
 * @ErykGrabkowski (your name)
 * @1.0.0 (a version number or a date)
 */

// Hospital Class
public class HospitalSystem {

    // Main Method
    public static void main(String[] args) {

        // Introduction Hospital System Message
        System.out.println("Hospital System");
        System.out.println(); // Blank Space
        System.out.print("Enter how many doctors are to be entered into the system: ");

        // Initialise Doctor Amount Array + EasyScanner Class
        int doctorAmount = EasyScanner.nextInt(); // Initialise Scanner
        Doctor[] doctorList = new Doctor[doctorAmount]; // Initialize Array (Doctor[doctorAmount] doctorList)

        // For Loop (Entering Doctor Details)
        for (int i = 0; i < doctorList.length; i++) {
            System.out.println("Entering Doctor " + (i + 1)); // Adding +1 each time.

            // Doctor Name
            System.out.print("Enter Doctor Name: ");
            String doctorname = EasyScanner.nextString();

            // Doctor PPS Number
            System.out.print("Enter Doctor PPS Number: ");
            String doctorpps = EasyScanner.nextString();

            // Doctor ID
            System.out.print("Enter Doctor ID: ");
            String doctorid = EasyScanner.nextString();

            // Doctor Salary
            System.out.print("Enter Doctor Salary: ");
            double doctorsalary = EasyScanner.nextDouble();

            // Update Array with details.
            Doctor doctor = new Doctor(doctorname, doctorpps, doctorid, doctorsalary);
            doctorList[i] = doctor; // doctorList Array = doctor details.

            System.out.println(); // Blank Space
        }

        // Print Doctor Details
        System.out.println("Doctor Details");
        printDetails(doctorList);

        // For Loop (New ID)
        for (int i = 0; i < doctorList.length; i++) {
            System.out.print("Please enter new ID for Doctor " + (i + 1)); // Adding +1 each time.
            String newID = EasyScanner.nextString();
            doctorList[i].setDocId(newID); // Setting ID in Array doctorList
            System.out.println(); // Blank Space
        }

        // Doctor Details Updated ID
        System.out.println("Doctors Details After ID Update ");
        printDetails(doctorList); // Call PrintDetails Method

        // For Loop (Getting Salary + Adding 1000)
        for (int i = 0; i < doctorList.length; i++) {
            double salary1 = doctorList[i].getSalary(); // Get Old Salary from doctorList Array
            salary1 += 1000.0; // Old Salary + 1000
            doctorList[i].setSalary(salary1); // Updating New Salary with +1000
        }

        // Print New Doctor Details After Salary
        System.out.println("Doctors Details After Salary Update ");
        printDetails(doctorList);
    }

    // PrintDetails Private Static Void (No Return) Method
    private static void printDetails(Doctor[] doctorList) { // Doctor[] Array doctorList ^
        // For Loop (Printing Doctor Details For doctorList [Amount of Doctors])
        for (int i = 0; i < doctorList.length; i++) {
            System.out.println("Doctor " + (i + 1) + " Details ");
            System.out.println("Doctor Name: " + doctorList[i].getName()); // Doctor
            System.out.println("Doctor PPS number: " + doctorList[i].getPpsNumber()); // Doctor PPS Number
            System.out.println("Doctor ID: " + doctorList[i].getDoctorId()); // Doctor ID
            System.out.println("Doctor Salary: " + doctorList[i].getSalary()); // Doctor Salary
            System.out.println(); // Blank Space
        }
    }
}