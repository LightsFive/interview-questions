package com.sample;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static SingletonClass createObject() {

        if (singletonClass == null) {

            synchronized (SingletonClass.class) {

                if (singletonClass == null) {

                    singletonClass = new SingletonClass();

                    return singletonClass;
                }
            }
        }

        return singletonClass;
    }
}
