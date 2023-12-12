/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psabor;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Positivo
 */
public class Restaurante {
    DecimalFormat df = new DecimalFormat("0.00");
    public String formapagar, cliente,tempnome;
    public int mesa,a,qnt=0;
    public float svalor, precopro;
    public int temp;
    public int p,x;
    
    public String[] produto= new String[]{
            "Acarajé com Vatapá e Camarão",
            "Moqueca de Peixe com Dendê",
            "Bobó de Camarão",
            "Casquinha de Siri",
            "Pastéis de Carne do Sol",
            "Caipirinha de Cachaça com Frutas Tropicais",
            "Água de Coco Gelada",
            "Capeta (Coquetel Típico com Vodka, Leite Condensado e Outros Ingredientes)",
            "Suco de Caju Natural",
            "Cerveja Artesanal Local",
            "Salada de Palmito com Molho de Maracujá",
            "Caldo de Sururu",
            "Bolinho de Feijoada com Molho de Pimenta",
            "Espetinho de Queijo Coalho com Mel de Engenho",
            "Salada de Bacalhau com Grão-de-Bico",
            "Moqueca de Peixe com Arroz de Coco e Farofa de Dendê",
            "Caruru com Camarão Seco, Vatapá e Acaçá",
            "Ensopado de Siri com Banana da Terra",
            "Feijoada Baiana com Arroz, Couve e Laranja",
            "Camarões na Moranga com Catupiry, Arroz e Pirão"
        };

     public float[] precosPorcoes = new float[]{18.90f, 26.50f, 22.90f, 14.75f, 12.50f,15.90f, 6.50f, 18.50f, 7.90f, 10.50f,14.90f, 9.75f, 11.50f, 13.25f, 16.90f,32.90f, 29.50f, 25.75f, 28.90f, 34.50f};
}
