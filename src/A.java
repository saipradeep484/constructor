 public class A {
    String customerName;
    int customerID;
    int accountNumber;
    String mobileNumber;
    String address;
    String pan;
    //creation of constructor
    public A(String customerName, int customerID, int accountNumber, String mobileNumber, String address, String pan) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.pan = pan;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
    


}