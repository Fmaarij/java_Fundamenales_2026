void main() {
    // Que fait le programme suivant ? Essayez avec les valeurs 5 et 7.
    int a, b;
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    b = scan.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.print(a);
    System.out.print(" ");
    System.out.println(b);
}