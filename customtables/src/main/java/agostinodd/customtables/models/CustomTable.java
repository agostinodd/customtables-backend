package agostinodd.customtables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomTable {

    @Id
    private String id;
    private CustomSchema customSchema;
    private String ownerMail;
    private ArrayList<CustomRow> customRows;
}
