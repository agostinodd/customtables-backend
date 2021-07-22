package agostinodd.customtables.services;

import agostinodd.customtables.models.CustomTable;
import reactor.core.publisher.Mono;

import java.util.Map;

public interface ICustomTableService {

    Mono<Map> findAll();
    Mono<Map> findByIdWithMono(String id);
    CustomTable findCustomTableById(String id);
    void saveCustomTable(CustomTable customTable);
    long deleteCustomTable(String id);

    CustomTable findCustomTableByOwnerMail(String ownerMail);
}
