/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medev_ds;

/**
 *
 * @author Utilisateur
 */
public class Bateau {

    public int longueur;
    public int largeur;
    public Point2D pos;

    public Bateau(int lon, int larg) {
        longueur = lon;
        largeur = larg;
        pos=new Point2D(0,0);
    }
}
