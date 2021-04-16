package aulas.oo.exercicios.ex01.carro;

import jdk.vm.ci.meta.Constant;

public class Carro {
    public Carro(String marca,
            String modelo,
            Integer ano){
      this.marca=marca;
      this.modelo=modelo;
      this.ano=ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getVariante() {
        return variante;
    }

    private String marca;
    private String modelo;
    private int ano;
    private String variante= "Prata";
}

