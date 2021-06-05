import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id=0;
    String name;
    String email;
    String speciality;






    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor (String name,String speciality){
        System.out.println("El nobre del doctor asiganado es: "+name);
        id++;
        this.name = name;
        this.speciality = speciality;

    }
    public void showId(){
        System.out.println("ID Dorctor: "+id);
    }


    //comportamientos

    public void showName(){
        System.out.println(name);
    }

//    colecciones
//    para utilizar por fuera de la clase padre Doctor.AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments =new ArrayList<>();
    public void AvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
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

    }



}
