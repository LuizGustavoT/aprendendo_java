public class Swap{
    public static void main(String[] args) {
        
        String x = "Whater";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y = temp;

       

        System.out.println("x: "+x);

        System.out.println("y: "+y);

        //Este processo é para troca de informações de uma variavel. Usamos o Temp para uma memoria temporaria para que não se perca os dados de x.

    }
}