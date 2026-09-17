void main() {
    /*  Ecrire un programme qui affiche la somme des deux entiers saisis par l’utilisateur. */

    int a, b;
    int somme;

    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    b = s.nextInt();

    somme = a + b;

    System.out.println("la somme de " + a + " et " + b + " = " + somme + ".");

}