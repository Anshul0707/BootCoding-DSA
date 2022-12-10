package com.bootcoding.oops.Abstraction;


    abstract class Animal
    {

        public abstract void animalSound();
        public void sleep()
        {
            System.out.println("sleepppppppppppppppz");
        }
    }

    class Pig extends Animal
    {
        public void animalSound()
        {
            System.out.println("pig sound..");
        }
    }
