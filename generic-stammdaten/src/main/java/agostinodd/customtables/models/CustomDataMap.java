package agostinodd.customtables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomDataMap {

    @Id
    @Generated
    private String id = UUID.randomUUID().toString();;
    private CustomColDefinition customColDefinition;
    private CustomCol customCol;
}
