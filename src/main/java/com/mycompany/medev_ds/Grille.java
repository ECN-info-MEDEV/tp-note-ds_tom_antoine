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
public class Grille {
    public int longueur;
    public int largeur;
    public Joueur J1;
    public  ArrayList<Point2D> TirJ1;
    public Joueur J2;
    public  ArrayList<Point2D> TirJ2;
    public Grille(int lon, int larg){
        longueur=lon;
        largeur=larg;
        J1=new Joueur("J1");
        J2=new Joueur("J2");
        TirJ1= new ArrayList<>();
        TirJ2= new ArrayList<>();
    }
    public void TourDeJeu(){
        
    }
    public void Placement(){
        
    }
    public void Action(){
        
    }
    public void FinJeu(){
        
    }
    public void Affichage(int tour){
        if (1+tour%2==1){
            System.out.println("Grille des bateaux de J1 | Grille des tirs de J1");
            for (int i = 0; i < largeur; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < longueur; j++) {
                Point2D point = new Point2D(j, i);
                if (J1.getMaListBateau().contains(point)) {
                    System.out.print("B ");  // Afficher un bateau
                } else if (tirs.contains(point)) {
                    System.out.print("X ");  // Afficher un tir
                } else {
                    System.out.print(". ");  // Espace vide
                }
            }
            System.out.println();
        }
    }
}
