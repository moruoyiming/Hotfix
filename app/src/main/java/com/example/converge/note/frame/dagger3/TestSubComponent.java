package com.example.converge.note.frame.dagger3;

import dagger.Subcomponent;

@Subcomponent(modules = { TestSubModule.class})
public interface TestSubComponent {

    void injectDaggerActivity(DaggerActivity daggerActivity);

}
