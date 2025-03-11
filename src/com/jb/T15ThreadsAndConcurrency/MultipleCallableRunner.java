package com.jb.T15ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("Study With JB"),
                new CallableTask("Jaya"),
                new CallableTask("Bala"));
        List<Future<String>> welcomeAll = executorService.invokeAll(tasks);
        for (Future<String> welcomeFuture : welcomeAll) {
            System.out.println(welcomeFuture.get());
        }
        executorService.shutdown();
    }
}
// Hello Study With JB
// Hello Jaya
// Hello Bala