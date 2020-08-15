package com.yichen.springcloudfeignapi.api;

import org.springframework.stereotype.Component;

@Component
public class ProvideApiFallback implements ProvideApi {
    @Override
    public Object getPersonList() {
        return "getPersonList服务端降级处理";
    }

    @Override
    public String getPoint() {
        return "getPoint服务降级处理";
    }
}
