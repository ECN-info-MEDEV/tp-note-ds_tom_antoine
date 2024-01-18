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
     *
     */
    public int longueur;

    /**
     *
     */
    public int largeur;

    /**
     *
     */
    public String nom;

    /**
     *
     */
    public ArrayList<Point2D>ListPos;

    /**
     *
     * @param lon
     * @param larg
     * @param nom
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
     * @param longueur
     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    /**
     *
     * @return
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     *
     * @param largeur
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    } 

    /**
     *
     * @return
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
     * @return
     */
    public ArrayList<Point2D> getListPos() {
        return ListPos;
    }

    /**
     *
     * @param ListPos
     */
    public void setListPos(ArrayList<Point2D> ListPos) {
        this.ListPos = ListPos;
    }
    
}
