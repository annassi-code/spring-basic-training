package com.application.model;

import com.application.model.IInstrument;
import org.springframework.stereotype.Component;

@Component
public class Ukelele implements IInstrument {
    @Override
    public String toString() {
        return "Ukelele{}";
    }
}
