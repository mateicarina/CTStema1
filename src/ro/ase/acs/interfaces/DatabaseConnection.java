package ro.ase.acs.interfaces;

import java.sql.Connection;

public interface DatabaseConnection {
    Connection createConnection();
}
