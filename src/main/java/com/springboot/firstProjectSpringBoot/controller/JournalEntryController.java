package com.springboot.firstProjectSpringBoot.controller;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntity> journalEntityMap = new HashMap<>();

    @GetMapping
    public List<JournalEntity> getAll(){
        return new ArrayList<>(journalEntityMap.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity myEntry){
        journalEntityMap.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntity getJournalById(@PathVariable Long myId){
        return journalEntityMap.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public void deleteJournalById(@PathVariable Long myId){
         journalEntityMap.remove(myId);
    }

    @PutMapping("id/{myId}")
    public JournalEntity updateJournalById(@PathVariable Long myId, @RequestBody JournalEntity myEntry ){
        return journalEntityMap.put(myId,myEntry);
    }


}
