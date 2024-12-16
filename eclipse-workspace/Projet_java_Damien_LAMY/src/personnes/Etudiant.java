package personnes;

public class Etudiant extends Personne {
	private String sujetDeThese;
	private Discipline discipline;
	private int anneeDeThese;
	private Titulaire encadrant;

public String getSujetDeThese()	{
	return this.sujetDeThese;
}

public Discipline getDiscipline()	{
	return this.discipline;
}

public int getAnneeDeThese() {
	return this.anneeDeThese;
}

public Titulaire getEncadrant() {
	return this.encadrant;
}

}
