package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseCreateTable {
    void createTable(Connection connection) throws SQLException;
}
