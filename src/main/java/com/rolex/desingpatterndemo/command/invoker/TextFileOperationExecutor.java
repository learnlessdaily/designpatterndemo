package com.rolex.desingpatterndemo.command.invoker;

import com.rolex.desingpatterndemo.command.command.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations
            = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
