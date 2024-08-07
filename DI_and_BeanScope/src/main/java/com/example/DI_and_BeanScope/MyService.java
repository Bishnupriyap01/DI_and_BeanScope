package com.example.DI_and_BeanScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {
//    @Autowired
    private  MyRepository myRepository;

    // Constructor-based dependency injection
//    public MyService(MyRepository myRepository) {
//        this.myRepository = myRepository;
//    }

    @Autowired
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String performService() {
        // Use myRepository here

        System.out.println("Service is using repository: " + myRepository);
        return myRepository.my_repo_method();
    }
}
