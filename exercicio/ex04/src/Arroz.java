public class Arroz {
  private String tipo;

  public String getTipo() {
   return tipo;
}

  public void setTipo(String tipo) {
   this.tipo = tipo;
}

  public String cor;
  public String getCor() {
   return cor;
}

  public void setCor(String cor) {
   this.cor = cor;
}

protected String tempo;
  public String getTempo() {
   return tempo;
}

public void setTempo(String tempo) {
   this.tempo = tempo;
}

public boolean ligado;

public boolean isLigado() {
   return ligado;
}

  public void setLigado(boolean ligado) {
   this.ligado = ligado;
}

void status(){
    System.out.println("Tipo do arroz: " + this.tipo);
    System.out.println("Cor do arroz: " + this.cor);
    System.out.println("Tempo de cozimento: " + this.tempo);
    System.out.println("Posso cozinhar? " + this.ligado);
  }

  void fogo_ligado(){
      this.ligado = true;
  }

  void fogo_desligado(){
      this.ligado = false;
  }

  void cozimento(){
     if(this.ligado == true){
        System.out.println("Sim. O fogo está ligado.");
     }else{
        System.out.println("Você precisa ligar o fogo.");
     }
  }


}