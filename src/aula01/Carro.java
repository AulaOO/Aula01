package aula01;

public class Carro {
    String nome;
    String marca;
    String modelo;
    int idade;
    String cor;
    
    public Carro(){   
    }
    
    public Carro(String nome1, String marca1, String modelo1, int idade1, String cor1){
        nome = nome1;
        marca = marca1;
        modelo = modelo1;
        idade = idade1;
        cor = cor1;
    }
    
    public void setNome(String nome1){
        nome = nome1;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setMarca(String marca1){
        marca = marca1;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo1){
        modelo = modelo1;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setIdade(int idade1){
        idade = idade1;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setCor(String cor1){
        cor = cor1;
    }
    
    public String getCor(){
        return cor;
    }
}
