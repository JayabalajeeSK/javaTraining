package com.jb.T11OOPSAgain;
public abstract class AbstractRecipe {
    public void execute()
    {
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}