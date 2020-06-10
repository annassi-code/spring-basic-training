package com.application.model;

import com.application.annotation.MyAnnotation;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument{
    @Override
    public String toString() {
        return "Guitar{}";
    }

    @MyAnnotation
    public void tune(){
        System.out.println("Guitar tuned!");
    }
}
