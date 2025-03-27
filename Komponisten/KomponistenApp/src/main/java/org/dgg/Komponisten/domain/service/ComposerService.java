package org.dgg.Komponisten.domain.service;

import org.dgg.Komponisten.domain.entity.Composer;

import java.util.List;

public interface ComposerService {
    List<Composer> findAll();
    Composer findById();
}
