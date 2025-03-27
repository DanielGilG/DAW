package org.dgg.Komponisten.persistance.repository.impl;

import org.dgg.Komponisten.domain.entity.Composer;
import org.dgg.Komponisten.persistance.dao.ComposerDao;
import org.dgg.Komponisten.persistance.repository.ComposerRepository;

import java.util.List;

public class ComposerRepositoryImpl implements ComposerRepository {
    private final ComposerDao composerDao;

    public ComposerRepositoryImpl(ComposerDao composerDao){
        this.composerDao = composerDao;
    }

    @Override
    public List<Composer> findAll() {
        return composerDao.findAll();
    }

    @Override
    public Composer findById() {
        return composerDao.findById();
    }
}
