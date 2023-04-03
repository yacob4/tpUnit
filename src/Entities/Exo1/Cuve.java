package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int largeur;
    private int longueur;


    public Cuve(int idCaptage, String nom, int hauteur, int debit,int largeur,int longueur) {
        super(idCaptage, nom, hauteur, debit);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public String getDescription()
    {
        String des =super.getDescription()+"-longueur"+longueur+"-largeur"+largeur;
        return des;
    }
    public double getVolume()
    {
        return largeur*longueur;
    }
}
