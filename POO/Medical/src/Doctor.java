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



}
