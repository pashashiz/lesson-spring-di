package com.ps.springdi.env.ex2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class BeanProd implements Bean {

    public BeanProd() {}

}
