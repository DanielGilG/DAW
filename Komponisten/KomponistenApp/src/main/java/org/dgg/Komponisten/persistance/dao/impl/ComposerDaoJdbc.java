package org.dgg.Komponisten.persistance.dao.impl;

import org.dgg.Komponisten.domain.entity.Composer;
import org.dgg.Komponisten.persistance.dao.ComposerDao;
import java.sql.*;

import java.util.List;

public class ComposerDaoJdbc implements ComposerDao{

    private final DatabaseConnection databaseConnection;
    @Override
    public List<Composer> findAll() {
        return List.of();
    }

    @Override
    public Composer findById() {
        return null;
    }
}
