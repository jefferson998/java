import java.util.Date;

import static ui.UImenu.*;

public class Main {

    public static void main(String[] args) {


//        showMenu();
        Doctor myDoctor = new Doctor("Jefferson","forense");
        myDoctor.AvailableAppointment(new Date(),"4pm");
        myDoctor.AvailableAppointment(new Date(),"10pm");
        myDoctor.AvailableAppointment(new Date(),"6pm");
        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()
             ) {
            System.out.println(aA.getDate() + "  " + aA.getTime());
            
        }
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);
//        Patient patient = new Patient("Johana","joha@gmail.com");
//        patient.setWeight(80.5);
//        System.out.println(patient.getWeight());
//
//        patient.setPhoneNumber("3214346577");
//        System.out.println(patient.getPhoneNumber());

    }

}
