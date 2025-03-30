package org.dgg.Komponisten.persistance.dao.impl;

import org.dgg.Komponisten.domain.entity.Composer;
import org.dgg.Komponisten.persistance.dao.ComposerDao;
import org.dgg.Komponisten.persistance.database.DatabaseConnection;
import org.dgg.Komponisten.persistance.rowmapper.ComposerRowMapper;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class ComposerDaoJdbc implements ComposerDao{
    protected DatabaseConnection databaseConnection;
    protected ComposerRowMapper composerRowMapper;

    public ComposerDaoJdbc(){
        this.databaseConnection = DatabaseConnection.getInstance();
        this.composerRowMapper = new ComposerRowMapper();
    }

    @Override
    public Composer findById() {
        return null;
    }

    @Override
    public List<Composer> findAll() {
        List<Composer> composers = new ArrayList<>();

        Statement statement;
        ResultSet resultSet;

        try {
            statement = databaseConnection.connectionMySQL().createStatement();
            resultSet = statement.executeQuery("select * from composer;");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                //String country = resultSet.getString("country");
                Composer composer = new Composer(id, name);
                composers.add(composer);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return composers;
    }
}
