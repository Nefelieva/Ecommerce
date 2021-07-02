package gr.advantage.model;

import java.util.Scanner;

public class Customer {
    //fields
    private int idC;
    private String cu_name, cu_surname, cu_address, cu_email;
    private double cu_telephone;

    //constructors
    public Customer(){
    }

    public Customer(int idC, String cu_name, String cu_surname, String cu_address, String cu_email, double cu_telephone) {
        this.idC = idC;
        this.cu_name = cu_name;
        this.cu_surname = cu_surname;
        this.cu_address = cu_address;
        this.cu_email = cu_email;
        this.cu_telephone = cu_telephone;
    }

    //methods


    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getCu_name() {
        return cu_name;
    }

    public void setCu_name(String cu_name) {
        this.cu_name = cu_name;
    }

    public String getCu_surname() {
        return cu_surname;
    }

    public void setCu_surname(String cu_surname) {
        this.cu_surname = cu_surname;
    }

    public String getCu_address() {
        return cu_address;
    }

    public void setCu_address(String cu_address) {
        this.cu_address = cu_address;
    }

    public String getCu_email() {
        return cu_email;
    }

    public void setCu_email(String cu_email) {
        this.cu_email = cu_email;
    }

    public double getCu_telephone() {
        return cu_telephone;
    }

    public void setCu_telephone(double cu_telephone) {
        this.cu_telephone = cu_telephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idC=" + idC +
                ", cu_name='" + cu_name + '\'' +
                ", cu_surname='" + cu_surname + '\'' +
                ", cu_address='" + cu_address + '\'' +
                ", cu_email='" + cu_email + '\'' +
                ", cu_telephone=" + cu_telephone +
                '}';
    }
    public void updateEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your new email: ");
        String Email;
        Email = scanner.nextLine();
        this.cu_email = Email;
        System.out.println("Your email " + Email);

    }
    public void updateAddress()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your new address: ");
        String Address;
        Address = scanner.nextLine();
        this.cu_address = Address;
        System.out.println("Your email " + Address);
    }
    public void updateTelephone()
    {
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Please provide your new telephone: ");
        double Telephone;
        Telephone = scannerInt.nextInt();
        this.cu_telephone = Telephone;
        System.out.println("Your email " + Telephone);
    }

}
