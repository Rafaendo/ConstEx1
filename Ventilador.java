public class Ventilador{
  private long velocidade;
  private String cor;
  private boolean ligado;

  public Ventilador(String cor){
    this.velocidade = 0;
    this.cor = cor;
    this.ligado = false;
  }

  public Ventilador(long velocidade, String cor, boolean ligado){
    if(velocidade>=0){
      this.velocidade = velocidade;
    }else{
      this.velocidade = 1;
    }

    this.cor = cor;
    this.ligado = ligado;
  }


  public long getVelocidade(){
    return this.velocidade;
  }
  public void setVelodidade(int v){
    this.velocidade = v;
  }

  public String getCot(){
    return this.cor;
  }
  public void setCor(String cor){
    this.cor = cor;
  }

  public boolean ligado(){
    return this.ligado;
  }
  public void setLigado(boolean ligado){
    this.ligado = ligado;
  }

  public void ligar(){
    this.velocidade = 1;
    this.ligado = true;
  }

  public void desligar(){
    this.velocidade = 0;
    this.ligado = false;
  }

  public void verVelocidade(){
    if(this.ligado){
      System.out.println("Ligado com Velocidade de: "+this.velocidade);
    }else{
      System.out.println("Desligado");
    }
  }
}