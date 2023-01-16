package com.alan.dal;

public final class TerminalFactory {
    public static Repository getTerminal() {
        return Terminal.getInstance();
    }
}
