package org.kamil;

import org.springframework.stereotype.Component;

@Component
public class AppleCpu implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("Apple best fastest CPU");
    }
}
