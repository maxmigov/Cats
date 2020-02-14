package com.persistance;

import com.data.Cat;
import com.data.FelineInterface;

import java.util.ArrayList;
import java.util.List;

    public class FelineRepository implements FelineRepositoryInterface {

        // STORAGE
        public List<FelineInterface> felines; // NULL

        //constructor
        public FelineRepository() {
            felines = new ArrayList<>();
        }


        @Override
        public boolean save(FelineInterface feline) {
// TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean delete(FelineInterface feline) {
// TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean update(FelineInterface feline) {
// TODO Auto-generated method stub
            return false;
        }

        @Override
        public List<FelineInterface> findAll() {
// TODO Auto-generated method stub
            return felines;
        }

        @Override
        public FelineInterface findById(Integer id) {
            for (FelineInterface f : felines) {
                if (f.getId() == id) {
                    return f;
                }
            }
            return null;
        }

        @Override
        public FelineInterface findByName(String name) {
            for (FelineInterface f : felines) {
                if (f.getName() == name) {
                    return f;
                }
            }
            return null;
        }

        @Override
        public FelineInterface findByRace(String race) {
            for (FelineInterface f : felines) {
                if (f.getRace() == race) {
                    return f;
                }
            }
            return null;
        }


        //ONLY FOR TESTING
        //FILL THE LIST WITH DATA
        public void generate() {
            felines.add(new Cat("Kisa", "Siam", 10, 1));
            felines.add(new Cat("Murka", "Regdoll", 5, 2));
            felines.add(new Cat("Masha", "Regdoll", 7, 3));
        }
    }

