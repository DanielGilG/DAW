package org.dgg.Komponisten.controller.IoC;


import org.dgg.Komponisten.domain.service.ComposerService;
import org.dgg.Komponisten.domain.service.impl.ComposerServiceImpl;
import org.dgg.Komponisten.persistance.dao.ComposerDao;
import org.dgg.Komponisten.persistance.dao.impl.ComposerDaoJdbc;
import org.dgg.Komponisten.persistance.repository.ComposerRepository;
import org.dgg.Komponisten.persistance.repository.impl.ComposerRepositoryImpl;


public class ComposerIoC {
    private static ComposerService composerService;
    private static ComposerRepository composerRepository;
    private static ComposerDao composerDao;

    public static ComposerService createService(){
        if (composerService == null){
            composerService = new ComposerServiceImpl(getComposerRepository());
        }
        return composerService;
    }

    public static ComposerRepository getComposerRepository(){
        if (composerRepository == null){
            composerRepository = new ComposerRepositoryImpl(getComposerDao());
        }
        return composerRepository;
    }

    public static ComposerDao getComposerDao(){
        if (composerDao == null){
            composerDao = new ComposerDaoJdbc();
        }
        return composerDao;
    }
}
