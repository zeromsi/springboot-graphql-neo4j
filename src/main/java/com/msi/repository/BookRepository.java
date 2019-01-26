package com.msi.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msi.node.Book;

public interface BookRepository extends Neo4jRepository<Book, Integer> {

	Book findByName(String name);

}