void main() {
    /* Ecrire un programme qui inverse l’ordre des valeurs de 3 variables entières. Si, au départ les
       variables ont les valeurs 1 2 3, elles auront les valeurs 3 2 1. */

    int a = 1, b = 2, c = 3, temp;
//    temp = a; //1
//    a = c; //3
//    c = temp; //1


    //avec calcul
    a = a + c; //1 + 3 = 4
    c = a - c; //4 - 2 = 1
    a = a - c; //4 - 1 = 2


    System.out.print(a);
    System.out.print(" ");
    System.out.print(b);
    System.out.print(" ");
    System.out.println(c);
}