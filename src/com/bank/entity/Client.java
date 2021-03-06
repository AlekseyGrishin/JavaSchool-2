package com.bank.entity;

import java.util.Objects;

public class Client {
    private long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    private int balance;

    public Client(String firstName){
        this.firstName = firstName;
    }

    public Client(long id, String firstName, String lastName, Integer age, String sex, String address, String phone, int balance){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "{\"_class\":\"Client\", " +
                "\"id\":\"" + id + "\"" + ", " +
                "\"firstName\":" + (firstName == null ? "null" : "\"" + firstName + "\"") + ", " +
                "\"lastName\":" + (lastName == null ? "null" : "\"" + lastName + "\"") + ", " +
                "\"age\":" + (age == null ? "null" : "\"" + age + "\"") + ", " +
                "\"sex\":" + (sex == null ? "null" : "\"" + sex + "\"") + ", " +
                "\"address\":" + (address == null ? "null" : "\"" + address + "\"") + ", " +
                "\"phone\":" + (phone == null ? "null" : "\"" + phone + "\"") +
                "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                firstName.equals(client.firstName) &&
                lastName.equals(client.lastName) &&
                age.equals(client.age) &&
                sex.equals(client.sex) &&
                address.equals(client.address) &&
                phone.equals(client.phone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, sex, address, phone);
    }
}
