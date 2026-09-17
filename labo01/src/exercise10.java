void main() {
    /* Ecrire un programme qui réalise une permutation cyclique vers la droite des valeurs de quatre variables.
     L’effet d’une telle permutation est le suivant : si au départ les quatre variables possédaient,
     par exemple, les valeurs 1 2 3 4, à la fin, ces mêmes variables possèderaient respectivement les
     valeurs 4 1 2 3. */

    int a, b, c, d, temp;

    Scanner s = new Scanner(System.in);

    a = s.nextInt(); //1
    b = s.nextInt(); //2
    c = s.nextInt(); //3
    d = s.nextInt(); //4

    //operation
    temp = a; //1
    a = d; //4
    d = c; //3
    c = b; //2
    b = temp; //1
    System.out.print(a);
    System.out.print(" ");
    System.out.print(b);
    System.out.print(" ");
    System.out.print(c);
    System.out.print(" ");
    System.out.println(d);
}