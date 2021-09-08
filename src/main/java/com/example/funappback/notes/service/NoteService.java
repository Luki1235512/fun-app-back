package com.example.funappback.notes.service;
import com.example.funappback.notes.model.Note;
import com.example.funappback.notes.repo.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private final NoteRepo noteRepo;

    public NoteService(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    public Note addNote(Note note) {
        return noteRepo.save(note);
    }

    public List<Note> findAllNotes() {
        return noteRepo.findAll();
    }

    public void deleteNote(Long id) {
        noteRepo.deleteNoteById(id);
    }






}
