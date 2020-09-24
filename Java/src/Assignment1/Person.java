package Assignment1;

public class Person {
    private String name;
    private int age;
    private long mobileNumber;
    private String emailId;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailid() {
        return emailId;
    }

    public boolean isSeniorCitizen(){
        if (this.age > 60){
            return true;
        }
        else{
            return false;
        }
    }
}
