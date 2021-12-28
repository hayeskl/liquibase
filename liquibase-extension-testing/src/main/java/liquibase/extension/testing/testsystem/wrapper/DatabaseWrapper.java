package liquibase.extension.testing.testsystem.wrapper;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DatabaseWrapper {

    public abstract void start(boolean keepRunning) throws Exception;

    public abstract Connection openConnection() throws SQLException;

    public abstract String getUsername();

    public abstract String getUrl();

}
