public class Classe {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.nome = "Joao";
        joao.idade = 17;

        //System.out.println(joao.apresentar());
        //System.out.println(joao.idademetodo());
        //System.out.println(joao.imc(81,1.72));

        System.out.println(joao.somarNumeros(1, 2, 3));
    }
}
