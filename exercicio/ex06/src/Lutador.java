public class Lutador {
  
  // Atributos

  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

    //Metodos especiais

  public Lutador (String no,String na, int id, float al, float pe, int vi, int de, int em){
    this.nome =no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso (pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
  }

  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNacionalidade(){
    return this.nacionalidade;
  }
  public void setNacionalidade(String nacionalidade){
    this.nacionalidade = nacionalidade;
  }
  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }

  public float getAltura(){
    return altura;
  }
  public void setAltura(float altura){
    this.altura = altura;
  }

  public float getPeso(){
    return peso;
  }
  public void setPeso(float peso){
    this.peso = peso;
    this.setCategoria();
  }

  public String getCategoria(){
    return categoria;
  }
  private void setCategoria(){
    if (this.peso < 52.2){
          this.categoria = "Invalido";
    }else if (this.peso <= 70.3){
          this.categoria = "Leve";
    }else if (this.peso <= 83.9){
          this.categoria = "Médio";
    }else if (this.peso <= 120.2){
          this.categoria = "Pesado";
    } else{
          this.categoria = "Invalido";
    }
   }
  
  

  public int getVitorias(){
    return vitorias;
  }
  public void setVitorias(int vitorias){
    this.vitorias = vitorias;
  }

  public int getDerrotas(){
    return derrotas;
  }
  public void setDerrotas(int derrotas){
    this.derrotas = derrotas; 
  }

  public int getEmpates(){
    return empates;
  }
  public void setEmpates(int empates){
    this.empates = empates;
  }

  
  //metodos publicos

  public void apresentar(){
    System.out.println("-------------------------------------------");
    System.out.println("Apresentamos o lutador " + getNome());
    System.out.println("Diretamente de  " + getNacionalidade());
    System.out.println("com " + getIdade() + " anos, " + getAltura() + "m de altura e pesando: " + getPeso() + "Kg");
    System.out.println("Com " + getVitorias() + " vitorias, " + getDerrotas() + " derrotas e " + getEmpates() + " empate(s).") ;
    
  }

  public void status(){
    System.out.println(getNome()  + " é um peso " + getCategoria());
    System.out.println("Ganhou " + getVitorias() + " vezes.");
    System.out.println("Perdeu " + getDerrotas() + " vezes.");
    System.out.println("Empatou " + getEmpates() + " vezes!");
  }

  public void ganharLuta(){
    this.setVitorias(this.getVitorias() +1);
  }

  public void perderLuta(){
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta(){
    this.setEmpates(this.getEmpates()+1);
  }
}

