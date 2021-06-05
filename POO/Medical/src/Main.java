import static ui.UImenu.*;

public class Main {

    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Jefferson Paz");
        myDoctor.name = "Jefferson";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

//
        Doctor MyDoctorJeff = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        showMenu();

    }

}
