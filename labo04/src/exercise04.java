void main(String[] args) {
    /* Ecrire un programme qui détermine le minimum d’une série de n nombres entiers entrés par l’utilisateur.
     Par exemple si l’utilisateur entre :
8
5 9-1 0 12-7-4 3
l’ordinateur affiche :-7*/

    Scanner s = new Scanner(System.in);

    System.out.println("Combien des nombre vous voulez entrer? ");
    int arret = s.nextInt();
    int nbr = 0;
    int min = 0;

    for (int i = 1; i <= arret; i++) {
        System.out.println("veuillez entrez le nombre " + i + "/" + arret);
        nbr = s.nextInt();

        if (i==1) {
            min = nbr;
        } else if(nbr < min) {
            min = nbr;
        }
    }


    System.out.println("minimun = " + min);
}