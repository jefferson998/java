import static ui.UImenu.*;

public class Main {

    public static void main(String[] args) {


//        showMenu();
        Doctor myDoctor = new Doctor("Jefferson","forense");

        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        Patient patient = new Patient("Johana","joha@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);
        patient.weight=60.5;
        patient.height=1.70;
        System.out.println(patient.weight);
        System.out.println(patient.height);


    }

}
