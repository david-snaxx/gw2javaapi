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
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "count", "charges", "skin", "dyes", "upgrades", "upgrade_slot_indices", "infusions", "binding", "bound_to", "stats" })
public class AccountBankItem {

    private Integer id;
    private Integer count;
    private Integer charges;
    private Integer skin;
    private List<Integer> dyes;
    private List<Integer> upgrades;
    private List<Integer> upgrade_slot_indices;
    private List<Integer> infusions;
    private String binding;
    private String bound_to;
    private ItemStats stats;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "attributes" })
    public static class ItemStats {

        private Integer id;
        private StatAttributes attributes;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "AgonyResistance", "BoonDuration", "ConditionDamage", "ConditionDuration", "CritDamage", "Healing", "Power", "Precision", "Toughness", "Vitality" })
    public static class StatAttributes {

        private Integer AgonyResistance;
        private Integer BoonDuration;
        private Integer ConditionDamage;
        private Integer ConditionDuration;
        private Integer CritDamage;
        private Integer Healing;
        private Integer Power;
        private Integer Precision;
        private Integer Toughness;
        private Integer Vitality;
    }
}
