public class twod_arrays {
    public static void main(String[] args) {
        
        // 2D array = an array of array

        String [][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "BMW";
        cars[0][2] = "Mustang";
        cars[1][0] = "Corvette";
        cars[1][1] = "FIAT 500";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Lamborghini";
        cars[2][1] = "BYD";
        cars[2][2] = "Rilux";

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");

            }

        }
    }
}
