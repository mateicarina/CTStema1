package ro.ase.acs.main;

import ro.ase.acs.classes.CreateConnection;
import ro.ase.acs.classes.CreateTable;
import ro.ase.acs.classes.InsertData;
import ro.ase.acs.classes.ReadData;
import ro.ase.acs.interfaces.DatabaseConnection;
import ro.ase.acs.interfaces.DatabaseCreateTable;
import ro.ase.acs.interfaces.DatabaseInsertData;
import ro.ase.acs.interfaces.DatabaseReadData;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try{
            DatabaseConnection databaseConnection=new CreateConnection();
            Connection connection=databaseConnection.createConnection();
            DatabaseCreateTable createTable=new CreateTable();
            createTable.createTable(connection);

            DatabaseInsertData insertData=new InsertData();
            insertData.insertData(connection);

            DatabaseReadData readData=new ReadData();
            readData.readData(connection);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
