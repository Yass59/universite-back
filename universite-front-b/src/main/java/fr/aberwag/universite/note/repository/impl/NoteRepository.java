package fr.aberwag.universite.note.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.aberwag.universite.note.domain.Note;
import fr.aberwag.universite.note.domain.NotePK;
import fr.aberwag.universite.note.repository.InoteRepository;
@Repository
public class NoteRepository implements InoteRepository {

	@Override
	public List<Note> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note save(Note note) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note getOne(NotePK npk) {
		// TODO Auto-generated method stub
		return null;
	}

}
