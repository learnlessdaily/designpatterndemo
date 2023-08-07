package com.rolex.desingpatterndemo.command.client;

import com.rolex.desingpatterndemo.command.command.OpenTextFileOperation;
import com.rolex.desingpatterndemo.command.command.SaveTextFileOperation;
import com.rolex.desingpatterndemo.command.invoker.TextFileOperationExecutor;
import com.rolex.desingpatterndemo.command.receiver.TextFile;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    public String get(){
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        String cmdOne = textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt")));
        String cmdTwo =textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.txt")));
        return "\n" + cmdOne + ", \n" + cmdTwo;
    }
}
