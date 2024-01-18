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

    public int longueur;
    public int largeur;
    public String nom;
    public ArrayList<Point2D>ListPos;

    public Bateau(int lon, int larg, String nom) {
        longueur = lon;
        largeur = larg;
        ListPos=new ArrayList<>();
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    } 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Point2D> getListPos() {
        return ListPos;
    }

    public void setListPos(ArrayList<Point2D> ListPos) {
        this.ListPos = ListPos;
    }
    
}
