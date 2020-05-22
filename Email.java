import java.util.Scanner;

public class Email {

    private String firstName, lastName, password, department, email, alternateEmail;
    private int mailboxCap = 500;
    private String company = "aeycompany.com";
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED\n" + this.firstName + " " + this.lastName);

        this.department = setDepartment();

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + company;
        System.out.println("Your email is: " + email);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "sales.";
        } else if (deptChoice == 2) {
            return "development.";
        } else if (deptChoice == 3) {
            return "accounting.";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCap(int capacity) {
        this.mailboxCap = capacity;
    }

    public int getMailboxCap() {
        return mailboxCap;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setChangePassword(String password) {
        this.password = password;
    }

    public String getChangedPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
                + mailboxCap + "mb";
    }

}