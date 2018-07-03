package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {

    @Override
    Optional<Item> findById(Integer id);

    @Override
    Item save(Item product);
}
