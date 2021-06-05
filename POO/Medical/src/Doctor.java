public class Doctor {
    static int id=0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor (String name){
        System.out.println("El nobre del doctor asiganado es: "+name);

    }
    public void showId(){
        System.out.println("ID Dorctor: "+id);
    }


    //comportamientos

    public void showName(){
        System.out.println(name);
    }



}
