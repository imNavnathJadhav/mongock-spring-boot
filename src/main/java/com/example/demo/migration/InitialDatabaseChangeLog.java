package com.example.demo.migration;

import io.mongock.api.annotations.*;

@ChangeUnit(order = "001", id = "user-seeder", author = "Navnath")
public class InitialDatabaseChangeLog {
    @BeforeExecution
    public void beforeSeedDatabase() {
        System.out.println("before seeding database...");
    }

    @RollbackBeforeExecution
    public void rollbackBeforeExecution() {
        System.out.println("rollback before seeding database...");
    }

    @Execution
    public void executionMethodName() {
        System.out.println("execution seeding database...");
    }

    @RollbackExecution
    public void rollbackExecutionMethodName() {
        System.out.println("rollback execution seeding database...");

    }
}
