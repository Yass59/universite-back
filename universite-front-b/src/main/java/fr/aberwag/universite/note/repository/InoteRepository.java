package fr.aberwag.universite.note.repository;

import java.util.List;

import fr.aberwag.universite.note.domain.Note;
import fr.aberwag.universite.note.domain.NotePK;

public interface InoteRepository {

	List<Note> findAll();

	Note save(Note note);

	Note getOne(NotePK npk);

}
