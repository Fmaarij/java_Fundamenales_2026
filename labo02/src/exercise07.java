void main() {
    /*Mettre un commentaire pour chacune des lignes du programme suivant pour indiquer, si possible,
    la valeur de toutes les variables.*/
    int a, b, c;
    boolean test1, test2, test3, arret;
    a = 2;
    b = 3;
    c = 4;
    test1 = true;

    test2 = (b >= a) && (c >= b); // (3>=2) et (4>=3) -> test2 = true
    test3 = test1 || test2; //true ou true -> test3 = true
    arret = test3 && (!test2); //true et false -> arret = false

    a += 1; //2+1 -> a=3
    b -= 1; //3-1 -> b=2
    c -= 2; //4-2 -> c=2
    test1 = true;

    test2 = (b >= a) && (c >= b); //2>=3 et 2>=2 -> test2 = false
    test3 = test1 || test2; //true ou false -> test3 = true
    arret = arret || test2; // false ou false -> false
}