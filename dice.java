class dice{
    public static void main(String[] args){
        int r1 = new java.util.Random().nextInt(6) + 1;
        int r2 = new java.util.Random().nextInt(6) + 1;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + r1);
        System.out.println("Die 1: " + r2);
        System.out.println("Total value: " + (r1+r2));
    }
}