public class OperadoresLogicos {
    public static void main(String[] args) {

        // && || !  --> operadores Lógicos (AND, OR, NOT)

        int idade = 22;
        boolean temCarteira = true;

        if (idade>=18 && temCarteira == true){
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir");
        }

        int idade2 = 11;
        boolean temCarteira2 = true;

        if (idade2>=18 || temCarteira2 == true){
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir");
        }



        if (!true){
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir");
        }


    }
}
