package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.cg.model.Event;
@Repository

public interface EventRepository extends JpaRepository<Event,Long> {

	public   List<Event> findByName(String name);
}
