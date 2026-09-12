public class MultithreadingExample {

    public static void main(String[] args) {

        Thread task1 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        "Task 1: " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });


        Thread task2 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        "Task 2: " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });


        System.out.println("Starting tasks...");

        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks finished.");
    }
}