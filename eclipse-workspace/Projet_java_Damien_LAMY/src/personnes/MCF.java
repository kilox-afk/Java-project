package personnes;

public class MCF extends Titulaire {
	private Etudiant etudiant;
	
	@Override
	public String toString() {
		return "Nom de l'étudiant : " + this.etudiant.getNom() + "Prenom de l'étudiant : " + this.etudiant.getPrenom() +
				"Age de l'étudiant : " + this.etudiant.getAge() + "Ville de l'étudiant : " + this.etudiant.getVille() +
				"Identifiant de l'étudiant : " + this.etudiant.getID() + "personne numéro " + this.etudiant.getNbPersonnes() +
				"Sujet de These de l'étudiant : " + this.etudiant.getSujetDeThese() + "Discipline de l'étudiant : "
				+ this.etudiant.getDiscipline() + "année de thèse de l'étudiant : " + this.etudiant.getAnneeDeThese() + "encadrant de l'étudiant : "
				+ this.etudiant.getEncadrant();
	}
	
}
