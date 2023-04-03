package Entities.Exo1;

public class Captage implements Comparable
{
    private int idCaptage;
    private String nom;
    private int hauteur;
    private int debit;

    public Captage(int idCaptage, String nom, int hauteur, int debit) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debit = debit;
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Object compareTo) {

        Captage compareToCap = (Captage)compareTo;

        if (debit == compareToCap.debit) return 0;

        if (debit > compareToCap.debit) return 1;

        return -1;

    }
    public String getDescription()
    {
        String des=nom+"-"+hauteur+"mètre-"+debit+"litre";
        return des;
    }

}
