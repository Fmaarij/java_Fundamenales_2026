void main() {
    /*Ecrire un programme qui calcule la valeur absolue d’un nombre. Pour rappel, la valeur absolue
      d’un nombre est ce nombre lui-même s’il est positif ou nul et son opposé (le même nombre changé
      de signe), s’il est négatif.*/
    Scanner s = new Scanner(System.in);
    System.out.println("Entrer le nombre dont vous voulez obtenir le valeur absolu");
    int nbr = s.nextInt();
    int nbrObsolu;
    if (nbr > 0) {
        nbrObsolu = -nbr;
    } else if (nbr == 0) {
        nbrObsolu = nbr;
    } else {
        nbrObsolu = -nbr;
    }
    System.out.println("La valeurs absolu de " + nbr + " = " + nbrObsolu + ".");
}