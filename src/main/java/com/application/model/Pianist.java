package com.application.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pianist implements IMusician {

    @Autowired
    @Qualifier("piano")
    private IInstrument instrument;

    public IInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        System.out.println(instrument.toString());
    }
}
