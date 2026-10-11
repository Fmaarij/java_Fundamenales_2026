void main() {
    /*Afficher le signe de la somme de deux entiers sans faire l’addition (en faisant uniquement des
      comparaisons et des négations changements de signe). Par exemple si on somme 5 et-7, la réponse
      est négative.*/
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();

    //opération et affichage
    if (a > 0 && b > 0) {
        System.out.println("Le signe de la somme de " + a + " et " + b + " = '+'.");
        System.out.println(a + b);
    } else if ((a > 0 && b < 0) && (a > b) || a < 0 && b < 0) {
        System.out.println("Le signe de la somme de " + a + " et " + b + " = '-'.");
        System.out.println(a + b);
    } else {
        System.out.println("Le signe de la somme de " + a + " et " + b + " = '0'.");
        System.out.println(a + b);
    }

}