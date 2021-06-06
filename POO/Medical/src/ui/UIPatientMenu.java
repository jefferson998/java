package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("De nuevo para servirte");
            System.out.println("Welcome" + UImenu.patientLogged.getName());

            System.out.println("1.Reservar una cita");
            System.out.println("2.Mi cita");
            System.out.println("0.Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                     showPatientMyAppointments();
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
            //Numeracion de la lista de fecha
            //Indice de fecha
            //[doctors]
            //1.-> doctor1
                            //->  fecha1
                            //-> fecha2
            //2.-> doctor2
            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k=0;
            for (int i = 0; i < uiDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = uiDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorsAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k+"."+availableAppointments.get(j).getDate());
                    doctorsAppointments.put(Integer.valueOf(j),uiDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorsAppointments);



                }

            }

            Scanner scanner = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(scanner.nextLine());

            Map<Integer,Doctor> doctorAvailableSelected=doctors.get(responseDateSelected);
            Integer indexDate =0;
            Doctor doctorSelected = new Doctor("","");

            for (Map.Entry<Integer,Doctor> doc:
            doctorAvailableSelected.entrySet()) {
                indexDate=doc.getKey();
                doctorSelected=doc.getValue();
            }
            System.out.println(doctorSelected.getName()+". Fecha: "+
                    doctorSelected.getAvailableAppointments().get(indexDate).getDate()+". Hora: "+
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirma tu cita: \n1.Si 2.\nCambiar Datos");

            response=Integer.parseInt(scanner.nextLine());
            if(response==1){
                UImenu.patientLogged.addAppointmentsDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();

            }

        }while (response != 0);
    }

    private static void showPatientMyAppointments() {
        int response = 0;
        do{
            System.out.println("::Mis citas");
            if(UImenu.patientLogged.getAppointmentsDoctors().size()==0){
                System.out.println("No tienes citas");
                break;
            }
            for (int i = 0; i < UImenu.patientLogged.getAppointmentsDoctors().size(); i++) {
                int j=i+1;
                System.out.println(j +"."+"Date: "+
                        UImenu.patientLogged.getAppointmentsDoctors().get(i).getDate()+
                        "Hora: "+UImenu.patientLogged.getAppointmentsDoctors().get(i).getTime()
                +"\nDoctor: "+UImenu.patientLogged.getAppointmentsDoctors().get(i).getDoctor().getName());

            }

            System.out.println("0.Return");

        }while (response != 0);
    }
}
