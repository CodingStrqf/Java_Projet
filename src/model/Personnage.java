package model;

public abstract class Personnage {

    private String pseudo;
    private int vie;
    private int def;
    private int attaque;
    private String type;
    private String description;

    public Personnage(String pseudo, int vie, int def, int attaque, String type, String description) {
        this.pseudo = pseudo;
        this.vie = vie;
        this.def = def;
        this.attaque = attaque;
        this.type = type;
        this.description = description;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getVie() {
        return vie;
    }

    public int getDef() {
        return def;
    }

    public int getAttaque() {
        return attaque;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }


}
