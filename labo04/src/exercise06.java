void main(String[] args) {
/* Ecrire un programme qui calcule la moyenne des positifs parmi les n nombres entrés par l’utilisateur.
    Par exemple si l’utilisateur entre :
    8
    5 9-1 0 12-7-4 3
    l’ordinateur a che : 7.25*/
    Scanner s = new Scanner(System.in);
    System.out.println("Combien des nombre vous voulez entrer? ");
    int arret = s.nextInt();
    int nbr = 0;
    int somme = 0;
    int nbrPos = 0;
    double moyenne = 0;
    for (int i = 1; i <= arret; i++) {
        System.out.println("veuillez entrez le nombre " + i + "/" + arret);
        nbr = s.nextInt();
        if (nbr > 0) {
            somme += nbr;
            nbrPos++;
        }
    }
    moyenne = (double) somme / nbrPos;
    System.out.println("La moyenne est : " + moyenne);
}