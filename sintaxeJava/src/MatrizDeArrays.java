public class MatrizDeArrays {
    public static void main(String[] args) {
        String[][] ncp = new String[3][3];

        ncp [0][0] = "Tabela";
        ncp [0][1] = "Katon";
        ncp [0][2] = "Futon";
        ncp [1][0] = "Sasuke";
        ncp [1][1] = "Goukakyu";
        ncp [1][2] = "Nenhum";
        ncp [2][0] = "Naruto";
        ncp [2][1] = "Nenhum";
        ncp [2][2] = "Rasenshuriken";



        String[][] ncp2 = {{"Tabela", "Suiton", "Raiton"}, {"Tobirama", "Suiryuudan", "Nenhum"}, {"Kakashi", "Suiryuudan", "Raikiri"}};

        System.out.println(ncp[1][0]);
        System.out.println(ncp[2][0]);
        System.out.println(ncp[0][1]);

        System.out.println(ncp2[2][1]);
        System.out.println(ncp2[1][1]);
        System.out.println(ncp2[0][0]);

    }
}
