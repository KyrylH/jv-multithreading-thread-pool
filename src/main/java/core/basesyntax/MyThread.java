package core.basesyntax;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private static final String MESSAGE = "Task duration was %2s ms, execution finished at %2s";
    @Override
    public String call() throws InterruptedException {
        return MESSAGE.formatted(new Random().nextInt(5) * 100 + 100, LocalDateTime.now());
    }
}
