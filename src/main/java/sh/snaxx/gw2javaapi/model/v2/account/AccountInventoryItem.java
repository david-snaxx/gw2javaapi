package sh.snaxx.gw2javaapi.model.v2.account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "count", "charges", "skin", "upgrades", "infusions", "binding" })
public class AccountInventoryItem {

    private Integer id;
    private Integer count;
    private Integer charges;
    private Integer skin;
    private List<Integer> upgrades;
    private List<Integer> infusions;
    private String binding;
}
