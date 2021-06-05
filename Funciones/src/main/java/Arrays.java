public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions =new String[17];
        String days[]=new String[7];
        String[][] cities = new String[4][2];


        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0]="Apple Pie";
        androidVersions[1]="Banana Bread";
        androidVersions[2]="Cupcake";
        androidVersions[3]="Donut";
        System.out.print(java.util.Arrays.toString(androidVersions));

        System.out.println();
        System.out.println();

        for (int i = 0; i < androidVersions.length ; i++) {
            System.out.println(androidVersions[i]);


        }
        System.out.println();
        System.out.println();

        for (String AndroidVersion : androidVersions
             ) {
            System.out.println("for each : "+ AndroidVersion);
            
        }
        cities[0][0]="Pasto";
        cities[0][1]="Colombia";
        cities[1][0]="Puebla";
        cities[1][1]="Mexico";
        cities[2][0]="Acapulco";
        cities[2][1]="Mexico";
        cities[3][0]="Juarez";
        cities[3][1]="Tijuana";

        System.out.print(java.util.Arrays.deepToString(cities));
        System.out.println();
        System.out.println();
        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);

            }

        }
        System.out.println();
        System.out.println();
        for (String[] pair:cities
             ) {
            for (String name : pair) {
                System.out.println("for each: " +name);
            }
        }
        System.out.println();
        System.out.println();
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1]="Monkey";
        System.out.println();
        System.out.println();

        System.out.println("animals = " + java.util.Arrays.deepToString(animals));


        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        System.out.println(animals[i][j][k][l]);

                    }

                }

            }

        }

        int i =1,j=2,k=3,m=2;

        System.out.println((j>=i)||(k==m));


    }
}
