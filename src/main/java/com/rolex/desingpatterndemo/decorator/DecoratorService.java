package com.rolex.desingpatterndemo.decorator;

import com.rolex.desingpatterndemo.decorator.dsdecorator.CompressionDecorator;
import com.rolex.desingpatterndemo.decorator.dsdecorator.DataSourceDecorator;
import com.rolex.desingpatterndemo.decorator.dsdecorator.EncryptionDecorator;
import org.springframework.stereotype.Service;

@Service
public class DecoratorService {

    public String getData(String fileName){

        fileName = "OutputDemo.txt";

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(fileName)));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(fileName);

        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());

        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

        return plain.readData();
    }

    public String decodeDate(String fileName){
        fileName = "OutputDemo.txt";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(fileName)));

        return encoded.readData();
    }
}
