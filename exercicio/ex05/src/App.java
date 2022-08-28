public class App {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1522);
        p1.setNome("Alice");
        p1.abrirConta("CC");
        p1.depositar(200);
        p1.getSaldo();
        p1.estadoAtual();
        System.out.println();
        Banco p2 = new Banco();
        p2.setNumConta(5643);
        p2.setNome("Cris");
        p2.abrirConta("CP");
        p2.sacar(100);
        p2.getSaldo();
        p2.estadoAtual();
        

        
}
}
