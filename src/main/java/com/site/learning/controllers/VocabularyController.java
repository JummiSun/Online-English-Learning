package com.site.learning.controllers;

import com.site.learning.models.Word;
import com.site.learning.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vocabulary")
public class VocabularyController {

    @Autowired
    private WordService wordService;

    @GetMapping("/topics")
    public String showTopics(Model model) {
        List<String> topics = wordService.getAllTopics();
        model.addAttribute("topics", topics);
        return "vocabulary/topics";
    }

    @GetMapping("/words/{topic}")
    public String showWordsByTopic(@PathVariable String topic, Model model) {
        List<Word> words = wordService.getWordsByTopic(topic);
        model.addAttribute("words", words);
        return "vocabulary/words";
    }


}

