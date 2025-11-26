package com.springboot.firstProjectSpringBoot.services;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import com.springboot.firstProjectSpringBoot.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void createEntry(JournalEntity journalEntity){
        journalEntryRepository.save(journalEntity);
    }

    public List<JournalEntity> getAll(){
       return journalEntryRepository.findAll();
    }

    public Optional<JournalEntity> getById(ObjectId id){
        return journalEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id){
         journalEntryRepository.deleteById(id);
    }

}
