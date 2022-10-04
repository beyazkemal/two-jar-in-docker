package com.kemalbeyaz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class LinuxServiceRunsOnce {

    private static final Logger LOG = LoggerFactory.getLogger("SuperService");

    public static void main(String[] args) throws InterruptedException {
        LOG.info("Hey! I started working now...");
        TimeUnit.SECONDS.sleep(3);
        LOG.info("Now I'm finished.");
    }
}
