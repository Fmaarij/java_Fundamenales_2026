void main() {
    /*Ecrire un programme qui affiche un message donnant l’ordre relatif de deux nombres sous la forme :
        Le premier est plus grand que le deuxième
        Les deux nombres sont égaux
        Le premier est plus petit que le deuxième
    */
    Scanner s = new Scanner(System.in);
    System.out.println("Veuillez entrer le 1er nombre: ");
    int nbr1 = s.nextInt();
    System.out.println("Veuillez entrer le 2ieme nombre: ");
    int nbr2 = s.nextInt();

    //operation && affichage
    if (nbr1 > nbr2) {
        System.out.println("Le premier est plus grand que le deuxième. " + nbr1 + " > " + nbr2);
    } else if (nbr1 == nbr2) {
        System.out.println("Les deux nombres sont égaux. " + nbr1 + " = " + nbr2);
    } else {
        System.out.println("Le premier est plus petit que le deuxième. " + nbr1 + " < " + nbr2);
    }

}