package com.ps.springdi.env.ex2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class BeanDev implements Bean {

    public BeanDev() {}

}
