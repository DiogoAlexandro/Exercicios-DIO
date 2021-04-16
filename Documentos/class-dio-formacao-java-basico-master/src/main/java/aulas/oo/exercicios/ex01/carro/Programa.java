package aulas.oo.exercicios.ex01.carro;

public class Programa {
    public static void main(String []args){
    Carro carro = new Carro("Chevrolet","Civic",2014);
        System.out.println(carro.getMarca()+ " "+ carro.getModelo() + " " +
                carro.getAno() + " " + carro.getVariante());
    }
}
