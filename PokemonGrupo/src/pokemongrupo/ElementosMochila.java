
package pokemongrupo;

import java.util.Scanner;

public class ElementosMochila {
    private String[][][] mochila;
    private String[][]  pokebolas;
    private String[][] items;

    public String[][] getPokebolas() {
        return pokebolas;
    }

    public void setPokebolas(String[][] pokebolas) {
        this.pokebolas = pokebolas;
    }

    public String[][] getItems() {
        return items;
    }

    public void setItems(String[][] items) {
        this.items = items;
    }
    
    public String[][][] getmochila() {
        return mochila;
    }
    
    public void setmochila(String[][][] mochila) {
        this.mochila = mochila;
    }
    public void printMochila (){
        System.out.println("-------------------------------------");
        for (int i = 0; i < mochila.length; i++) {
            System.out.println("");
            System.out.println("Sección "+(i+1));
            String[][] stringses = mochila[i];
            for (int j = 0; j < stringses.length; j++) {
                String[] stringse = stringses[j];
                System.out.println("Elemento "+(j+1));
                for (int k = 0; k < stringse.length; k++) {
                    System.out.print(" --- "+ stringse[k]); 
                }
                System.out.println("");
            }
            
        }
    }
    public String[] menu(){
        Scanner s = new Scanner(System.in);
        String[] seleccion;
        int espacio = 0, elemento=0;
        System.out.println("Selecciona espacio de la mochila \n 1 pokemon \n 2 items");
        espacio = s.nextInt();
        if(espacio == 1){
            System.out.println("Selecciona el pokemon fav");
            elemento =  s.nextInt();
            seleccion=  mochila[espacio-1][elemento-1];
            return seleccion;
        }else {if (espacio == 2){
            System.out.println("Selecciona el item fav");
            elemento =  s.nextInt();
            seleccion=  mochila[espacio-1][elemento-1];
            return seleccion;
        }else{
                System.out.println("No seleccionaste un espacio correcto");
               seleccion= new String[1];
                seleccion[0] ="null data"; 
                return seleccion;
                }
            }
        }
    public void printSeleccion(){
        String[] print = menu();
        for (int i = 0; i < print.length; i++) {
            System.out.print(" ---- "+print[i]);  
        }
    }
    public void getPokemones(){
        System.out.println("-------------------------------------");
        for (int i = 0; i < pokebolas.length; i++) {
        System.out.println("");
            String[] pokebola = pokebolas[i];
            for (int j = 0; j < pokebola.length; j++) {
                String dato = pokebola[j];
                System.out.print(dato+" | ");
            }
            System.out.println("");
            System.out.println("-------------------------------------");
        }
    }
    public void getItem(){
        System.out.println("-------------------------------------");
        for (int i = 0; i < items.length; i++) {
        System.out.println("");
            String[] item = items[i];
            for (int j = 0; j < item.length; j++) {
                String dato = item[j];
                System.out.print(dato+" | ");
            }
            System.out.println("");
            System.out.println("-------------------------------------");
        }
    }   
}