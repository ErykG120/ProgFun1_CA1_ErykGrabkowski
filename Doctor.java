/**
 * Write a description of class Doctor here.
 *
 * @ErykGrabkowski (your name)
 * @1.0.0 (a version number or a date)
 */

// Doctor Class
public class Doctor {
    // The Attributes
    private String name; // Name
    private String ppsNumber; // PPSNumber
    private String doctorId; // DoctorID
    private double salary; // Salary

    // The Methods

    // The Constructor
    public Doctor(String nameIn, String ppsNumberIn, String doctorIdIn, double salaryIn) {
        name = nameIn;
        ppsNumber = ppsNumberIn;
        doctorId = doctorIdIn;
        salary = salaryIn;
    }

    // Set Methods

    // SetName
    public void setName(String nameIn) {
        name = nameIn;
    }

    // SetPPSNumber
    public void setPpsNumber(String ppsNumberIn) {
        ppsNumber = ppsNumberIn;
    }

    // SetDoctorID
    public void setDocId(String doctorIdIn) {
        doctorId = doctorIdIn;
    }

    // SetSalary
    public void setSalary(double salaryIn) {
        salary = salaryIn;
    }

    // Get Methods

    // GetName
    public String getName() {
        return name;
    }

    // GetPPSNumber
    public String getPpsNumber() {
        return ppsNumber;
    }

    // GetDoctorID
    public String getDoctorId() {
        return doctorId;
    }

    // GetSalary
    public double getSalary() {
        return salary;
    }
}