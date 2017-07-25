package com.ahsanburney;

import static com.ahsanburney.ThreadColor.ANSI_RED;

/**
 * Created by Kulsum on 7/25/2017.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}

