void main() {
    /*Aficher le signe du produit de deux entiers sans faire la multiplication (en faisant uniquement
       des comparaisons). Par exemple le produit de 5 et de-7 donne un résultat négatif*/
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();

    if ((a > 0 && b < 0) || (a < 0 && b > 0)) { //négatif
        System.out.println("Le signe de produit de " + a + " et " + b + " = '-'.");
    } else if ((a > 0 && b > 0) || (a < 0 && b < 0)) {//positif
        System.out.println("Le signe de produit de " + a + " et " + b + " = '+'.");
    } else {
        System.out.println("Le signe de produit de " + a + " et " + b + " = '0'.");
    }

}
