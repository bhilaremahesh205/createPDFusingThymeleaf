package com.example.createpdfusingthymeleaf;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreatepdfusingthymeleafApplication {

    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        SpringApplication.run(CreatepdfusingthymeleafApplication.class, String.valueOf(args));
    }

}
