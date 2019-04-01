package com.hjh.test.thrift.demo;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService.Iface {
    @Override
    public String greet(String para) throws TException {
        return String.format("Hello %s!", para);
    }
}