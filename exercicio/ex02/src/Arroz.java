public class Arroz {
  String tipo;
  String cor;
  String tempo;
  boolean ligado;

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