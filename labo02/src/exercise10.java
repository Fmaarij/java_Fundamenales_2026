void main() {
    /*Ecrire un programme qui reoit 3 nombres en entrée et qui les aficher dans l’ordre croissant.*/
    Scanner s = new Scanner(System.in);
    System.out.println("1ere nombre svp : ");
    int a = s.nextInt();
    System.out.println("2ieme nombre svp : ");
    int b = s.nextInt();
    System.out.println("3ieme nombre svp : ");
    int c = s.nextInt();
    int temp;
    //a=3,b=2;c=1
    if (a > b) {//3>2
        temp = a;//temp=3
        a = b;//a=2
        b = temp;    //b=3
        //a=2
        //b=3
    }
    if (b > c) {//3>1
        temp = b;//temp=3
        b = c;//b=1
        c = temp;//c=3
        //a=2
        //b=1
        //c=2
    }
    if (a > b) {
        temp = a;//2;
        a = b;//a=1;
        b = temp;//b=2;
        //a=1
        //b=2
        //c=3
    }

    System.out.println(a + " " + b + " " + c);
}