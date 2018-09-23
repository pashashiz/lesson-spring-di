package com.ps.springdi.context.ex4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(OtherConfig.class)
public class RootConfig {}
