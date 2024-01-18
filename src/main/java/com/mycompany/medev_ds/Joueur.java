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
public class Joueur {

    /**
     *Nom du bateau
     */
    public String nom;

    /**
     * Liste des bateaux placés
     */
    public ArrayList<Bateau> MaListBateau;
    
    /**
     *
     * @param name nom du joueur
     */
    public Joueur(String name) {
        nom=name;
        MaListBateau=new ArrayList<>();
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
     * @param nom nom du joueur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public ArrayList<Bateau> getMaListBateau() {
        return MaListBateau;
    }

    /**
     *
     * @param MaListBateau liste des bateaux placés
     */
    public void setMaListBateau(ArrayList<Bateau> MaListBateau) {
        this.MaListBateau = MaListBateau;
    }
    
}
