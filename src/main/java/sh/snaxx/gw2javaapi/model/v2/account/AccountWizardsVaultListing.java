package sh.snaxx.gw2javaapi.model.v2.account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "item_id", "item_count", "type", "cost", "purchased", "purchase_limit" })
public class AccountWizardsVaultListing {

    private Integer id;
    private Integer item_id;
    private Integer item_count;
    private String type;
    private Integer cost;
    private Integer purchased;
    private Integer purchase_limit;
}
