package com.persistance;

import com.data.FelineInterface;

import java.util.List;

public interface FelineRepositoryInterface {
    public boolean save(FelineInterface feline);
    public boolean delete(FelineInterface feline);
    public boolean update(FelineInterface feline); //Find and synchronize
    public List<FelineInterface> findAll(); // Empty List
    public FelineInterface findById(Integer id); // NULL
    public FelineInterface findByName(String name); // NULL
    public FelineInterface findByRace(String race);


}
