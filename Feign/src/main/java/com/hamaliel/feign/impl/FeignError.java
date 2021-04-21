package com.hamaliel.feign.impl;

import com.hamaliel.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String port() {
        return "ops...";
    }
}
