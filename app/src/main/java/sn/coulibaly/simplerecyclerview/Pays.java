package sn.coulibaly.simplerecyclerview;

public class Pays {
    String nomPays;
    int drapeauPays;

    public Pays(String nomPays, int drapeauPays) {
        this.nomPays = nomPays;
        this.drapeauPays = drapeauPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getDrapeauPays() {
        return drapeauPays;
    }

    public void setDrapeauPays(int drapeauPays) {
        this.drapeauPays = drapeauPays;
    }
}
