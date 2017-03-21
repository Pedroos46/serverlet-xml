package edu.fje.daw2;

import java.io.Serializable;

/**
 * Created by clot on 09/03/2017.
 */
public class Resultat implements Serializable{
    private String nomOperacio;
    private int resultatOperacio;

    public Resultat() {
    }

    public Resultat(String nomOperacio, int resultatOperacio) {
        this.nomOperacio = nomOperacio;
        this.resultatOperacio = resultatOperacio;
    }

    public String getNomOperacio() {
        return nomOperacio;
    }

    public void setNomOperacio(String nomOperacio) {
        this.nomOperacio = nomOperacio;
    }

    public int getResultatOperacio() {
        return resultatOperacio;
    }

    public void setResultatOperacio(int resultatOperacio) {
        this.resultatOperacio = resultatOperacio;
    }
}
