void main() {
    /*Complétez le programme suivant afin que les valeurs affichées soient celles saisies par l’utilisateur,
            mais dans l’ordre inverse (si l’utilisateur entre 5 et 7, l’ordinateur affiche 7 et 5) :*/

    int a, b;
    Scanner scan = new Scanner(System.in);
    System.out.println("Entrer 2 valeurs entières");
    a = scan.nextInt();
    b = scan.nextInt();
// Complétez ici uniquement sans rien changer
    int temp = a;
    a = b;
    b = temp;
    System.out.print("Les voici inversées: ");
    System.out.print(a);
    System.out.print(" ");
    System.out.println(b);
}
