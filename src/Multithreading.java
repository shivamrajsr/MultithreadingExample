public class Multithreading {
    public static void main(String[] args) {

        System.out.println("Multithreading example!!");
        // more about multithreading in readme file
        PrintNames thread1 = new PrintNames(1);
        // only one thread then below
        // thread1.start();

        PrintNames thread2 = new PrintNames(2);
        PrintNames thread3 = new PrintNames(3);

        // below will make 3 threads run at the same time

        thread1.start();
        thread2.start();
        thread3.start();

    }
}