package Clinica;

public class User {
    private String name;
    private int age;
    private String documentNumber;
    private String phoneNumber;
    private String email;


    public User(String name,int age,String documentNumber,String phoneNumber,  String email ) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.documentNumber = documentNumber;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Имя пациента='" + name + '\'' +
                ", Возраст=" + age +
                ", Серия и номер паспорта='" + documentNumber + '\'' +
                ", Номер телефона='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
