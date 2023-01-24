package com.adriaanbf04.tema07.UtillsAdri;;

public class MsgType {
    public static void debug(String clase, String message) {
        System.out.printf(" \u001B[1;32m D:[%s]: %s \u001B[0m", clase, message);
    }

    public static void mistake(String clase, String message) {
        System.out.printf(" \u001B[1;31m E:[%s]: %s \u001B[0m", clase, message);
    }

    public static void info(String clase, String message) {
        System.out.printf("\u001B[1;34m I:[%s]: %s \u001B[0m", clase, message);
    }

    public static void warn(String clase, String message) {
        System.out.printf("\u001B[1;33m W:[%s]: %s \u001B[0m", clase, message);
    }
}
