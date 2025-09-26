public class arrays {
    public static void main(String[] args) {
        
        // array = used to store multiple values in a single variable
        // para chamar uma array começa sempre pelo numero 0. No exemplo abaixo para chamar o Camaro tem que colocar [0]. Mas logo abaixo eu chamei a variavel cars[0] de "C3 GLX 1.4", logo se eu chamar cars[0] irá vir o que eu determinei "C3 GLX 1.4".
        
        String[] cars = {"Camaro", "HB20", "FIAT Uno", "BMW"};

        cars[0] = "C3 GLX 1.4";

        System.out.println(cars[0]);

    }
}
