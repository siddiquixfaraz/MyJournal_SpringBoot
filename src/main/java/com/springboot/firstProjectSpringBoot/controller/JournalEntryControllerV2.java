package com.springboot.firstProjectSpringBoot.controller;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import com.springboot.firstProjectSpringBoot.services.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
     private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntity> getAll(){
       return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.createEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public Optional<JournalEntity> getJournalById(@PathVariable ObjectId myId){
        return journalEntryService.getById(myId);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalById(@PathVariable ObjectId myId){
         journalEntryService.deleteById(myId);
         return true;
    }

    @PutMapping("id/{myId}")
    public JournalEntity updateJournalById(@PathVariable ObjectId myId, @RequestBody JournalEntity myEntry ){
        JournalEntity old = journalEntryService.getById(myId).orElse(null);
        if( old != null ){
            old.setTitle(myEntry.);
            old.setContent();
        }
    }


}
