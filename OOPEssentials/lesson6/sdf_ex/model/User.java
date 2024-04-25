package lesson6.sdf_ex.model;

public class User {
    private String name;
    private String lastName;
    private DriverLicense driverLicense;
    private Passport passport;
    private CardDetails cardDetails;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", driverLicense=" + driverLicense +
                ", passport=" + passport +
                ", cardDetails=" + cardDetails +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setCardDetails(CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }
}
