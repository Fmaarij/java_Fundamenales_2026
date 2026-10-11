void main() {
    /*Ecrire un programme qui a che si oui ou non une annØe entrØe par l’utilisateur est bissextile.
      Pour rappel, sont bissextiles les annØes divisibles par 4 mais non divisibles par 100 ou les annØes
      divisibles par 400. Ainsi, 2000 et 2008 sont des annØes bissextiles mais 1900 ne l’est pas.*/

    Scanner s = new Scanner(System.in);
    int y = s.nextInt();
    //opération et affichage
    if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
        System.out.println(y + " est une année bissextile.");
    } else {
        System.out.println(y + " n'est pas une année bissextile.");
    }
}