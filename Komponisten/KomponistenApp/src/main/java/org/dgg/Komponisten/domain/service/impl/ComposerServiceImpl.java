package org.dgg.Komponisten.domain.service.impl;

import org.dgg.Komponisten.domain.entity.Composer;
import org.dgg.Komponisten.domain.service.ComposerService;
import org.dgg.Komponisten.persistance.repository.ComposerRepository;

import java.util.List;

public class ComposerServiceImpl implements ComposerService {
    private final ComposerRepository composerRepository;

    public ComposerServiceImpl(ComposerRepository composerRepository){
        this.composerRepository = composerRepository;
    }

    @Override
    public List<Composer> findAll() {
        return composerRepository.findAll();
    }

    @Override
    public Composer findById() {
        return composerRepository.findById();
    }
}
