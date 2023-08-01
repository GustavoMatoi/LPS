/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetoescola.projetoescola;

/**
 *
 * @author gutei
 */
public class Aluno {
    private String nome;
    private String sexo;
    private int idade;
    private String matricula;
    private String ano;
    
    public Aluno(){
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
        this.matricula = "";
        this.ano = "";
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
         this.matricula = matricula;
    }
    
    public String getAno(){
        return this.ano;
    }
    
    public void setAno(String ano){
        this.ano = ano;
    }
    
}
