package com.example.trouvetonclub.Metier;

public class Clubs {
    private String nom_club;
    private String email_club;
    private String Num_tel;
    private String Cde_departement;
    private String  adresse_club;





    public void setNom_club(String nom_club) {
        this.nom_club = nom_club;
    }

    public void setEmail(String email_club) {
        this.email_club = email_club;
    }

    public void setAdresse_club(String adresse_club) {
        this.adresse_club = adresse_club;
    }

    public void setNum_tel(String num_tel) {
        this.Num_tel = num_tel;
    }

    public void setCde_departement(int cde_departement) {
        this.Cde_departement = Cde_departement;
    }



    public String getemail_club() {
        return email_club;
    }

    public String getNum_tel() {
        return Num_tel;
    }

    public String getCde_departement() {
        return Cde_departement;
    }

    public String getadresse_club() {
        return adresse_club;
    }
    public String getNom_club() {
        return nom_club;
    }


    public Clubs(String nom_club, String email_club, String cde_departement, String Num_tel,String adresse_club) {
        this.nom_club = nom_club;
        this.email_club = email_club;
        this.Cde_departement = cde_departement;
        this.Num_tel = Num_tel;
        this.adresse_club= adresse_club;
    }

    public String toString() {
        return nom_club + " " + email_club + "  " + Num_tel + " " + Cde_departement + " ";
    }

    public void add(Clubs unClub) {
    }
}



