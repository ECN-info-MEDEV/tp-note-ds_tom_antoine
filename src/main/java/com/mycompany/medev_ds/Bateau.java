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
    public ArrayList<Point2D>ListPos;

    public Bateau(int lon, int larg) {
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

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    
}
