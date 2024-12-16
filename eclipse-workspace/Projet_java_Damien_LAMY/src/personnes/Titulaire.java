package personnes;
import java.util.ArrayList;
import java.util.List;
import java.util.Set; 
import java.util.HashSet; 

public class Titulaire extends Personne{
	private Set<Discipline> disciplines = new HashSet<Discipline>();
	private int numBureau;
	
	@Override
	public String toString() {
		
		String lesdisciplines = "";
		for (Discipline ladiscipline : disciplines) {
			lesdisciplines += ladiscipline;
		}
		
		String chaine = "Nom: " + super.nom + "Prenom: " + super.prenom + "disciplines : " +  lesdisciplines;
		return(chaine);
				
				}
	}
