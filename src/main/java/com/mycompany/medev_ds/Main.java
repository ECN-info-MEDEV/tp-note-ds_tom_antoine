/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medev_ds;

/**
 *
 * @author Utilisateur
 */
public class Main {

    public static void main(String[] args) {
        //initialisation de la grille et des joueurs
        Grille grille= new Grille(5,5);
        Bateau PorteAvionsJ1 = new Bateau(5,1,"porte-avions");
        grille.J1.getMaListBateau().add(PorteAvionsJ1);
        Bateau CuirasseJ1= new Bateau(4,1,"cuirassé");
        grille.J1.getMaListBateau().add(CuirasseJ1);
        Bateau DestroyerJ1 = new Bateau(3,1,"destroyer");
        grille.J1.getMaListBateau().add(DestroyerJ1);
        Bateau PorteAvionsJ2 = new Bateau(5,1,"porte-avions");
        grille.J1.getMaListBateau().add(PorteAvionsJ2);
        Bateau CuirasseJ2= new Bateau(4,1,"cuirassé");
        grille.J1.getMaListBateau().add(CuirasseJ2);
        Bateau DestroyerJ2 = new Bateau(3,1,"destroyer");
        grille.J1.getMaListBateau().add(DestroyerJ2);
        //placement des bateaux
        grille.Placement(PorteAvionsJ1,grille.J1);
        grille.Placement(CuirasseJ1,grille.J1);
        grille.Placement(DestroyerJ1,grille.J1);
        grille.Placement(PorteAvionsJ2,grille.J2);
        grille.Placement(CuirasseJ2,grille.J2);
        grille.Placement(DestroyerJ2,grille.J2);
        //Jouer la partie
        int tour =0;
        
    }
}
