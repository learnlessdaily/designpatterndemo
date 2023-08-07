package com.rolex.desingpatterndemo.command.command;

import com.rolex.desingpatterndemo.command.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation {

    // same field and constructor as above
    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}

