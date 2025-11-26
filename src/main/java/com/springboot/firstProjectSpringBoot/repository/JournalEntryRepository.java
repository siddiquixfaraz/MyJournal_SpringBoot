package com.springboot.firstProjectSpringBoot.repository;

import com.springboot.firstProjectSpringBoot.entity.JournalEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntity , ObjectId> {
}
