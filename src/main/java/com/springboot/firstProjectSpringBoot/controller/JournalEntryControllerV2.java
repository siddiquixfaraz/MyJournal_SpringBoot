package com.springboot.firstProjectSpringBoot.controller;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import com.springboot.firstProjectSpringBoot.services.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        journalEntryService.createEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public Optional<JournalEntity> getJournalById(@PathVariable String myId){
        return journalEntryService.getById(myId);
    }

    @DeleteMapping("id/{myId}")
    public void deleteJournalById(@PathVariable String myId){
         journalEntryService.deleteById(myId);
    }

//    @PutMapping("id/{myId}")
//    public JournalEntity updateJournalById(@PathVariable Long myId, @RequestBody JournalEntity myEntry ){
//        return journalEntityMap.put(myId,myEntry);
//    }


}
