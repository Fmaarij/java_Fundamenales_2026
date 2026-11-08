void main() {
/* Ecrire un programme qui calcule la factorielle d’un nombre entier fourni par l’utilisateur. Le pro
gramme doit verifer que le nombre est positif défaut de quoi il doit afficher un message d’erreur.
Pour rappel la factorielle d’un entier n se calcule comme n * (n- 1) * ... * 3 * 2 * 1*/

    Scanner s = new Scanner(System.in);
    System.out.println("Entrer un nombre dont la factorielle vous voulez voir : ");
    int nbr = s.nextInt();
    int fact = 1;

    if (nbr >= 0) {
        for (int i = 1; i <= nbr; i++) {
            fact *= i;//5*(5-1)
        }
        System.out.println("Factorielle de " + nbr + " = " + fact);

    } else {
        System.out.println("Vous avez entré un nombre négative!, fin du programme");
    }
}

