package agostinodd.customtables.models;

import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomCol {

    @Id
    private String id;
    private Object data;
}
