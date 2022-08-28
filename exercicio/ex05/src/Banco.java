public class Banco {

  
  public int numConta;
  public int getNumConta() {
    return numConta;
  }
  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  protected String tipo;
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  private String nome;
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  private float saldo;
  public float getSaldo() {
    return saldo;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  private boolean status;
  public boolean getStatus() {
    return status;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }

  public Banco() {
    this.setSaldo(0);
    this.setStatus(false);
  }

    public void abrirConta(String t) {
    setTipo(t);
    setStatus(true);

    if (t == "CC"){
        this.setSaldo (50);
    }else {
        this.setSaldo (150);
    }
    System.out.println("Conta aberta com sucesso!");
  }

  public void fecharConta(){
    if(this.getSaldo() > 0){
        System.out.println("Saldo positivo. Retire o dinheiro para encerrar a conta.");    
    }else{
      if(this.getSaldo() < 0){
        System.out.println("Débito em conta.Procure o seu gerente!");
      }else{
        setStatus(false);
        System.out.println("Conta encerrada com sucesso!");
      }  
    }
  }

  public void depositar(float v){
      if (this.getStatus()){
        this.setSaldo(getSaldo() + v);
        System.out.println("Deposito realizado na conta de " + this.getNome());
      }else{
        System.out.println("Impossivel efetuar o deposito.");
      }  
  }

  public void sacar(float v){
    if (this.getStatus()){
      if(this.getSaldo() >= v){
        this.setSaldo(this.getSaldo()-v);
        System.out.println("Saque realizado. Retire o dinheiro.");
      }else{
      System.out.println("Saldo insuficiente!");
    }
    }else{
       System.out.println("Impossível  sacar.");
  }
  }

  public void pagarMensal(){
    int v = 0;
    if(this.getTipo()=="CC"){
      v=12;
    }else{
      v=20;
    }
    if(getStatus()) {
      this.setSaldo(this.getSaldo()-v);
      System.out.println("Mensalidade paga com sucesso!");
    }else{
      System.out.println("Conta fechada. Impossivel pagar.");
    }
  }

  public void estadoAtual(){
    System.out.println("--------------------------");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Nome: " + this.getNome());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
  }
}