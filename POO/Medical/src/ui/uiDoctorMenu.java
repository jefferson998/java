package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class uiDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments=new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Bienvenido Doctor " + UImenu.doctorLogged.getName());
            System.out.println("Nos compace que estes aqui");

            System.out.println("1. Available Appointments");
            System.out.println("2. My schedule");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmensMenu();
                    break;
                case 2:

                    break;
                case 0:
                    UImenu.showMenu();
                    break;

            }

        } while (response != 0);

    }

    private static void showAddAvailableAppointmensMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println(":: Add available appointments");
            System.out.println("::select a month");

            for (int i = 0; i < 3; i++) {
                int j =i+1;
                System.out.println(j+"."+ UImenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());
            if (response>0 && response<4){

                int monthSelected = response;
                System.out.println(monthSelected+"."+UImenu.MONTHS[monthSelected-1]);
                System.out.println("Ingresa la fecha disponible: [dd/mm/yyyy}");
                String date =scanner.nextLine();
                System.out.println("Tu fecha es: "+date+"\n1.Correct \n2. Cambiar fecha");
                int responseDate = Integer.valueOf(scanner.nextLine());
                if(responseDate==2) continue;

                int responseTime = 0;
                String time="";
                do{
                    System.out.println("Ingrese la hora para la fecha: "+date+" [16:00]");
                    time=scanner.nextLine();
                    System.out.println("La hora es: "+time+"\n1.Correcta \n2Cambiar Hora");
                    responseTime=Integer.parseInt(scanner.nextLine());
                }while(responseTime==2);
                UImenu.doctorLogged.AvailableAppointment(date,time);

                checkDoctorAvailbleAppointments(UImenu.doctorLogged);


            } else if (response==0){
                showDoctorMenu();

            };


        }while(response !=0);

    }


    private static void checkDoctorAvailbleAppointments(Doctor doctor){
        if(doctor.getAvailableAppointments().size()>0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);

        }
    }

}
