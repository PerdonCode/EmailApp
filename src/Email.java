import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternative;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call method asking for department - return department
    }

    // call method asking for department - return department
    private String setDepartment() {
        System.out.println("Enter department\n1 for sales\n2 for Development\n3 for accounting\n0 for none");
        Scanner sc = new Scanner(System.in);
        int departmentChoice = sc.nextInt();
        switch (departmentChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "nothing";
        }
    }

    // Ask department

    // generate random password

    // set mailbox capacity

    // set alternate email

    // Change password
}
