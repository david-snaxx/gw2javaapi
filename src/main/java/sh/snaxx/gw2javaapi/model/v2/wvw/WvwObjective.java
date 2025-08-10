package sh.snaxx.gw2javaapi.model.v2.wvw;

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
@JsonPropertyOrder({ "id", "name", "sector_id", "type", "map_type", "map_id", "upgrade_id", "coord", "label_coord", "marker", "chat_link" })
public class WvwObjective {

    private String id;
    private String name;
    private Integer sector_id;
    private String type;
    private String map_type;
    private Integer map_id;
    private Integer upgrade_id;
    private List<Integer> coord;
    private List<Integer> label_coord;
    private String marker;
    private String chat_link;
}
