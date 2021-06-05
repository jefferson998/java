import java.util.Date;

import static ui.UImenu.*;

public class Main {

    public static void main(String[] args) {


//        showMenu();
        Doctor myDoctor = new Doctor("Jefferson","jef@gmail.com");
        myDoctor.AvailableAppointment(new Date(),"4pm");
        myDoctor.AvailableAppointment(new Date(),"10pm");
        myDoctor.AvailableAppointment(new Date(),"6pm");
//        System.out.println(myDoctor.getAvailableAppointments());
        System.out.println(myDoctor);

        /*
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()
             ) {
            System.out.println(aA.getDate() + "  " + aA.getTime());
            
        }*/

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Johana","joha@gmail.com");

        System.out.println(patient);



    }

}
