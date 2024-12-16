package personnes;
import lieux.Ville;

public abstract class Personne {
protected String nom;
protected String prenom;
private int age;
private Ville ville;
private final int ID;
private static int nbPersonnes;


@Override
public String toString()
{
	return "Nom: " + nom + "prenom: " + prenom + "age" + age + "ville: " + ville;
}

public Personne(){
	nbPersonnes ++;
	this.ID = nbPersonnes;
}
public String getNom() {
	return this.nom;
}

public String getPrenom() {
	return this.prenom;
}

public int getAge() {
	return this.age;
}

public Ville getVille() {
	return this.ville;
}

public int getID() {
	return this.ID;
}

public int getNbPersonnes() {
	return Personne.nbPersonnes;
}

}
