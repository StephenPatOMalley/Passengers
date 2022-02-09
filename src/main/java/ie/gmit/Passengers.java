package ie.gmit;

public class Passengers {
    int minNameLen = 3;
    int minIDLen = 10;
    int minPhoneLen = 7;
    int minAge = 17;

    private String passTitle = "";
    private String passName = "";
    private String passID = "";
    private String passPhone = "";
    private int passAge = 0;

    public Passengers(String passTitle, String passName, String passID, String passPhone, int passAge)
    {
        setPassTitle(passTitle);
        setPassName(passName);
        setPassID(passID);
        setPassPhone(passPhone);
        setPassAge(passAge);
    }

    public String getPassTitle() {
        return passTitle;
    }

    public void setPassTitle(String passTitle) {
        if (passTitle == "Mr" || passTitle == "Mrs" || passTitle == "Ms"){
            this.passTitle = passTitle;
        }
        else{
            throw new IllegalArgumentException("Invalid title provided");
        }
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        if (passName.length() <= minNameLen){
            this.passName = passName;
        }
        else{
            throw new IllegalArgumentException("Invalid name provided");
        }
    }

    public String getPassID() {
        return passID;
    }

    public void setPassID(String passID) {
        if (passID.length() <= minIDLen){
            this.passID = passID;
        }
        else{
            throw new IllegalArgumentException("Invalid ID provided");
        }
    }

    public String getPassPhone() {
        return passPhone;
    }

    public void setPassPhone(String passPhone) {
        if (passPhone.length() <= minPhoneLen){
            this.passPhone = passPhone;
        }
        else{
            throw new IllegalArgumentException("Invalid phone number provided");
        }
    }

    public int getPassAge() {
        return passAge;
    }

    public void setPassAge(int passAge) {
        if (passAge <= minAge){
            this.passAge = passAge;
        }
        else{
            throw new IllegalArgumentException("Invalid age provided");
        }
    }
}
