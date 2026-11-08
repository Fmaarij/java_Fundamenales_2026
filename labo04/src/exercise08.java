void main() {
    /*Ecrire un programme qui calcule la puissance de deux entiers entrés par l’utilisateur c’est--dire
    qui calcule ab de la façon suivante : a * a * a * ... * a avec b- 1 multiplications. Tenez compte
    du fait que 00 est "impossible" et que si b est nØgatif alors : ab = (1 / a)-b.*/
    Scanner s = new Scanner(System.in);
    System.out.println("Entrer le 1ere nombre :");
    int a = s.nextInt();
    System.out.println("Entrer le 2eme nombre :");
    int b = s.nextInt();
    double p = 1;

    if (a == 0 && b == 0) {
        System.out.println("Erreur la puissance de " + a + " et " + b + " n'existe pas.");
    } else if (b > 0) {
        for (int i = 1; i <= b; i++) {
            p *= a;
        }
        System.out.println("Puissance = " + p);
    } else if (b < 0) {
        for (int i = 1; i <= -b; i++) {
            p *= (1.0 / a);
        }
        System.out.println("Puissance = " + p);
    } else {
        System.out.println("Puissance = " + p);
    }

}