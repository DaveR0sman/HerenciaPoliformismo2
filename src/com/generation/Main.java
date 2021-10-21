package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.animales.Animal;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Ave ave = new Ave("princesamolecular");
        System.out.println(ave.getNombre());
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();

        System.out.println("------------------------------");

        Perro lomito = new Perro("mundo");
        lomito.jugar();
        lomito.comer();

       Animal animal = new Animal() {
           @Override
           public void respirar() {

           }
       };
        animal.comer();
    }
}
