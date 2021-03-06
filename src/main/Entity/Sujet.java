/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author hp
 */
public class Sujet {

    private int Id_Sujet;
    private int Id_User;
    private String Titre_Sujet;
    private String Contenu_Sujet;
    
private  String Temps_Sujet ;
   
    private Categorie categorie;
    public Sujet() {
    }

    public Sujet(int Id_User, String Titre_Sujet, String Contenu_Sujet, Categorie categorie) {
        this.Id_User = Id_User;
        this.Titre_Sujet = Titre_Sujet;
        this.Contenu_Sujet = Contenu_Sujet;
        this.categorie = categorie;
    }

    public Sujet(int Id_Sujet, int Id_User, String Titre_Sujet, String Contenu_Sujet, String Temps_Sujet, Categorie categorie) {
        this.Id_Sujet = Id_Sujet;
        this.Id_User = Id_User;
        this.Titre_Sujet = Titre_Sujet;
        this.Contenu_Sujet = Contenu_Sujet;
        this.Temps_Sujet = Temps_Sujet;
        this.categorie = categorie;
    }

 

    public Sujet(int Id_User, String Titre_Sujet, String Contenu_Sujet, String Temps_Sujet) {
        this.Id_User = Id_User;
        this.Titre_Sujet = Titre_Sujet;
        this.Contenu_Sujet = Contenu_Sujet;
        this.Temps_Sujet = Temps_Sujet;
    }

    public Sujet(int Id_Sujet, int Id_User, String Titre_Sujet, String Contenu_Sujet, String Temps_Sujet) {
        this.Id_Sujet = Id_Sujet;
        this.Id_User = Id_User;
        this.Titre_Sujet = Titre_Sujet;
        this.Contenu_Sujet = Contenu_Sujet;
        this.Temps_Sujet = Temps_Sujet;
    }

    public Sujet(int Id_User, String Titre_Sujet, String Contenu_Sujet, String Temps_Sujet, Categorie categorie) {
        this.Id_User = Id_User;
        this.Titre_Sujet = Titre_Sujet;
        this.Contenu_Sujet = Contenu_Sujet;
        this.Temps_Sujet = Temps_Sujet;
        this.categorie = categorie;
    }

    
    public int getId_Sujet() {
        return Id_Sujet;
    }

    public void setId_Sujet(int Id_Sujet) {
        this.Id_Sujet = Id_Sujet;
    }

    public int getId_User() {
        return Id_User;
    }

    public void setId_User(int Id_User) {
        this.Id_User = Id_User;
    }

    public String getTitre_Sujet() {
        return Titre_Sujet;
    }

    public void setTitre_Sujet(String Titre_Sujet) {
        this.Titre_Sujet = Titre_Sujet;
    }

    public String getContenu_Sujet() {
        return Contenu_Sujet;
    }

    public void setContenu_Sujet(String Contenu_Sujet) {
        this.Contenu_Sujet = Contenu_Sujet;
    }

    public String getTemps_Sujet() {
        return Temps_Sujet;
    }

    public void setTemps_Sujet(String Temps_Sujet) {
        this.Temps_Sujet = Temps_Sujet;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

 


    @Override
    public String toString() {
        return "Sujet{" + "Id_Sujet=" + Id_Sujet + ", Id_User=" + Id_User + ", Titre_Sujet=" + Titre_Sujet + ", Contenu_Sujet=" + Contenu_Sujet + ", Temps_Sujet=" + Temps_Sujet + '}';
    }
    
    

}
