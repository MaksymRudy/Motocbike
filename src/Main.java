public class Main {
    public static void main(String[] args)
    {
        Motorbike Kawabungo1 = new Motorbike();
        Motorbike Kawabungo2 = new Motorbike();

        System.out.println(Kawabungo1.getAge());
        System.out.println(Kawabungo1.calculateIndex());
        System.out.println(Kawabungo2.power);
        System.out.println(Kawabungo2.upgradePower(12));
        System.out.println(Kawabungo2.calculateIndex());
    }
}