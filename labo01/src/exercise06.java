void main() {
    /* Ecrire un programme qui affiche la moyenne des deux valeurs numériques saisies par l’utilisateur */
    int a, b;

    Scanner s = new Scanner(System.in);

    a = s.nextInt();
    b = s.nextInt();

    double moyenne = (a+b)/2.0;

    System.out.printf("La moyenne de "+ a+ " et " +b + " = "+ moyenne+".");

}