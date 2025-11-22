package com.springboot.firstProjectSpringBoot.services;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import com.springboot.firstProjectSpringBoot.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void createEntry(JournalEntity journalEntity){
        journalEntryRepository.save(journalEntity);
    }
}
