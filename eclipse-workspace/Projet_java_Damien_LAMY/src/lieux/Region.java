package lieux;

import java.util.List;
import java.util.ArrayList;

public enum Region {
Guadeloupe(new Ville("Basse-Terre","97100",9779,848,"Canton de Basse-Terre"),1628,378561,List.of("Guadeloupe")), 
Martinique(new Ville("Fort-de-France","97200",114896,44.21,"Martinique"),1128,349925,List.of("Martinique")), 
Guyane(new Ville ("Cayenne","97300",125552,23.6,"Guyane"),83534,295385,List.of("Guyane")), 
LaReunion(new Ville("Saint-Denis","97400",189109,142.79,"La Réunion"),2504,885700,List.of("La Réunion")), 
Mayotte(new Ville("Mamoudzou","97600",103593,42.3,"Mayotte"),374,320901,List.of("Mayotte")),
IledeFrance(new Ville("Paris","75000",2133111,105.40,"Paris"),12012,12419961,List.of("Paris","Seine-et-Marne", "Yvelines", "Essonne", "Hauts-de-Seine", "Seine-Saint-Denis", "Val-de-Marne", "Val-d'Oise")), 
CentreValdeLoire(new Ville("")), 
BourgogneFrancheComte,
Normandie,
HautsdeFrance,
GrandEst,
PaysdelaLoire,
Bretagne,
NouvelleAquitaine,
Occitanie,
AuvergneRhoneAlpes,
ProvenceAlpesCotedAzur,
Corse,
CollectivitesdOutreMer;
	
	private final Ville chefLieu;
	private float superficieRegion; //donne la superficie de la région en km2
	private int population2024;
	private List <String> departementsReg;
	
	Region(Ville ville, int superficieReg, int populationReg, List<String> departements) {
	this.chefLieu = ville;
	this.superficieRegion = superficieReg;
	this.population2024 = populationReg;
	this.departementsReg = departements;
	
	}


	public static Region getRegion(Ville uneVille) {
		return uneVille.Region;
	}
}