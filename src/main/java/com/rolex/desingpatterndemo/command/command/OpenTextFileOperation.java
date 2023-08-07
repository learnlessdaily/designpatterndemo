package com.rolex.desingpatterndemo.command.command;

import com.rolex.desingpatterndemo.command.receiver.TextFile;

public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    // constructors

    @Override
    public String execute() {
        return textFile.open();
    }
}
