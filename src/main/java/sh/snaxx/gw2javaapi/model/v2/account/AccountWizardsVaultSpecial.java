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
@JsonPropertyOrder({ "id", "title", "track", "acclaim", "progress_current", "progress_complete", "claimed" })
public class AccountWizardsVaultSpecial {

    private Integer id;
    private String title;
    private String track;
    private Integer acclaim;
    private Integer progress_current;
    private Integer progress_complete;
    private Boolean claimed;
}
