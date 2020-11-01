package com.belogrudov.javabot.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsTable extends JpaRepository<Question, Integer> {
}
