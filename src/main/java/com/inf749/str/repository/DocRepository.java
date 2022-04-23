package com.inf749.str.repository;

import com.inf749.str.domain.Doc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocRepository extends MongoRepository<Doc, String> {
    Doc findByName(String name);
}
