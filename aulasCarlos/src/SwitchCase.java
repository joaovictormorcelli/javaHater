public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 1: nomeDoDia="Domingo";
            break;
            case 2: nomeDoDia="Segunda";
            break;
            case 3: nomeDoDia="Terça";
            break;
            case 4: nomeDoDia="Quarta";
            break;
            case 5: nomeDoDia="Quinta";
            break;
            case 6: nomeDoDia="Sexta";
            break;
            case 7: nomeDoDia="Sábado";
            break;
            default: nomeDoDia="Insira um número entre 1 e 7";
        }

        System.out.println(nomeDoDia);
    }
}
