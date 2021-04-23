package com.barrier.annotation;

import com.barrier.configuration.EnableBarrierMarkerConfiguration;
import org.springframework.context.annotation.Import;

@Import(EnableBarrierMarkerConfiguration.class)
public @interface EnableBarrier {

}
