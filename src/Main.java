public class Main {
    /*
    Vérificateur de Nombre “Teen”

On dira qu’un nombre est “teen” s’il est dans la plage 13-19 (inclusivement).

Partie 1 : Méthode hasTeen

Écrivez une méthode appelée hasTeen avec 3 paramètres de type int.

La méthode doit retourner un boolean et elle doit retourner true si l’un des paramètres est dans la plage 13 (inclus) - 19 (inclus). Sinon, elle doit retourner false.

EXEMPLES D’ENTRÉE/SORTIE :

	•	hasTeen(9, 99, 19); → devrait retourner true car 19 est dans la plage 13-19.
	•	hasTeen(23, 15, 42); → devrait retourner true car 15 est dans la plage 13-19.
	•	hasTeen(22, 23, 34); → devrait retourner false car les nombres 22, 23, 34 ne sont pas dans la plage 13-19.

Partie 2 : Méthode isTeen

Écrivez une autre méthode appelée isTeen avec 1 paramètre de type int.

La méthode doit retourner un boolean et elle doit retourner true si le paramètre est dans la plage 13 (inclus) - 19 (inclus). Sinon, elle doit retourner false.

EXEMPLES D’ENTRÉE/SORTIE :

	•	isTeen(9); → devrait retourner false car 9 n’est pas dans la plage 13-19.
	•	isTeen(13); → devrait retourner true car 13 est dans la plage 13-19.

NOTE : Toutes les méthodes doivent être définies comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static boolean hasTeen(int a, int b, int c) {
        return (a<=19&&a>=13)||(b<=19&&b>=13)||(c<=19&&c>=13);
    }
    public static boolean isTeen(int a){
        return a<=19 && a>=13;
    }
}
