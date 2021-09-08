package com.example.funappback.notes.repo;

import com.example.funappback.notes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note, Long> {

    void deleteNoteById(Long id);

}
