package agostinodd.customtables.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomCalculatedColumn {
    @Id
    @Generated
    private String id = UUID.randomUUID().toString();
    private List expressionToCalculate;
}
