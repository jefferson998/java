package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Atributo
    private String speciality;



    public Doctor(String name, String email){
        super(name,email);


    }


    //    colecciones
//    para utilizar por fuera de la clase padre Doctor.AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments =new ArrayList<>();
    public void AvailableAppointment(String date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital Departamental");
        System.out.println("Departamento: Psiquiatria");


    }


    public static class AvailableAppointment{


        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");


        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available appointments \nDate: " +date +"\nTime: "+time;
        }

    }



}
