import static ui.UImenu.*;

public class Main {

    public static void main(String[] args) {


//        showMenu();
        Doctor myDoctor = new Doctor("Jefferson","forense");

        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        Patient patient = new Patient("Johana","joha@gmail.com");
        patient.setWeight(80.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("3214346577");
        System.out.println(patient.getPhoneNumber());

    }

}
