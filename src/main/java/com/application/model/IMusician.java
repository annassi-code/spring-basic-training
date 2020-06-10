package com.application.model;

import com.application.annotation.MyAnnotation;

public interface IMusician {

    @MyAnnotation
    void play();
}
