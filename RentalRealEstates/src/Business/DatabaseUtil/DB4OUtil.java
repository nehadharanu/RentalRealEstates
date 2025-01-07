/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DatabaseUtil;
import Business.EcoSystem;
import Business.SystemConfig;
import com.db4o.ObjectContainer;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rajesh
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;

    private static ObjectContainer conn;

    // Singleton pattern for DB4OUtil instance
    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    // Shutdown method for closing the database connection
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    // Create or retrieve a database connection
    public static ObjectContainer createConnection() {
        try {
            if (conn == null || conn.ext().isClosed()) {
                conn = Db4oEmbedded.openFile(FILENAME);
                System.out.println("Connection successfully initialized.");
            }
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error initializing connection to database.");
            return null;
        }
    }

    // Store EcoSystem object into the database
    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        System.out.println("Connecting to database...");
        System.out.println("Reading objects...");
        conn.store(system);
        conn.commit();
        conn.close();
    }

    // Retrieve the EcoSystem object from the database
    public EcoSystem retrieveSystem() {
        ObjectContainer conn = createConnection();

        if (conn == null) {
            throw new IllegalStateException("Database connection is null. Ensure createConnection() is successful.");
        }

        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
        EcoSystem system;

        if (systems.size() == 0) {
            system = SystemConfig.configureSystem();  // Create a new system if none exists
        } else {
            system = systems.get(systems.size() - 1);
        }

        conn.close();  // Ensure connection is closed after use
        return system;
    }
    
    public List<Object> readDatabase() {
    List<Object> results = new ArrayList<>();
    ObjectContainer conn = createConnection();

    if (conn == null) {
        throw new IllegalStateException("Database connection is null. Ensure createConnection() is successful.");
    }

    try {
        ObjectSet<Object> objects = conn.queryByExample(Object.class);
        System.out.println("Number of objects in the database: " + objects.size());
        for (Object obj : objects) {
            System.out.println("Retrieved object: " + obj); // Ensure meaningful toString() output
            results.add(obj);
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Error reading database.");
    } finally {
        conn.close(); // Close the connection after reading
    }

    return results;
}

    // Close the database connection
    public void close() {
        if (conn != null) {
            conn.close();
            System.out.println("Database connection closed.");
        }
    }
    
}
