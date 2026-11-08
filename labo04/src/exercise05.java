void main() {
    /*Ecrire un programme qui compte le nombre de valeurs positives, négatives et nulles d’une série de
    n nombres entrés par l’utilisateur. Par exemple si l’utilisateur entre :
    8
    5 9-1 0 12-7-4 3
    l’ordinateur a che :
    positifs : 4
    négatifs : 3
    nulles : 1
    */
    Scanner s = new Scanner(System.in);
    System.out.println("Combien des nombre vous voulez entrer? ");
    int arret = s.nextInt();
    int nbr = 0;
    int nbrPos = 0;
    int nbrNeg = 0;
    int nbrNull = 0;
    for (int i = 1; i <= arret; i++) {
        System.out.println("veuillez entrez le nombre " + i + "/" + arret);
        nbr = s.nextInt();
        if (nbr > 0) {
            nbrPos++;
        } else if (nbr == 0) {
            nbrNull++;

        } else {
            nbrNeg++;
        }
    }
    System.out.println("Nombres positives : " + nbrPos);
    System.out.println("Nombres Negatives : " + nbrNeg);
    System.out.println("Et nombres nulles = " + nbrNull);
}