public class Person {

    private String name;
    private String officeAreaCode;
    private String officeNumber;
    private Offcie offcie;

    public Person(String name, Offcie offcie) {
        this.name = name;
        this.offcie = new Offcie(officeArea,officeNumber)
        this.officeAreaCode = officeArea;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getOfficeAreaCode() {
        return offcie.getOfficeAreaCode();
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getTelephoneNumber() {
        return offcie.getTelephoneNumber();
    }
}

class Office{
     private String officeAreaCode;
    private String officeNumber;

 public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getTelephoneNumber() {
        return officeAreaCode + "-" + officeNumber;
    }
}
