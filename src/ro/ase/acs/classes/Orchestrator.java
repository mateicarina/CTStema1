package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DatabaseConnection;
import ro.ase.acs.interfaces.DatabaseCreateTable;
import ro.ase.acs.interfaces.DatabaseInsertData;
import ro.ase.acs.interfaces.DatabaseReadData;

import java.sql.Connection;

public class Orchestrator {
    public DatabaseConnection databaseConnection;
    public DatabaseCreateTable databaseCreateTable;

    public DatabaseReadData databaseReadData;
    public DatabaseInsertData databaseInsertData;


    public Orchestrator(DatabaseConnection databaseConnection, DatabaseCreateTable databaseCreateTable, DatabaseReadData databaseReadData, DatabaseInsertData databaseInsertData) {
        this.databaseConnection = databaseConnection;
        this.databaseCreateTable = databaseCreateTable;
        this.databaseReadData = databaseReadData;
        this.databaseInsertData = databaseInsertData;
    }


    public void runWorkflow() {
        try {
            databaseConnection = new CreateConnection();
            Connection connection = databaseConnection.createConnection();
            databaseCreateTable = new CreateTable();
            databaseCreateTable.createTable(connection);

            databaseInsertData = new InsertData();
            databaseInsertData.insertData(connection);

            databaseReadData = new ReadData();
            databaseReadData.readData(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
