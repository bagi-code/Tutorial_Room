package com.bagicode.tutorialroom.ui.insert;

import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.bagicode.tutorialroom.data.Note;
import com.bagicode.tutorialroom.data.NoteRepository;

public class NoteUDViewModel extends ViewModel {

    private NoteRepository mNoteRepository;

    public NoteUDViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }

    public void insert(Note note) {
        mNoteRepository.insert(note);
    }

    public void update(Note note) {
        mNoteRepository.update(note);
    }

    public void delete(Note note) {
        mNoteRepository.delete(note);
    }

}
