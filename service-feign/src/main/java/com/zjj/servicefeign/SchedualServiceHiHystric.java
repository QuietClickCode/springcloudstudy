package com.zjj.servicefeign;

import org.springframework.stereotype.Component;

/**
 * 熔断

 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
    @Override
    public String uploadToHadoop() {
        return "sorry,uploadToHadoop is fail " ;
    }
}

