package com.example.DI_and_BeanScope;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String my_repo_method() {
        return "Hello";
    }
}