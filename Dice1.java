class Dice1{
    public static void main(String[] args){
<<<<<<< HEAD
=======

        System.out.println("What is your name?");
        String s = new java.util.Scanner(System.in).nextLine()
        System.out.println("Hello," + s + "!");
>>>>>>> experimental
        int r1 = new java.util.Random().nextInt(6) + 1;
        int r2 = new java.util.Random().nextInt(6) + 1;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + r1);
        System.out.println("Die 1: " + r2);
        System.out.println("Total value: " + (r1+r2));
<<<<<<< HEAD

        if(r1+r2>7){
            System.out.println(s + " won!");
        }else{
            System.out.println(s + " lost");
        }
=======
>>>>>>> experimental
    }
}