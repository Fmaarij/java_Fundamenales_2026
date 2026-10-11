void main() {
    /*  Ecrire un programme qui reçoit 3 nombres en entrée et qui les affichent dans l'ordre croissant.ex:1,2,3 */

    int a = 35;
    int b = 266;
    int c = 1;
    int temp = 0;

    //operation et affichage
    if (a > b) {//petit est b -> a = b
        temp = a;
        a = b;
        b = temp;
    }
    if (b > c) {//petit est c -> b = c
        temp = b;
        b = c;
        c = temp;
    }
    //on a trouvé a et b mnt il faut revoir si a est plus grand que b
    if (a > b) {//petit est b -> a = b
    temp = a;
    a = b;
    b = temp;
    }
    System.out.println(a + " " + b + " " + c);

}