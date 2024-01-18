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

    /**
     * Longueur de la grille
     */
    public int longueur;

    /**
     * Largeur de la grille
     */
    public int largeur;

    /**
     * Joueur qui commence la partie
     */
    public Joueur J1;

    /**
     * Liste des Tirs que le joueur 1 a pu faire dans la partie
     */
    public ArrayList<Point2D> TirJ1;

    /**
     * Joueur qui joue en second
     */
    public Joueur J2;

    /**
     * Liste des Tirs que le joueur 2 a pu faire dans la partie
     */
    public ArrayList<Point2D> TirJ2;

    /**
     *
     * @param lon
     * @param larg
     */
    public Grille(int lon, int larg) {
        longueur = lon;
        largeur = larg;
        J1 = new Joueur("J1");
        J2 = new Joueur("J2");
        TirJ1 = new ArrayList<>();
        TirJ2 = new ArrayList<>();
    }

    /**
     *
     * @param b
     * @param J
     */
    public void Placement(Bateau b, Joueur J) {
        boolean place = false;
        ArrayList<Point2D> ListPosPot = new ArrayList<>();
        while (place == false) {
            ListPosPot = new ArrayList<>();

            Scanner sc = new Scanner(System.in);
            System.out.println("Donnez la ligne d'une position extreme du bateau " + b.nom + " de taille " + b.longueur + " : (0-4)");
            String tp = sc.nextLine();
            int ligne = Integer.parseInt(tp);
            while (0 > ligne && ligne > 4) {
                System.out.println("Donnez la ligne d'une autre position extreme du bateau " + b.nom + " de taille " + b.longueur + " : (0-4");
                tp = sc.nextLine();
            }

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Donnez la colonne d'une position extreme du bateau " + b.nom + " de taille " + b.longueur + " : (0-4)");
            String tp3 = sc.nextLine();
            int colonne = Integer.parseInt(tp3);
            while (0 > colonne && colonne > 4) {
                System.out.println("Donnez la colonne d'une autre position extreme du bateau " + b.nom + " de taille " + b.longueur + " : (0-4)");
                tp3 = sc3.nextLine();
            }
            ListPosPot.add(new Point2D(ligne, colonne));

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Voulez vous que le bateau soit positionné en Haut/Bas/Gauche/Droite par rapport à la position extrème");
            String tp2 = sc.nextLine();
            while (!tp2.equals("Haut") && !tp2.equals("Bas") && !tp2.equals("Gauche") && !tp2.equals("Droite")) {
                System.out.println("Voulez vous que le bateau soit positionné en Haut/Bas/Gauche/Droite par rapport à la position extrème");
                tp2 = sc2.nextLine();
            }

            if (tp2.equals("Haut")) {

                for (int i = 1; i < b.longueur; i++) {
                    ligne = ligne - 1;
                    ListPosPot.add(new Point2D(ligne, colonne));
                }
            }
            if (tp2.equals("Bas")) {
                for (int i = 1; i < b.longueur; i++) {
                    ligne = ligne + 1;
                    ListPosPot.add(new Point2D(ligne, colonne));
                }
            }
            if (tp2.equals("Gauche")) {
                for (int i = 1; i < b.longueur; i++) {
                    colonne = colonne - 1;
                    ListPosPot.add(new Point2D(ligne, colonne));
                }
            }
            if (tp2.equals("Droite")) {
                for (int i = 1; i < b.longueur; i++) {
                    colonne = colonne + 1;
                    ListPosPot.add(new Point2D(ligne, colonne));
                }
            }
            place = PositionLibre(ListPosPot, J);
            if (place == false) {
                System.out.println("Ce n'est pas possible");
            }
        }
        b.ListPos = ListPosPot;
        J.MaListBateau.add(b);
    }

    /**
     *
     * @param positions
     * @param J
     * @return
     */
    public boolean PositionLibre(ArrayList<Point2D> positions, Joueur J) {

        for (Bateau bateau : J.MaListBateau) {
            for (Point2D positionBateau : bateau.ListPos) {
                for (Point2D pos : positions) {
                    if (pos.getX() == positionBateau.getX() && pos.getY() == positionBateau.getY()) {
                        return false; // La position n'est pas libre
                    }
                }
            }
        }
        for (Point2D point : positions) {
            if (point.x > 4 || point.x < 0 || point.y > 4 || point.y < 0) {
                return false;
            }
        }
        return true; // Toutes les positions sont libres
    }

    /**
     *
     * @param t
     */
    public void Action(int tour) {

        if (tour % 2 == 1) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Donnez la ligne de la case que vous voulez attaquer : (0-4)");
            String tp = sc.nextLine();
            int ligne = Integer.parseInt(tp);
            while (0 > ligne && ligne > 4) {
                System.out.println("Donnez la ligne de la case que vous voulez attaquer : (0-4)");
                tp = sc.nextLine();
            }

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Donnez la colonne de la case que vous voulez attaquer : (0-4)");
            String tp3 = sc.nextLine();
            int colonne = Integer.parseInt(tp3);
            while (0 > colonne && colonne > 4) {
                System.out.println("Donnez la colonne de la case que vous voulez attaquer : (0-4)");
                tp3 = sc3.nextLine();
            }
            Point2D PosAttaque = new Point2D(ligne, colonne);
            TirJ1.add(PosAttaque);
            boolean toucher = false;
            for (Bateau bateau : J2.MaListBateau) {
                for (Point2D pos : bateau.getListPos()) {
                    if (pos.getX() == ligne && pos.getY() == colonne) {
                        System.out.println("Touché");
                        toucher = true;
                    }
                }
            }
            if (!toucher) {
                System.out.println("Raté");
            }
        } else {

            Scanner sc = new Scanner(System.in);
            System.out.println("Donnez la ligne de la case que vous voulez attaquer : (0-4)");
            String tp = sc.nextLine();
            int ligne = Integer.parseInt(tp);
            while (0 > ligne && ligne > 4) {
                System.out.println("Donnez la ligne de la case que vous voulez attaquer : (0-4)");
                tp = sc.nextLine();
            }

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Donnez la colonne de la case que vous voulez attaquer : (0-4)");
            String tp3 = sc.nextLine();
            int colonne = Integer.parseInt(tp3);
            while (0 > colonne && colonne > 4) {
                System.out.println("Donnez la colonne de la case que vous voulez attaquer : (0-4)");
                tp3 = sc3.nextLine();
            }
            Point2D PosAttaque = new Point2D(ligne, colonne);
            TirJ2.add(PosAttaque);
            boolean toucher = false;
            for (Bateau bateau : J2.MaListBateau) {
                for (Point2D pos : bateau.getListPos()) {
                    if (pos.getX() == ligne && pos.getY() == colonne) {
                        System.out.println("Touché");
                        toucher = true;
                    }
                }
            }
            if (!toucher) {
                System.out.println("Raté");
            }
        }
    }

    /**
     *
     * @return
     */
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
                    if (positionToucher == false) {
                        gagne = false;
                    }
                }
            }
        }
        if (gagne) {
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
                    if (positionToucher == false) {
                        gagne = false;
                    }
                }
            }
        }
        if (gagne) {
            return 2;
        }
        return 0;
    }

    /**
     *
     * @param tour
     * @return
     */
    public int TourDeJeu(int tour) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prêt pour le début du tour ? (O/N)");
        String tp = sc.nextLine();
        while (!tp.equals("O")) {
            System.out.println("Prêt pour le début du tour ? (O/N)");
            tp = sc.nextLine();
        }

        this.Affichage(tour);
        this.Action(tour);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Est ce que le tour est fini ? (O/N)");
        String tp2 = sc2.nextLine();
        while (!tp2.equals("O")) {
            System.out.println("Est ce que le le tour est fini ? (O/N)");
            tp2 = sc.nextLine();
        }

        return tour + 1;
    }

    /**
     *
     * @param tour
     */
    public void Affichage(int tour) {
        if (tour % 2 == 1) {
            System.out.println("Grille des bateaux de J1 :");
            for (int i = 0; i < largeur; i++) {
                for (int j = 0; j < longueur; j++) {
                    int occupe = 0;
                    for (Bateau b : J1.getMaListBateau()) {
                        for (Point2D pos : b.getListPos()) {
                            if (pos.getX() == i && pos.getY() == j) {
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
                                if (pos.getX() == pos2.getX() && pos.getY() == pos2.getY() && pos2.getX() == i && pos2.getY() == j) {
                                    System.out.print("x");
                                    occupe = 1;
                                }
                            }
                        }
                        if (occupe == 0 && pos2.getX() == i && pos2.getY() == j) {
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
                            if (pos.getX() == i && pos.getY() == j) {
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
                                if (pos.getX() == pos2.getX() && pos.getY() == pos2.getY() && pos2.getX() == i && pos2.getY() == j) {
                                    System.out.print("x");
                                    occupe = 1;
                                }
                            }
                        }
                        if (occupe == 0 && pos2.getX() == i && pos2.getY() == j) {
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
