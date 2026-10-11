void main() {
    /*Ecrire un programme qui a che l’instant immØdiatement ultØrieur l’instant prØsent. Le pro
      gramme reoit en entrØe l’heure actuelle sous forme heure et minute et a che l’heure correspon
      dant la minute suivante (pensez que une minute aprŁs 10h59 il est 11h!). Tout se passe la mŒme
      journée (supposez sans le vØri er que l’heure actuelle n’est pas 23h59!)*/
    int h = 14;
    int m = 12;

    if (m != 59) {
        if (m < 9) {
            m = m + 1;
            System.out.println(h + "h" + "0" + m);
        } else {
            m = m + 1;
            System.out.println(h + "h" + m);
        }

    } else {
        h = h + 1;
        m = 0;
        System.out.println(h + "h" + m + "0");
    }

}