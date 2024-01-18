/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medev_ds;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //initialisation de la grille et des joueurs
        Grille grille= new Grille(5,5);
        Bateau PorteAvionsJ1 = new Bateau(5,1,"porte-avions");
        Bateau CuirasseJ1= new Bateau(4,1,"cuirassé");
        Bateau DestroyerJ1 = new Bateau(3,1,"destroyer");
        Bateau PorteAvionsJ2 = new Bateau(5,1,"porte-avions");
        Bateau CuirasseJ2= new Bateau(4,1,"cuirassé");
        Bateau DestroyerJ2 = new Bateau(3,1,"destroyer");
        //placement des bateaux
        grille.Placement(PorteAvionsJ1,grille.J1);
        grille.Affichage(1);
        grille.Placement(CuirasseJ1,grille.J1);
        grille.Affichage(1);
        grille.Placement(DestroyerJ1,grille.J1);
        grille.Affichage(1);
        grille.Placement(PorteAvionsJ2,grille.J2);
        grille.Affichage(2);
        grille.Placement(CuirasseJ2,grille.J2);
        grille.Affichage(2);
        grille.Placement(DestroyerJ2,grille.J2);
        grille.Affichage(2);
        //Jouer la partie
        int tour =0;
        int finJeu=0;
        while(finJeu==0){
            tour=grille.TourDeJeu(tour);
            finJeu=grille.FinJeu();
        }
            System.out.println("Félicitation, victoire du joueur "+finJeu);
    }
}
