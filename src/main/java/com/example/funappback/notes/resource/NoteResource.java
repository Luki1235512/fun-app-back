package com.example.funappback.notes.resource;


import com.example.funappback.notes.service.NoteService;
import com.example.funappback.notes.model.Note;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("note")
public class NoteResource {

    private final NoteService noteService;

    public NoteResource(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/test")
    public void test() {
        System.out.println("HERE");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Note>> getAllNotes() {
        List<Note> notes = noteService.findAllNotes();
        return new ResponseEntity<>(notes, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Note> addNote(@RequestBody Note note) {
        Note newNote = noteService.addNote(note);
        return new ResponseEntity<>(newNote, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNote(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
