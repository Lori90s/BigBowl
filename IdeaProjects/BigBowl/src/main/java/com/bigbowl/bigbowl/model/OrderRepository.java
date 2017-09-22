package com.bigbowl.bigbowl.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;



public interface OrderRepository extends CrudRepository<Order, Long>{

    Order findById(long id);
    List<Order> findAllBy();
}
