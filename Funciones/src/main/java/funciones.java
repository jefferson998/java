public class funciones {

    public static void main(String[] args) {
        double y=2;
        double area =circleAreas(y);
        System.out.println(area);

        sphereVolume(y);
        sphereAreas(y);

        System.out.println("Pesos a Dolares: " + convertToDolar(4000,"COP"));



    }

    public static double circleAreas(double r){
        return Math.PI*Math.pow(r,2);

    }

    public static double sphereAreas(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: acepta MXN y COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        switch(currency){
            case "MXN":
                quantity =quantity*0.052;
                break;
            case "COP":
                quantity =quantity*0.00031;
                break;


        }
        return quantity;
    }


}
