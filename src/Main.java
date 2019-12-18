import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    static ArrayList<Employee> list=new ArrayList<>();
    static int person,sizeList,location;
    // static Employee empArray[];

    // main method
    public static void main(String[] args) {
        System.out.println("How many students are employed?");
        sizeList =scanner.nextInt();
        //empArray=new Employee[sizeList];
         mainMenu();
    }

    // Main menu
    private static void mainMenu() {
        char ch;
        do{
            System.out.println("----------------------------");
            System.out.println("         Main Menu          ");
            System.out.println(" 1 -------> Add Employee    ");
            System.out.println(" 2 -------> Display Employee");
            System.out.println(" 3 -------> Delete Employee ");
            System.out.println(" 4 -------> Update Employee ");
            System.out.println(" 5 -------> Exit    ");
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("      Enter your Choice     ");

            switch (scanner.nextInt()){
                case 1: getEmp();
                break;
                case 2: display();
                break;
                case 3: delete();
                    break;
                case 4: updateEmp();
                    break;
                case 5: systemExit();
                break;
                default:
                    System.out.println("-------------\n");
                    System.out.println(" Invalid Key\n");
                    System.out.println("--------------");
            }   // end of switch

            System.out.println("Do you want to go to the Menu again: y/n ?");
            ch=scanner.next().charAt(0);
            if (ch=='n'){
                System.out.println("------------\n");
                System.out.println("  GOOD BYE\n");
                System.out.println("------------");
                systemExit();
            }
            else {}
        }while (ch=='y' || ch=='Y');
    }

    // Delete an employee record
    private static void delete() {
        if(list.isEmpty())
        display();
        else {
            System.out.println("------------------------");
            System.out.println("   Select an employee   ");
            for (var i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getEmpID() + " for " + list.get(i).getEmpfName()+" "+list.get(i).getEmplName());
            }
            System.out.println("0 for Main Menu         ");
            System.out.println("------------------------");
            location = scanner.nextInt();
            if (location == 0)
                mainMenu();
    else {
            for (var i = (location - 1); i < list.size(); i++) {
                list.remove(location - 1);
                break;
            }
            System.out.println("The Size of array " + list.size()); }
        }
    }

    // Modify an employee record
    private static void updateEmp() {
        if (list.isEmpty()) {
            display();
        }
        else {

            char select;
            System.out.println("------------------------");
            System.out.println("   Select a Employee   ");
            for (var i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getEmpID() + " for " + list.get(i).getEmpfName()+" "+list.get(i).getEmplName());
            }
            System.out.println("0 for Main Menu         ");
            System.out.println("------------------------");
            person = scanner.nextInt();

            if (person == 0)
                mainMenu();

            else if (person > 0 && person <= list.size()) {
                do {
                    System.out.println("-------------------------");
                    System.out.println(list.get(person - 1).getEmpfName() + "'s Profile Update");
                    System.out.println(" 1  Update ID ");
                    System.out.println(" 2  Update name");
                    System.out.println(" 3  Update age ");
                    System.out.println(" 4  Update gender ");
                    System.out.println(" 5  Update post ");
                    System.out.println(" 6  Update address ");
                    System.out.println(" 7  Update email");
                    System.out.println(" 8  Update phone number ");
                    System.out.println(" 9  Update hours worked ");
                    System.out.println(" 10  Update payrate ");
                    System.out.println(" 11  Exit ");
                    System.out.println("Select any Choice ----->");

                    switch (scanner.nextInt()) {
                        case 1:
                            updateId();
                            break;
                        case 2:
                            updateName();
                            break;
                        case 3:
                            updateAge();
                            break;
                        case 4:
                            updateGender();
                            break;
                        case 5:
                            updatePost();
                            break;
                        case 6:
                            updateAddress();
                            break;
                        case 7:
                            updateEmail();
                            break;
                        case 8:
                            updatePhone();
                            break;
                        case 9:
                            updateHours();
                            break;
                        case 10:
                            updatePayrate();
                            break;
                        case 11:
                            mainMenu();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    System.out.println("Do you want to update anything about " + list.get(person - 1).getEmpfName() + " ?");
                    select = scanner.next().charAt(0);
                    if (select == 'n') {
                        System.out.println("------------------------------");
                        System.out.println("|||| Exiting From Profile ||||");
                        System.out.println("------------------------------");
                        break;
                    }
                } while (select == 'y' || select == 'Y');
            }
        }
    }
    private static void updateId(){
        System.out.println("Enter id to update ");
        list.get(person-1).setEmpID(scanner.nextInt());
    }
    private static void updateName(){
        System.out.println("Enter name to update");
        list.get(person-1).setEmpfName(scanner.next().toUpperCase());
        list.get(person-1).setEmplName(scanner.next().toUpperCase());
    }
    private static void updateAge(){
        System.out.println("Enter Age to update");
        list.get(person-1).setEmpAge(scanner.nextInt());
    }
    private static void updateGender(){
        System.out.println("Enter Gender (M/F/O) to update");
        list.get(person-1).setEmpGender(Gender.valueOf(scanner.next().toUpperCase()));
    }
    private static void updatePost(){
        System.out.println("Enter Post to update");
        list.get(person-1).setEmpPost(scanner.next().toUpperCase());
    }
    private static void updatePhone(){
        System.out.println("Enter phone number to update");
        list.get(person-1).setPhoneNum(scanner.next().toUpperCase());
    }
    private static void updateAddress(){
        System.out.println("Enter address to update");
        list.get(person-1).setAddress(scanner.next().toUpperCase());
        System.out.println("Enter city to update");
        list.get(person-1).setCity(scanner.next().toUpperCase());
        System.out.println("Enter state to update");
        list.get(person-1).setState(scanner.next().toUpperCase());
        System.out.println("Enter zip to update");
        list.get(person-1).setZip(scanner.next().toUpperCase());
    }
    private static void updateEmail(){
        System.out.println("Enter email to update");
        list.get(person-1).setEmail(scanner.next().toUpperCase());
    }
    private static void updateHours(){
        System.out.println("Enter hours worked to update");
        list.get(person-1).setHoursWorked(scanner.nextDouble());
    }
    private static void updatePayrate(){
        System.out.println("Enter pay rate to update");
        list.get(person-1).setPayRate(scanner.nextDouble());
    }

    //Display all details
    private static void display() {
        char ch;
        if (list.isEmpty())
        {
            System.out.println("Please Enter some Details First");
            System.out.println("---> Do you want to enter Details y/n ?");
            ch=scanner.next().charAt(0);
            if(ch=='n'){
                System.out.println("------------------------------");
                System.out.println("|||| Going To Main menu  ||||");
                System.out.println("------------------------------");
                mainMenu();
            }
            else {
                System.out.println("----------------------------------");
                System.out.println("|||| Adding Employee Details  ||||");
                System.out.println("----------------------------------");
                getEmp();
            }
        }

        else if (list.size() == sizeList) {
            System.out.println("\n The Size Is Full ");
            System.out.println(" Details Are ");

            for (var i = 0; i < list.size(); i++) {
                System.out.println("----------------------------");
                System.out.println(" Id "+  list.get(i).getEmpID());
                System.out.println(" Name "+ list.get(i).getEmpfName()+" "+list.get(i).getEmplName());
                System.out.println(" Age " + list.get(i).getEmpAge());
                System.out.println(" Gender "+list.get(i).getEmpGender());
                System.out.println(" Post "+list.get(i).getEmpPost());
                System.out.println(" Phone "+list.get(i).getPhoneNum());
                System.out.println(" Address "+list.get(i).getAddress()+", "+list.get(i).getCity()+", "+list.get(i).getState()+", "+list.get(i).getZip());
                System.out.println(" Email "+list.get(i).getEmail());
                System.out.println(" Hours Worked "+list.get(i).getHoursWorked());
                System.out.println(" Pay Rate "+list.get(i).getPayRate());
                System.out.println(" Gross Pay "+list.get(i).getGrossPay());
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
        } else {
            System.out.println(" Details Are ");
            for (var i = 0; i < list.size(); i++) {
                System.out.println("-----------------------------");
                System.out.println(" Id "+ list.get(i).getEmpID());
                System.out.println(" Name "+ list.get(i).getEmpfName()+" "+list.get(i).getEmplName());
                System.out.println(" Age " + list.get(i).getEmpAge());
                System.out.println(" Gender "+list.get(i).getEmpGender());
                System.out.println(" Post "+list.get(i).getEmpAge());
                System.out.println(" Phone "+list.get(i).getPhoneNum());
                System.out.println(" Address "+list.get(i).getAddress()+", "+list.get(i).getCity()+", "+list.get(i).getState()+", "+list.get(i).getZip());
                System.out.println(" Email "+list.get(i).getEmail());
                System.out.println(" Hours Worked "+list.get(i).getHoursWorked());
                System.out.println(" Pay Rate "+list.get(i).getPayRate());
                System.out.println(" Gross Pay "+list.get(i).getGrossPay());
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
        }
    }

    //Getting employee Details
    private static void getEmp() {
        int id;
        String fname;
        String lname;
        int age;
        Gender gender;
        String post;
        String phone;
        String address;
        String city;
        String state;
        String zip;
        String email;
        double hours;
        double payrate;
        double grosspay;

        if(list.size()==sizeList)
            display();

        else if(list.isEmpty()) {

                for(var i=0;i<sizeList;i++){
                    System.out.println("Enter employee # "+(i+1)+"'s details");
                    System.out.println("Enter Id");
                    id=scanner.nextInt();
                    System.out.println(" Enter First Name ");
                    fname=scanner.next().toUpperCase();
                    System.out.println(" Enter Last Name ");
                    lname=scanner.next().toUpperCase();
                    System.out.println("Enter Age");
                    age=scanner.nextInt();
                    System.out.println("Enter Gender, M for Male or F for Female or O for Other");
                    gender=Gender.valueOf(scanner.next().toUpperCase());
                    System.out.println("Enter Post");
                    post=scanner.next().toUpperCase();
                    System.out.println("Enter phone number");
                    phone=scanner.next().toUpperCase();
                    System.out.println("Enter address");
                    address=scanner.next().toUpperCase();
                    scanner.nextLine();
                    System.out.println("Enter city");
                    city=scanner.next().toUpperCase();
                    System.out.println("Enter state");
                    state=scanner.next().toUpperCase();
                    System.out.println("Enter zip");
                    zip=scanner.next().toUpperCase();
                    System.out.println("Enter email");
                    email=scanner.next().toUpperCase();
                    System.out.println("Enter hours worked");
                    hours=scanner.nextDouble();
                    System.out.println("Enter pay rate");
                    payrate=scanner.nextDouble();
                    grosspay=hours*payrate;
                    //empArray[i]=new Employee(id,name,age,gender,post);
                    list.add(i,new Employee(id,fname,lname,age,gender,post,phone,address,city,state,zip,email,hours,payrate,grosspay));
                }
        }
        else {
            for(var i=(list.size()-1);i<(sizeList-1);i++){
                System.out.println("Enter "+(i+1)+" no Employee Details");
                System.out.println("Enter Id");
                id=scanner.nextInt();
                System.out.println(" Enter First Name ");
                fname=scanner.next().toUpperCase();
                System.out.println(" Enter Last Name ");
                lname=scanner.next().toUpperCase();
                System.out.println("Enter Age");
                age=scanner.nextInt();
                System.out.println("Enter Gender, M for Male or F for Female or O for Other");
                gender=Gender.valueOf(scanner.next().toUpperCase());
                System.out.println("Enter Post");
                post=scanner.next().toUpperCase();
                System.out.println("Enter phone number");
                phone=scanner.next().toUpperCase();
                System.out.println("Enter address");
                address=scanner.next().toUpperCase();
                System.out.println("Enter city");
                city=scanner.next().toUpperCase();
                System.out.println("Enter state");
                state=scanner.next().toUpperCase();
                System.out.println("Enter zip");
                zip=scanner.next().toUpperCase();
                System.out.println("Enter email");
                email=scanner.next().toUpperCase();
                System.out.println("Enter hours worked");
                hours=scanner.nextDouble();
                System.out.println("Enter pay rate");
                payrate=scanner.nextDouble();
                grosspay=hours*payrate;
                //empArray[i]=new Employee(id,name,age,gender,post);
                list.add(i,new Employee(id,fname,lname,age,gender,phone,post,address,city,state,zip,email,hours,payrate,grosspay));
            }
        }
    }

    // System status 0 exit
    private static void systemExit() {
        System.exit(0);
    }
}
