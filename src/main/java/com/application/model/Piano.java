package com.application.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Piano implements IInstrument {
    @Override
    public String toString() {
        return "Piano{}";
    }
}
