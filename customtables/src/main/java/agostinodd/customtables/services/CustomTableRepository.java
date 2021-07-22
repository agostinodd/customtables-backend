package agostinodd.customtables.services;

import agostinodd.customtables.models.CustomTable;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomTableRepository extends MongoRepository<CustomTable, String> {

    CustomTable findByOwnerMail(String ownerMail);
    CustomTable findCustomTableById(String id);
}