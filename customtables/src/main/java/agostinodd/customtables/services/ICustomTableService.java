package agostinodd.customtables.services;

import agostinodd.customtables.models.CustomTable;
import reactor.core.publisher.Mono;

import java.util.Map;

public interface ICustomTableService {

    Mono<Map> findAll();
    Mono<Map> findByIdWithMono(String id);
    CustomTable findStammdatenTableById(String id);
    void saveStammdatenTable(CustomTable customTable);
    long deleteStammdatenTable(String id);

    CustomTable findStammdatenTableByOwnerMail(String ownerMail);
}
