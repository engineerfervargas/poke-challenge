package mx.com.bankaya.poke.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.bankaya.poke.challenge.entity.Event;

@Repository
public interface EventRepository  extends JpaRepository<Event, Integer>{

}
