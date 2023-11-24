package org.elmaghrani.strategy;

import org.elmaghrani.strategy.context.ContextTri;
import org.elmaghrani.strategy.strategies.TriBulles;
import org.elmaghrani.strategy.strategies.TriRapide;

public class Main {
    public static void main(String[] args) {
        ContextTri c =  new ContextTri();
        c.setAlgorithmeTri(new TriBulles());
        c.effectuerTri();
        System.out.println("changement de strategy ");
        c.setAlgorithmeTri(new TriRapide());
        c.effectuerTri();
    }
}