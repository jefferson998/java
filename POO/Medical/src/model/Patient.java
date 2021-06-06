package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    //   Atributo
    private String birthday;
    private String blood;
    private double weight;
    private double height;

    private ArrayList<AppointmentDoctor> appointmentsDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmensNuses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentsDoctors() {
        return appointmentsDoctors;
    }

    public void addAppointmentsDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedule(date,time);
        appointmentsDoctors.add(appointmentDoctor);

    }

    public ArrayList<AppointmentNurse> getAppointmensNuses() {
        return appointmensNuses;
    }

    public void setAppointmensNuses(ArrayList<AppointmentNurse> appointmensNuses) {
        this.appointmensNuses = appointmensNuses;
    }

    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight+" Kg.";
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public void setPhoneNumber(String phoneNumber) {

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " +birthday+"\nWeight: " + getWeight() +
                "\nHeight: "+getHeight()+"\nBlood: " +blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Epicrisis");

    }
}
