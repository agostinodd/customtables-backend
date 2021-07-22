package agostinodd.customtables.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomColDefinition {

    @Id
    @Generated
    private String id = UUID.randomUUID().toString();
    private String name;
    private int colNr;
    private String datatype;
    private CustomCalculatedColumn calculatedCol;
}
