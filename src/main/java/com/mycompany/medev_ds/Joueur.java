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

    public String nom;
    public ArrayList<Bateau> MaListBateau;
    
    public Joueur(String name) {
        nom=name;
        MaListBateau=new ArrayList<>();
    }
    
}
