package agostinodd.customtables.services;

import agostinodd.customtables.models.CustomTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class CustomTableService implements ICustomTableService {

    @Autowired
    CustomTableRepository customTableRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Mono<Map> findAll() {
        return null;
    }

    @Override
    public Mono<Map> findByIdWithMono(String id) {
        return null;
    }

    @Override
    public CustomTable findCustomTableById(String id) {
        return this.customTableRepository.findCustomTableById(id);
    }

    @Override
    public void saveCustomTable(CustomTable customTable) {
        this.customTableRepository.save(customTable);
    }

    @Override
    public long deleteCustomTable(String id) {
        System.out.println(this.mongoTemplate.findAll(CustomTable.class));
        Query q = new Query();
        q.addCriteria(Criteria.where("_id").is(id));
        return this.mongoTemplate.remove(q, CustomTable.class).getDeletedCount();
    }

    @Override
    public CustomTable findCustomTableByOwnerMail(String ownerMail) {
        return this.customTableRepository.findByOwnerMail(ownerMail);
    }

}
