package ui;

import java.util.Scanner;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("De nuevo para servirte");
            System.out.println("Welcome" + UImenu.patientLogged);

            System.out.println("1.Reservar una cita");
            System.out.println("2.Mi cita");
            System.out.println("0.Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UImenu.showMenu();
                    break;
            }


        } while (response != 0);
    }

    private static void showBookAppointmentMenu(){
        int response=0;
        do{
            System.out.println("::Reserva una cita");
            System.out.println("::selecciona ");

        }while (response != 0);
    }
}
