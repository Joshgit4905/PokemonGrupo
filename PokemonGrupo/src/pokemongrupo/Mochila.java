
package pokemongrupo;
import java.util.Scanner;
import javax.swing.JFrame;


public class Mochila{
     

    public static void main(String[] args) {
        
        ElementosMochila em = new ElementosMochila();
        
        String[][] pokebolas ={{"01","Bulbasur","Hierba","10","8","55"},
                               {"04","sq","agua","10","8","55"},
                               {"07","char","fuego","10","8","55"}};
        
        String[][] items = {{"01","baya aranja","15","cant"},
                            {"02","baya citrus","25","cant"},
                            {"03","baya poke","30","cant"}};
        
        String[][] bici = {{"Sport","28\""},
                           {"Normal","21\""}};
        
        String mochila[][][] = {pokebolas,items,bici};
        em.setPokebolas(pokebolas);
        //em.getPokemones();
        em.setItems(items);
        //em.getItem();
        em.setmochila(mochila);
        em.printMochila();
        em.printSeleccion();

    }
    
}
