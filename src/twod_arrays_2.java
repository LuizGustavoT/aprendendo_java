public class twod_arrays_2 {
    public static void main(String[] args) {
        
        // 2D array = an array of array

        String [][] cars = {
                                {"Camaro","BMW","Mustang"},
                                {"Corvette","FIAT 500","Ferrari"},
                                {"Lamborghini", "BYD", "Rilux"}
                            };


        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");

            }

        }
    }
}
