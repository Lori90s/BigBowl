package com.bigbowl.bigbowl.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

    Item findById(long id);
}
