/**
* Un jeu de scrabble de 2 � 4 joueurs
*/


public class Scrabble {
	
	/**
	* Type agr�g� pour le sac, un sac est constitu� d'un nombre de lettre
	*/
	static class Sac {
		int nombreLettre;
	}
	
	/**
	* Type agr�g� pour le Joueur, un joueur poss�de un nom, un chevalet et un score
	*/
	static class Joueur {
		String nom;
		Chevalet chevalet;
		int score;
	}
	
	/**
	* Type agr�g� pour le Chevalet, un chevalet est constitu� d'un nombre de 
	* lettre inf�rieur ou �gal � 7
	*/
	static class Chevalet {
		char... lettre;
	}
	
	/**
	* Fonction pour cr�er le Sac, elle va donner 100 lettres
	*/
	static Sac creationSac{
		Sac sacPartie = new Sac();
		sacPartie.nombreLettre = 100;
		return sacPartie;
	}
}
	
	