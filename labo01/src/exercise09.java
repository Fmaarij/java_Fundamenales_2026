void main() {
    int a, b, c, d;

    Scanner s = new Scanner(System.in);

    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    d = s.nextInt();

    //Operation imagine a=1,b=2,c=3,d=4
    a = a + d; // 1+4 = 5
    d = a - d; // 5-4 = 1
    a = a - d; // 5-1 = 4

    b = b + c; // 2+3 = 5
    c = b - c; // 5-3 = 2
    b = b - c; // 5-2 = 3

    //affichage
    System.out.print(a);
    System.out.print(" ");
    System.out.print(b);
    System.out.print(" ");
    System.out.print(c);
    System.out.print(" ");
    System.out.println(d);

}