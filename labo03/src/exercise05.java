void main() {
    /* Ecrire un programme qui calcule la moyenne d’une sØrie de nombres entiers positifs entrØs par
        l’utilisateur. L’utilisateur ne sait pas l’avance combien de nombres il compte entrer mais comme
        ces nombres sont tous positif, il est convenu que l’utilisateur indique son intention d’arrŒter la saisie
        par le nombre-1. Ce dernier nombre ne fait pas partie de la sØrie et ne doit pas Œtre comptØ dans
        la moyenne. Il sert juste indiquer la n de la sØrie. On l’appelle une sentinelle. Si par exemple
        l’utilisateur tape 15 9 12 4 15-1 l’ordinateur calcule la moyenne des 5 premiers nombres et
        rØpond 11.*/
    int cpt = 0;
    int cptFinal = 0;
    int somme = 0;
    double moyenne;

    Scanner s = new Scanner(System.in);
    System.out.println("Entrez les chiffre dont la moyenne vous voulez savoir, pour arreter entre -1 : ");
    int n = 0;
    while (n != -1) {
        cptFinal = cpt;
        somme = somme + n;
        n = s.nextInt();
        cpt++;
    }
    System.out.println("Compteur : " + cptFinal);
    System.out.println("Somme : " + somme);
    moyenne = (double)somme / cptFinal;
    System.out.println("Moyenne : " + moyenne);

}