package com.site.learning.services;

import com.site.learning.models.Word;
import com.site.learning.repo.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    private WordRepository wordRepository;

    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }

    public List<String> getAllTopics() {
        return wordRepository.findAllTopics();
    }

    public List<Word> getWordsByTopic(String topic) {
        return wordRepository.findByTopic(topic);
    }

}
