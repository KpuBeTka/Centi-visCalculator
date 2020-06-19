package Main;

import javafx.scene.image.Image;

public class Aspect {

    private int ID;
    private Image aspectImage;
    private String aspectTitle;
    private boolean containsAer, containsAqua, containsIgnis, containsOrdo, containsPerditio, containsTerra;

    public Aspect() {
    }

    public Aspect(int ID, Image aspectImage, String aspectTitle, boolean containsAer, boolean containsAqua, boolean containsIgnis, boolean containsOrdo, boolean containsPerditio, boolean containsTerra) {
        this.ID = ID;
        this.aspectImage = aspectImage;
        this.aspectTitle = aspectTitle;
        this.containsAer = containsAer;
        this.containsAqua = containsAqua;
        this.containsIgnis = containsIgnis;
        this.containsOrdo = containsOrdo;
        this.containsPerditio = containsPerditio;
        this.containsTerra = containsTerra;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Image getAspectImage() {
        return aspectImage;
    }

    public void setAspectImage(Image aspectImage) {
        this.aspectImage = aspectImage;
    }

    public String getAspectTitle() {
        return aspectTitle;
    }

    public void setAspectTitle(String aspectTitle) {
        this.aspectTitle = aspectTitle;
    }

    public boolean isContainsAer() {
        return containsAer;
    }

    public void setContainsAer(boolean containsAer) {
        this.containsAer = containsAer;
    }

    public boolean isContainsAqua() {
        return containsAqua;
    }

    public void setContainsAqua(boolean containsAqua) {
        this.containsAqua = containsAqua;
    }

    public boolean isContainsIgnis() {
        return containsIgnis;
    }

    public void setContainsIgnis(boolean containsIgnis) {
        this.containsIgnis = containsIgnis;
    }

    public boolean isContainsOrdo() {
        return containsOrdo;
    }

    public void setContainsOrdo(boolean containsOrdo) {
        this.containsOrdo = containsOrdo;
    }

    public boolean isContainsPerditio() {
        return containsPerditio;
    }

    public void setContainsPerditio(boolean containsPerditio) {
        this.containsPerditio = containsPerditio;
    }

    public boolean isContainsTerra() {
        return containsTerra;
    }

    public void setContainsTerra(boolean containsTerra) {
        this.containsTerra = containsTerra;
    }

}
