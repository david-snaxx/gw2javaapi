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
@JsonPropertyOrder({ "name", "profession", "specializations", "skills", "aquatic_skills", "legends", "aquatic_legends" })
public class AccountBuildStorageTemplate {

    private String name;
    private String profession;
    private List<TemplateSpecialization> specializations;
    private TemplateSkills skills;
    private TemplateSkills aquatic_skills;
    private List<Integer> legends;
    private List<Integer> aquatic_legends;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "traits" })
    public static class TemplateSpecialization {

        private Integer id;
        private List<Integer> traits;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "heal", "utilities", "elite" })
    public static class TemplateSkills {

        private Integer heal;
        private List<Integer> utilities;
        private Integer elite;
    }
}
