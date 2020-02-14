package com.main;

import com.data.Cat;
import com.data.FelineInterface;
import com.persistance.FelineRepository;
import com.persistance.FelineRepositoryInterface;


public class TestApplication {

    public static void main(String[] args) throws CloneNotSupportedException {

        FelineRepositoryInterface fr = new FelineRepository();

        Cat originalCat = new Cat("Kisa", "random", 12, 12);
        FelineInterface clonedCat = (FelineInterface) originalCat.clone();
        System.out.println("Original Cat:  " + originalCat);
        System.out.println("Cloned cat: " + clonedCat);


    }

}
