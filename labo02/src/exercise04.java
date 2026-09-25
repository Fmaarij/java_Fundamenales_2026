void main() {
    /*Ecrire un programme qui recoit 2 nombres, qui soustrait le plus petit au plus grand et qui a affiche
    le résultat.*/

    Scanner s = new Scanner(System.in);
    System.out.println("Veuillez entrer le 1er nombre: ");
    int nbr1 = s.nextInt();
    System.out.println("Veuillez entrer le 2ieme nombre: ");
    int nbr2 = s.nextInt();
    int resSoustration;
    //Operation
    if (nbr1 > nbr2) {
        resSoustration = nbr1 - nbr2;
    } else {
        resSoustration = nbr2 - nbr1;
    }
    //affichage
    System.out.println(resSoustration);
}