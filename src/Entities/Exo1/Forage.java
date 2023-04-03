package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diamètre;


    public Forage(int idCaptage, String nom, int hauteur, int debit,int diamètre) {
        super(idCaptage, nom, hauteur, debit);
        this.diamètre = diamètre;
    }

    public String getDescription()
    {
        String des =super.getDescription()+"-diamètre"+diamètre;
        return des;
    }
    public double getVolume()
    {
//        Math.PI*diamètre*super.
        return diamètre;
    }
}
