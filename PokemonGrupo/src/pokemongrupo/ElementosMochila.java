
package pokemongrupo;
public class ElementosMochila {
    //private String[][][] mochila;
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
