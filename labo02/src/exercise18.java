void main() {
    /*Afficher le signe de la somme de deux entiers sans faire l’addition (en faisant uniquement des
      comparaisons et des négations changements de signe). Par exemple si on somme 5 et-7, la réponse
      est négative.*/
    Scanner s = new Scanner(System.in);
    System.out.println("Veuillez entrez 2 chiffre");
    int a = s.nextInt();
    int b = s.nextInt();

    //opération et affichage
    if (a > -b) {
        System.out.println("Le signe de la somme de " + a + " et " + b + " = '+'.");
    } else if (a < -b) {
        System.out.println("Le signe de la somme de " + a + " et " + b + " = '-'.");
    } else {
        System.out.println("Le signe de la somme de " + a + " et " + b + " = '0'.");
    }

}