void main() {
    /* Ecrire un programme qui calcule le maximum de trois nombres. */
    int a = 30;
    int b = 12;
    int c = 180;
    int max = a;

    //analyse
    //pourque a soit le max,  il faut que a > b et a>c
    //pourque b soit le max,  il faut que a<b et b>c
    //pourque c soit le max,  il faut que c>b et c>a

    //operation et affichage
    if (a > b && a > c) {
        max = a;
    } else if (a < b && b > c) {
        max = b;
    } else if (c > b && c > a) {
        max = c;
    }
    System.out.println(max);
}