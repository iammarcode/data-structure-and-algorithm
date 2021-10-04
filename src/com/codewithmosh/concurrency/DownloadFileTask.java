package com.codewithmosh.concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread());

        for (var i = 0; i < 10000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementToTotalBytes();
        }

        System.out.println("Download Complete: " + Thread.currentThread());

    }
}
