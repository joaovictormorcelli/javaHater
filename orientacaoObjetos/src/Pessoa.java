public class Pessoa {
    String nome;
    int idade;
    char sexo;

//    void dormir(){
//        System.out.println("zzZZZzZZZzz");
//    }
//
//    String apresentar(){
//        return "Prazer meu nome é "+ nome;
//    }
//
//    String idademetodo(){
//        if (idade>18){
//            System.out.println("Tu é pika");
//        } else {
//            System.out.println("aaaa chidori");
//        }
//
//        return "você tem"+idade;
//    }
//
//    double imc2 = 0;
//    double imc (double peso, double altura) {
//        if (peso>80 && altura<1.70){
//            imc2 = 2;
//            System.out.println("gordo");
//        } else if (peso>80 && altura > 1.80) {
//            imc2 = 3;
//            System.out.println("show pai");
//        } else {
//            imc2 = 4;
//            System.out.println("aaaa chidori");
//        }
//        return imc2;
//    }

    int somarNumeros (int ... numeros){
        int soma = 0;
        for(int n : numeros){
            soma += n;
        }
        return soma;
    }


}
