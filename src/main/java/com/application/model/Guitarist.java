package com.application.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("guitarist")
public class Guitarist implements IMusician {

    @Autowired
    @Qualifier("guitar")
    private IInstrument instrument;

    public Guitarist() {
    }

    public IInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    public void play() {
      //  ((Guitar)instrument).tune();
        System.out.println(instrument.toString());
    }

}
