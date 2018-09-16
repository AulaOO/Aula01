/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author Luis Guilherme
 */
public class Principal {

    public static void main(String[] args) {
        /*Carro carro1 = new Carro();
        carro1.setNome("Brasilia");
        carro1.setIdade(1998);
        carro1.setMarca("Wolks");
        carro1.setModelo("Novo");
        System.out.println("Nome: " +  carro1.getNome() + "\nMarca: " + carro1.getMarca() + "\nModelo: " + 
        carro1.getModelo());
        
        Carro carro2 = new Carro("Fusca","Wolks","Velho",2000);System.out.println("Nome: " + carro2.getNome());
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Idade: " + carro2.getIdade());
        String nome = "Kombi";
        String marca = "Chevrolette";
        String modelo = "Grande.";
        int idade = 10;
        Carro carro3 = new Carro(nome,marca,modelo,idade);
        System.out.println("Nome: " + carro3.getNome());
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Idade: " + carro3.getIdade()); */
    
        /*Carro carro4 = new Carro("Fusca","Wolks","Novo",10,"Azul");
        if ((carro4.getNome().toUpperCase().equals("FUSCA")) && (carro4.getCor().toUpperCase().equals("AZUL"))){
            System.out.println("O cachhorro corre atrás do carro");
        }
        else{
            System.out.println("O cachorro não corre atrás do carro");
        }*/
        
        Carro carro5 = new Carro();
        String nome = "azul";
        carro5.setNome(nome.toUpperCase());
        System.out.println(carro5.getNome());
        
    }
}
