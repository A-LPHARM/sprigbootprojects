To create a keyspace in Cassandra running in a Docker container, you can follow these steps:

### 1. **Start the Cassandra Docker Container**
   If you haven't already started a Cassandra Docker container, you can do so using the following command:

   ```bash
   docker run --name cassandra -d cassandra:latest
   ```

   This command will pull the latest Cassandra image from Docker Hub and run it in a container named `cassandra`.

### 2. **Access the Cassandra CQLSH (Cassandra Query Language Shell)**
   Once the Cassandra container is running, you can access the CQL shell to interact with the database. Use the following command to start CQLSH:

   ```bash
   docker exec -it cassandra cqlsh
   ```

   This command allows you to run the `cqlsh` command inside the running Cassandra container.

### 3. **Create a Keyspace**
   Inside the `cqlsh` prompt, you can create a keyspace using the `CREATE KEYSPACE` command. Here’s a basic example of creating a keyspace:

   ```cql
   CREATE KEYSPACE my_keyspace WITH REPLICATION = {
      'class' : 'SimpleStrategy',
      'replication_factor' : 2
   };
   ```

   - `my_keyspace`: The name of the keyspace you want to create.
   - `SimpleStrategy`: This is the replication strategy. For single-node clusters (like a development environment), `SimpleStrategy` is often used.
   - `replication_factor`: The number of replicas for your data. In a single-node setup, this should be `1`.

   After executing this command, the keyspace will be created.

### 4. **Verify the Keyspace Creation**
   To verify that your keyspace was successfully created, you can list all keyspaces using the following command:

   ```cql
   DESCRIBE KEYSPACES;
   ```

   Your new keyspace, `my_keyspace`, should be listed among the other keyspaces.

### Example Workflow Summary
1. Start the Cassandra Docker container: `docker run --name cassandra -d cassandra:latest`.
2. Access the CQLSH: `docker exec -it cassandra cqlsh`.
3. Create a keyspace:
   ```cql
   CREATE KEYSPACE my_keyspace WITH REPLICATION = {
      'class' : 'SimpleStrategy',
      'replication_factor' : 1
   };
   ```
4. Verify the keyspace creation with `DESCRIBE KEYSPACES;`.

That's it! You now have a keyspace created in Cassandra running inside a Docker container.