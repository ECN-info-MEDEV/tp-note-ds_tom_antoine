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
    
    public void Placement(Bateau b,Joueur J){
        ArrayList<Point2D> ListPosPot= new ArrayList<>();
    
         Scanner sc = new Scanner(System.in);
        System.out.println("Donnez la ligne d'une position extreme du bateau"+b.nom+"de taille"+b.longueur+"1-5)");
        String tp = sc.nextLine();
        while (!tp.equals("[1-5]")) {
            System.out.println("Donnez la ligne d'une autre position extreme du bateau"+b.nom+"de taille"+b.longueur+": 1-5");
            tp = sc.nextLine();
        }
        
                 Scanner sc3 = new Scanner(System.in);
        System.out.println("Donnez la ligne d'une position extreme du bateau"+b.nom+"de taille"+b.longueur+"1-5)");
        String tp3 = sc.nextLine();
        while (!tp.equals("[1-5]")) {
            System.out.println("Donnez la ligne d'une autre position extreme du bateau"+b.nom+"de taille"+b.longueur+": 1-5");
            tp3 = sc3.nextLine();
        }
        
        int ligne1 = Integer.parseInt(tp);
        int ligne2 = Integer.parseInt(tp3);
        ListPosPot.add(new Point2D(ligne1, ligne2));
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Voulez vous que le bateau soit positionné en Haut/Bas/Gauche/Droite par rapport à la position extrème");
        String tp2 = sc.nextLine();
        while (!tp2.equals("Haut")&&!tp2.equals("Bas")&&!tp2.equals("Gauche")&&!tp2.equals("Droite")) {
            System.out.println("Voulez vous que le bateau soit positionné en Haut/Bas/Gauche/Droite par rapport à la position extrème");
            tp2 = sc2.nextLine();
           int ligne3 = Integer.parseInt(tp2); 
           if(tp2.equals("Haut")){
            
        }
        
        
    }
    }
    public void Action(int t){
        
    }

    public int FinJeu() {
        boolean gagne = true;
        while (gagne) {
            for (Bateau b : J2.getMaListBateau()) {
                for (Point2D pos : b.getListPos()) {
                    boolean positionToucher = false;
                    for (Point2D pos2 : TirJ1) {
                        if (pos.getX() == pos2.getX() && pos.getY() == pos2.getY()) {
                            positionToucher = true;
                        }
                    }
                    if (positionToucher=false){
                        gagne=false;
                    }
                }
            }
        }
        if (gagne){
            return 1;
        }
        gagne = true;
        while (gagne) {
            for (Bateau b : J1.getMaListBateau()) {
                for (Point2D pos : b.getListPos()) {
                    boolean positionToucher = false;
                    for (Point2D pos2 : TirJ2) {
                        if (pos.getX() == pos2.getX() && pos.getY() == pos2.getY()) {
                            positionToucher = true;
                        }
                    }
                    if (positionToucher=false){
                        gagne=false;
                    }
                }
            }
        }
        if (gagne){
            return 2;
        }
        return 0;
    }
  
    public int TourDeJeu(int tour) {
        

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

    
    public void Affichage(int tour) {
        if (1 + tour % 2 == 1) {
            System.out.println("Grille des bateaux de J1 :");
            for (int i = 0; i < largeur; i++) {
                for (int j = 0; j < longueur; j++) {
                    int occupe = 0;
                    for (Bateau b : J1.getMaListBateau()) {
                        for (Point2D pos : b.getListPos()) {
                            if (pos.getX() == j && pos.getY() == i) {
                                System.out.print("B");
                                occupe = 1;
                            }
                        }
                    }
                    if (occupe == 0) {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
            System.out.println("Grille des Tirs de J1 :");
            for (int i = 0; i < largeur; i++) {
                for (int j = 0; j < longueur; j++) {
                    int occupe = 0;
                    for (Point2D pos2 : TirJ1) {
                        for (Bateau b : J2.getMaListBateau()) {
                            for (Point2D pos : b.getListPos()) {
                                if (pos.getX() == pos2.getX() && pos.getY() == pos2.getY() && pos2.getX()==j && pos2.getY()==i) {
                                    System.out.print("x");
                                    occupe = 1;
                                }
                            }
                        }
                        if (occupe==0 && pos2.getX()==j && pos2.getY()==i){
                            System.out.print("o");
                        }
                    }
                    if (occupe == 0) {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Grille des bateaux de J2 :");
            for (int i = 0; i < largeur; i++) {
                for (int j = 0; j < longueur; j++) {
                    int occupe = 0;
                    for (Bateau b : J2.getMaListBateau()) {
                        for (Point2D pos : b.getListPos()) {
                            if (pos.getX() == j && pos.getY() == i) {
                                System.out.print("B");
                                occupe = 1;
                            }
                        }
                    }
                    if (occupe == 0) {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
            System.out.println("Grille des Tirs de J2 :");
            for (int i = 0; i < largeur; i++) {
                for (int j = 0; j < longueur; j++) {
                    int occupe = 0;
                    for (Point2D pos2 : TirJ2) {
                        for (Bateau b : J1.getMaListBateau()) {
                            for (Point2D pos : b.getListPos()) {
                                if (pos.getX() == pos2.getX() && pos.getY() == pos2.getY() && pos2.getX()==j && pos2.getY()==i) {
                                    System.out.print("x");
                                    occupe = 1;
                                }
                            }
                        }
                        if (occupe==0 && pos2.getX()==j && pos2.getY()==i){
                            System.out.print("o");
                        }
                    }
                    if (occupe == 0) {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
            
        }
    }
}
