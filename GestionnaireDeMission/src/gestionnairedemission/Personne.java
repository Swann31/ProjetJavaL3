/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnairedemission;

public abstract class Personne {
    protected String nom; // Nom de la personne
    protected String prenom; // Prénom de la personne
    
    //Déclaration des setters
    protected void setNom(String n)
    {
        this.nom=n;
    }
    protected void setPrenom(String s)
    {
        this.prenom=s;
    }
    
    //Déclaration des getters
    protected String getNom()
    {
        return this.nom;
    }
    protected String getPrenom()
    {
        return this.prenom;
    }      
}
