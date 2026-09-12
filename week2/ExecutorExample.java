import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {

            int taskNumber = i;

            executor.submit(() -> {

                String threadName =
                        Thread.currentThread().getName();

                System.out.println(
                        "Task " + taskNumber
                        + " is running on "
                        + threadName
                );

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                        "Task " + taskNumber + " finished."
                );
            });
        }

        executor.shutdown();

        try {

            if (executor.awaitTermination(
                    10,
                    TimeUnit.SECONDS
            )) {

                System.out.println(
                        "All tasks completed."
                );

            } else {

                System.out.println(
                        "Some tasks are still running."
                );
            }

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println(
                    "Main thread was interrupted."
            );
        }
    }
}