package ua.lviv.iot.algo.part1.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.algo.part1.lab4.models.WritingDesk;

@Repository
public interface WritingDeskRepository extends JpaRepository<WritingDesk, Integer> {

}
