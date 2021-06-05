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



    Doctor (String name,String email){
        super(name,email);
        System.out.println("El nobre del doctor asiganado es: "+name);
        this.speciality = speciality;

    }


//    colecciones
//    para utilizar por fuera de la clase padre Doctor.AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments =new ArrayList<>();
    public void AvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }


    public static class AvailableAppointment{


        private int id;
        private Date date;
        private String time;


        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
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
