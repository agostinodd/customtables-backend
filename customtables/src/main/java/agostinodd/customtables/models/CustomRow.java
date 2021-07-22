package agostinodd.customtables.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomRow {

    @Id
    private String id = UUID.randomUUID().toString();;
    private ArrayList<CustomDataMap> customDataMap;
}
