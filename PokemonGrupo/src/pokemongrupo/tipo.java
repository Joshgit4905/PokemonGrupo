/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongrupo;

/**
 *
 * @author MSI1
 */
public class tipo {
    
}
public static final String PLANTA = "Planta";
    public static final String FUEGO = "Fuego";
    public static final String ELECTRICO = "Electrico";
    public static final String AGUA = "Agua";

    private String tipo;

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularMultiplicador(Tipo oponente) {
        switch (this.tipo) {
            case AGUA:
                if (oponente.getTipo().equals(FUEGO)) {
                    return 2.0; // Agua es fuerte contra fuego
                } else if (oponente.getTipo().equals(PLANTA)) {
                    return 0.5; // Agua es débil contra planta
                } else if (oponente.getTipo().equals(ELECTRICO)) {
                    return 0.5; // Agua es débil contra eléctrico
                }
                break;
            case FUEGO:
                if (oponente.getTipo().equals(AGUA)) {
                    return 0.5; // Fuego es débil contra agua
                } else if (oponente.getTipo().equals(PLANTA)) {
                    return 2.0; // Fuego es fuerte contra planta
                }
                break;
            case PLANTA:
                if (oponente.getTipo().equals(AGUA)) {
                    return 2.0; // Planta es fuerte contra agua
                } else if (oponente.getTipo().equals(FUEGO)) {
                    return 0.5; // Planta es débil contra fuego
                }
                break;
            case ELECTRICO:
                if (oponente.getTipo().equals(AGUA)) {
                    return 2.0; // Eléctrico es fuerte contra agua
                }
                break;
            default:
                return 1.0; // Pokemon normal sin potenciador
        }
        return 1.0; // Pokemon normal sin potenciador
    }
}