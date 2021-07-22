package agostinodd.customtables.models;


import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomSchema {

    @Id
    private String id;
    private List<CustomColDefinition> customColDefinitionSet;
}
