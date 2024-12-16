package lieux;

public class Ville {
private String nomVille;
private String codePostal;
private int population; //Population en 2021
private double superficie;
private String departement;

public Ville(String nom, String codePostal, int population, double superficie, String departement)
{
	this.nomVille = nom;
	this.codePostal = codePostal;
	this.population = population;
	this.superficie = superficie;
	this.departement = departement;
}
}
