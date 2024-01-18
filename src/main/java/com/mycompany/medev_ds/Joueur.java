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
     *
     */
    public String nom;

    /**
     *
     */
    public ArrayList<Bateau> MaListBateau;
    
    /**
     *
     * @param name
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
     * @param nom
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
     * @param MaListBateau
     */
    public void setMaListBateau(ArrayList<Bateau> MaListBateau) {
        this.MaListBateau = MaListBateau;
    }
    
}
