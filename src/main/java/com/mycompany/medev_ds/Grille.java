/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medev_ds;
import java.util.ArrayList;
import java.util.Scanner;
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
    
    public void Placement(Bateau b){
        
    
         Scanner sc = new Scanner(System.in);
        System.out.println("Donnez une position extreme du bateau"+b.nom+"de taille"+b.longueur+"(Chiffre:1-5,Chiffre:1-5)");
        String tp = sc.nextLine();
        while (!tp.equals("\\([1-5],[1-5]\\)")) {
            System.out.println("Donnez une autre position extreme du bateau"+b.nom+"de taille"+b.longueur+"(Chiffre:1-5,Chiffre:1-5)");
            tp = sc.nextLine();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Voulez vous que le bateau soit positionné en Haut/Bas/Gauche/Droite par rapport à la position extrème");
        String tp2 = sc.nextLine();
        while (!tp2.equals("\\([1-5],[1-5]\\)")) {
            System.out.println("Donnez une autre position extreme du bateau"+b.nom+"de taille"+b.longueur+"(Chiffre:1-5,Chiffre:1-5)");
            tp2 = sc.nextLine();
        }
    }
    public void Action(int t){
        
    }
    public void FinJeu(){
        
    }
  
    public int tourDeJeu(int tour) {
        

       Scanner sc = new Scanner(System.in);
        System.out.println("Prêt pour le début du tour de J" + (1+tour%2)+"? (O/N)");
        String tp = sc.nextLine();
         while (!tp.equals("O")) {
            System.out.println("Prêt pour le début du tour de J" + (1+tour%2)+"? (O/N)");
            tp = sc.nextLine();
        }
         this.Affichage(tour);
         this.Action(tour);
         
          Scanner sc2 = new Scanner(System.in);
        System.out.println("Est ce que le joueur J" + (1+tour%2)+"a fini son tour? (O/N)");
        String tp2 = sc2.nextLine();
         while (!tp2.equals("O")) {
            System.out.println("Est ce que le joueur J" + (1+tour%2)+"a fini son tour? (O/N)");
            tp2 = sc.nextLine();}
         
        return tour + 1;
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
