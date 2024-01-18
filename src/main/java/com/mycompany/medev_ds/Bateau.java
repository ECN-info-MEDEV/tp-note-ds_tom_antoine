/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medev_ds;
import java.util.ArrayList;
/**
 *
 * @author Utilisateur
 */
public class Bateau {

    /**

     *longueur du bateau

     *

     */
    public int longueur;

    /**

     *largeur du bateau

     *

     */
    public int largeur;

    /**

     *nom du bateau

     *

     */
    public String nom;

    /**

     *Liste des cases prisent par le bateau

     *

     */
    public ArrayList<Point2D>ListPos;

    /**
     *

     * @param lon longueur du bateau
     * @param larg largeur du bateau
     * @param nom nom du bateau
     */ 

  

    public Bateau(int lon, int larg, String nom) {
        longueur = lon;
        largeur = larg;
        this.nom=nom;
        ListPos=new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     *

     * @param longueur longueur du bateau



     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    /**
     *

     * @return largeur du bateau



     */
    public int getLargeur() {
        return largeur;
    }

    /**
     *

     * @param largeur largeur du bateau

     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    } 

    /**
     *

     * @return nom du bateau


     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *

     * @return liste des cases prisent par le bateau

     * @return

     */
    public ArrayList<Point2D> getListPos() {
        return ListPos;
    }

    /**

     * @param ListPos liste des cases prisent par le bateau

     */
    public void setListPos(ArrayList<Point2D> ListPos) {
        this.ListPos = ListPos;
    }
    
}
