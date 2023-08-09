package FileWithDocuments;

import java.util.Map;

public class Document {
    private String docNumber;
    private String email;
    private String phoneNumber;

    //Constructor
    public Document() {
        this.docNumber = null;
        this.email = null;
        this.phoneNumber = null;
    }

    public Document(String docNumber, String email, String phoneNumber) {
        this.docNumber = docNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    //Getters and Setters
    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Document number: " + getDocNumber() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone number: " + getPhoneNumber() + ";\n";
    }
}
