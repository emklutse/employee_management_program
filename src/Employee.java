public class Employee {

    private int empID;
    private String empfName;
    private String emplName;
    private int empAge;
    private Gender empGender;
    private String empPost;
    private String phoneNum;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private double hoursWorked;
    private double payRate;
    private double grossPay;

    public Employee(int empID, String empfName, String emplName, int empAge, Gender empGender, String empPost, String phoneNum,
                    String address, String city, String state, String zip, String email, double hoursWorked,
                    double payRate, double grossPay) {
        this.empID = empID;
        this.empfName = empfName;
        this.emplName = emplName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empPost = empPost;
        this.phoneNum = phoneNum;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.email=email;
        this.hoursWorked=hoursWorked;
        this.payRate=payRate;
        this.grossPay=grossPay;
    }

    // Generating Getter & Setter
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpfName() {
        return empfName;
    }
    public void setEmpfName(String empfName) {
        this.empfName = empfName;
    }

    public String getEmplName() {
        return emplName;
    }
    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public Gender getEmpGender() {
        return empGender;
    }
    public void setEmpGender(Gender empGender) {
        this.empGender = empGender;
    }

    public String getEmpPost() {
        return empPost;
    }
    public void setEmpPost(String empPost) {
        this.empPost = empPost;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
    public String getEmail() {
        return email;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getGrossPay() {
        return payRate*hoursWorked;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum=phoneNum;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public void setState(String state) {
        this.state=state;
    }
    public void setZip(String zip) {
        this.zip=zip;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked=hoursWorked;
    }
    public void setPayRate(double payRate) {
        this.payRate=payRate;
    }
    public void setGrossPay(double grossPay) {
        this.grossPay=grossPay;
    }
}
