package com.jnjnetwork.CUHelper.service;

import com.jnjnetwork.CUHelper.domain.Book;
import com.jnjnetwork.CUHelper.domain.Question;

public interface QuestionService {
    Question findById(Long id);
    Question findByBookId(Long book_id);
    void add(Question question);
    void deleteById(Long id);
    void edit(Long id, Book book, String content);
}
