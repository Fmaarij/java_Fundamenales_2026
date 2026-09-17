void main() {
    int a, b;//a = 3 , b = 5;

    Scanner s = new Scanner(System.in);

    a = s.nextInt();
    b = s.nextInt();

    //Avec variable temp
    int temp = a;
    a = b;
    b = temp;

//Sans variable temp
//    a = a + b; // 3+5 = 8
//    b = a - b; // 8-5 = 3
//    a = a - b; // 8-3 = 5

    System.out.print(a);
    System.out.print(" ");
    System.out.println(b);
}