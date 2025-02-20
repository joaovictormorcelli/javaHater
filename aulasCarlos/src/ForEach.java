public class ForEach {
    public static void main(String[] args) {
        String[] natchackra = {"Katon", "Doton", "Suiton", "Futon", "Raiton"};
        for (String natureza : natchackra){
            System.out.println(natchackra);
        }

        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int recebeNumeros : numeros){
            soma += recebeNumeros;
            System.out.println(soma);
        }
    }
}
