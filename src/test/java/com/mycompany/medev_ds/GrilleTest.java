/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.medev_ds;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Utilisateur
 */
public class GrilleTest {
    
    public GrilleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of Placement method, of class Grille.
     */
    @Test
    public void testPlacement() {
        System.out.println("Placement");
        Bateau b = null;
        Joueur J = null;
        Grille instance = null;
        instance.Placement(b, J);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PositionLibre method, of class Grille.
     */
    @Test
    public void testPositionLibre() {
        System.out.println("PositionLibre");
        ArrayList<Point2D> positions = null;
        Joueur J = null;
        Grille instance = null;
        boolean expResult = false;
        boolean result = instance.PositionLibre(positions, J);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Action method, of class Grille.
     */
    @Test
    public void testAction() {
        System.out.println("Action");
        int tour = 0;
        Grille instance = null;
        instance.Action(tour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FinJeu method, of class Grille.
     */
    @Test
    public void testFinJeu() {
        System.out.println("FinJeu");
        Grille instance = null;
        int expResult = 0;
        int result = instance.FinJeu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TourDeJeu method, of class Grille.
     */
    @Test
    public void testTourDeJeu() {
        System.out.println("TourDeJeu");
        int tour = 0;
        Grille instance = null;
        int expResult = 0;
        int result = instance.TourDeJeu(tour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Affichage method, of class Grille.
     */
    @Test
    public void testAffichage() {
        System.out.println("Affichage");
        int tour = 0;
        Grille instance = null;
        instance.Affichage(tour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
