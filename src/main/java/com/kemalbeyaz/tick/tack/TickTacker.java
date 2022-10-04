package com.kemalbeyaz.tick.tack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TickTacker {

    private static final Logger LOG = LoggerFactory.getLogger("TickTack");

    public static void main(String[] args) throws InterruptedException {
        boolean isTick = false;
        while (true) {
            if (isTick) {
                LOG.info("Tick!");
                isTick = false;
            } else {
                LOG.info("Tack!");
                isTick = true;
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }
}