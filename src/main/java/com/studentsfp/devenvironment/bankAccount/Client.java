package com.studentsfp.devenvironment.bankAccount;

public class Client {
    private Long id;
    private String name;
    private String nif;
    private String address;
    private String email;
    private String phone;


    //constructor de client
    public Client(){}

    //constructor de client (sobrecargar el constructor --> polimorfismo)
    public Client(Long id,String name, String nif, String address,String email,String phone){
        setId(id);
        setName(name);
        setNif(nif);
        setAddress(address);
        setEmail(email);
        this.phone=phone; //same as setPhone(phone)
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
