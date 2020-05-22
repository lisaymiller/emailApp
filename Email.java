public class Email {

    private String firstName, lastName, department, company;

    public Email(String firstName, String lastName, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getCompany() {
        return company;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return this.firstName + "." + this.lastName + "@" + this.department + "." + this.company + ".com";
    }
}