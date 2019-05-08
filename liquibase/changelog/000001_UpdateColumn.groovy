package config.liquibase.changelog

databaseChangeLog {
    changeSet(id: '1557075556109-1', author: 'sthalluri') {
        addColumn(tableName: 'input_file') {
            column(name: 'source', type: 'VARCHAR(45)')
        }
    }
}
