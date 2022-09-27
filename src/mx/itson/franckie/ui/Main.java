/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.franckie.ui;


import java.util.ArrayList;
import mx.itson.franckie.entidades.Receta;
import mx.itson.franckie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
   public static void main(String[]args){
       
       Receta receta = new Receta();
       receta.setNombre("Framkie brownie");
       receta.setDesctipcion("hornea esta receta de broenis para hallowen");
       receta.setPorciones(6);
       receta.setDuracion(62);
       
       List(ingredietes) ingredientes = new ArrayList<> ();
       
       Ingrediente ingrediente1 = new Ingrediente();
       ingresiente1.setNombre("1 caja de harina");
       
       Ingrediente ingrediente2 = new Ingrediente();
       ingrediente2.setNombre("3 cucharadas de agua");
       
         Ingrediente ingrediente3 = new Ingrediente();
       ingrediente3.setNombre("3 cucharadas de agua");
       
         Ingrediente ingrediente4 = new Ingrediente();
       ingrediente4.setNombre("3 cucharadas de agua");
       
         Ingrediente ingrediente5 = new Ingrediente();
       ingrediente5.setNombre("3 cucharadas de agua");
       
           
       Ingredientes.add(ingresiente1);
         Ingredientes.add(ingresiente2);
         receta.setIngredietes(ingredietes);
         
         receta.setDificultad(Dificultad.LEGEMDARIO);
       
       
   }
}
