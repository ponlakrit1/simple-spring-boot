package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.moneyEntity;

@Repository
public interface moneyRepos extends CrudRepository<moneyEntity, Long> {

    public List<moneyEntity> findByPayType(String payType);

    @Query(	value = "select * from money m where m.amount = ?1", nativeQuery= true)
    public List<moneyEntity> findByAmount(int key);

    @Query(	value = "select * from money m where m.amount like %?1%", nativeQuery= true)
    public List<moneyEntity> findAmountByCriteria(String key);

}
