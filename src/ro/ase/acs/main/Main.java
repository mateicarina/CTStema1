package ro.ase.acs.main;

import ro.ase.acs.classes.*;



public class Main {
    public static void main(String[] args) {
        Orchestrator orchestrator=new Orchestrator(
                new CreateConnection(),
                new CreateTable(),
                new ReadData(),
                new InsertData()
        );
        orchestrator.runWorkflow();
    }
}
