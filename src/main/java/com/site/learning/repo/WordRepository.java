package com.site.learning.repo;

import com.site.learning.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findByTopic(String topic);

    @Query("SELECT DISTINCT w.topic FROM Word w")
    List<String> findAllTopics();
}
