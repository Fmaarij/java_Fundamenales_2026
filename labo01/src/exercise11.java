void main() {
    /* ) Ecrire un programme qui réalise une permutation cyclique vers la gauche des valeurs de quatre
         variables. 1 2 3 4 devient 2 3 4 1. */

    int a, b, c, d, temp;
    Scanner s = new Scanner(System.in);

    a = s.nextInt(); //1
    b = s.nextInt(); //2
    c = s.nextInt(); //3
    d = s.nextInt(); //4

    //operation
    temp = a; //1
    a = b ; //2
    b = c; //3
    c = d; //4
    d = temp; //1

    System.out.print(a);
    System.out.print(" ");
    System.out.print(b);
    System.out.print(" ");
    System.out.print(c);
    System.out.print(" ");
    System.out.println(d);

}