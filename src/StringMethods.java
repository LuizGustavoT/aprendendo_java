public class StringMethods {
    public static void main(String[] args) {
        
        // String = a reference data type that can store one or more characteres reference data types have acces to useful methods 

        String name = "Luiz";

        //boolean result = name.equalsIgnoreCase("Luiz");
        //int result = name.length();
        //char result = name.charAt(0)  // Localizar characters in name by number
        //int result = name.indexOfI("L");
        //boolean result = name.isEmpty(); // Name esta vazio? Se conter espaços em branco retorna que não esta vazia
        //boolean result = name.isBlank(); // Mesmo se estiver com espaços em branco retorna true que esta vazia.
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String Result = name.trim(); // Retira espaços em Branco
        String result = name.replace("L", "J"); //Trocar uma letra pora outra

        System.out.println(result);
    }
}
