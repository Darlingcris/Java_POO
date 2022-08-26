public class App {
    public static void main(String[] args) throws Exception {
        Arroz a1 = new Arroz();
        //a1.tipo = "Parbolizado";
        a1.cor = "Amarelo";
        a1.tempo = "30 minutos";
        a1.fogo_ligado();
        a1.status();
        a1.cozimento();
        System.out.println();
        Arroz a2 =new Arroz();
        //a2.tipo = "Normal";
        a2.cor = "Preto";
        a2.tempo = "20 minutos";
        a2.fogo_desligado();
        a2.status();
        a2.cozimento();
        

    }
}
