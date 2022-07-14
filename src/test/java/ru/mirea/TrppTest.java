package ru.mirea;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@MicronautTest
class TrppTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

//    @PostConstruct
//    public EmbeddedApplication<?> getApplication() {
//        System.out.println(application.getApplicationContext());
//        return application;
//    }
}
