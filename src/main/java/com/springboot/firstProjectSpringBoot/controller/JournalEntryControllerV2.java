package com.springboot.firstProjectSpringBoot.controller;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import com.springboot.firstProjectSpringBoot.services.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
     private JournalEntryService journalEntryService;

//    @GetMapping
//    public List<JournalEntity> getAll(){
//        return new ArrayList<>(journalEntityMap.values());
//    }
//
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity myEntry){
        journalEntryService.createEntry(myEntry);
        return true;
    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntity getJournalById(@PathVariable Long myId){
//        return journalEntityMap.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public void deleteJournalById(@PathVariable Long myId){
//         journalEntityMap.remove(myId);
//    }
//
//    @PutMapping("id/{myId}")
//    public JournalEntity updateJournalById(@PathVariable Long myId, @RequestBody JournalEntity myEntry ){
//        return journalEntityMap.put(myId,myEntry);
//    }


}
