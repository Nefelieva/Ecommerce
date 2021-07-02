package gr.advantage.model;

import java.util.Scanner;

public class Employee {
    //fields
    private int id;
    private String em_name, em_surname, address, email, department;
    private double telephone;
    private boolean manager;

    //constructors

    public Employee(){
    }
    public Employee(int id, String em_name, String em_surname, String address, String email, String department, double telephone, boolean manager) {
        this.id = id;
        this.em_name = em_name;
        this.em_surname = em_surname;
        this.address = address;
        this.email = email;
        this.department = department;
        this.telephone = telephone;
        this.manager = manager;
    }

    //methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return em_name;
    }

    public void setName(String em_name) {
        this.em_name = em_name;
    }

    public String getSurname() {
        return em_surname;
    }

    public void setSurname(String em_surname) {
        this.em_surname = em_surname;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTelephone() {
        return telephone;
    }

    public void setTelephone(double telephone) {
        this.telephone = telephone;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + em_name + '\'' +
                ", surname='" + em_surname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", telephone=" + telephone +
                ", manager=" + manager +
                '}';
    }

    public void updateEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your new email: ");
        String Email;
        Email = scanner.nextLine();
        this.email = Email;
        System.out.println("Your email " + Email);

    }
    public void updateAddress()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your new address: ");
        String Address;
        Address = scanner.nextLine();
        this.email = Address;
        System.out.println("Your email " + Address);
    }
    public void updateTelephone()
    {
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Please provide your new telephone: ");
        double Telephone;
        Telephone = scannerInt.nextInt();
        this.telephone = Telephone;
        System.out.println("Your email " + Telephone);
    }
}
