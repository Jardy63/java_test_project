public class Client {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String passport;

    public Client (String fullName, String phoneNumber, String email, String passport) {
        this.fullName=fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passport = passport;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return this.passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

}
