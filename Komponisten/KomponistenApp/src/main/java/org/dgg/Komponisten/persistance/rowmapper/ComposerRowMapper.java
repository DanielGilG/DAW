package org.dgg.Komponisten.persistance.rowmapper;

import org.dgg.Komponisten.domain.entity.Composer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComposerRowMapper {
    public Composer mapRow(ResultSet rs) throws SQLException{
        return new Composer(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("country")
        );
    }
}
