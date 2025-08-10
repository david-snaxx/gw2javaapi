package sh.snaxx.gw2javaapi.client.endpoint.v2.wvw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sh.snaxx.gw2javaapi.client.Gw2ApiClient;
import sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class WvwAbilitiesEndpointTest {

    private Gw2ApiClient gw2ApiClient = new Gw2ApiClient();
    private WvwAbility abilityId2 = new WvwAbility(
            2,
            "Guard Killer",
            "Increases damage to enemy guards",
            "https://render.guildwars2.com/file/C5E6E906927E2C6311036C11F1306CCF57CBF259/544537.png",
            List.of(
                    new WvwAbility.WvwAbilityRank(1, "4% damage to guards"),
                    new WvwAbility.WvwAbilityRank(3, "8% (total) damage to guards"),
                    new WvwAbility.WvwAbilityRank(6, "12% (total) damage to guards"),
                    new WvwAbility.WvwAbilityRank(10, "16% (total) damage to guards. All Guard Killer bonuses now also affect enemy lords and supervisors."),
                    new WvwAbility.WvwAbilityRank(15, "20% (total) damage to guards, lords, and supervisors. Gain 50% of your endurance back after killing guards, lords, and supervisors.")
            )
    );
    private WvwAbility abilityId3 = new WvwAbility(
            3,
            "Defense Against Guards",
            "Reduces the damage you take from enemy guards",
            "https://render.guildwars2.com/file/0C450AE1344F410E08D0E4A851F0EFD77210D615/544541.png",
            List.of(
                    new WvwAbility.WvwAbilityRank(1, "4% reduced damage from guards"),
                    new WvwAbility.WvwAbilityRank(3, "8% reduced damage (total) from guards"),
                    new WvwAbility.WvwAbilityRank(6, "12% reduced damage (total) from guards"),
                    new WvwAbility.WvwAbilityRank(10, "16% reduced damage (total) from guards. All Defense Against Guards bonuses apply to lords and supervisors."),
                    new WvwAbility.WvwAbilityRank(15, "20% reduced damage (total) from guards, lords, and supervisors. Gain resolution for 10 seconds when you take damage from guards, lords, or supervisors. This effect triggers once every 20 seconds.")
            )
    );
    private WvwAbility abilityId4 = new WvwAbility(
            4,
            "Mercenary's Bane",
            "Increases damage to and reduces damage from mercenaries",
            "https://render.guildwars2.com/file/33E377E353512ACD4AB52F4DEFA41B58EF73A92D/544538.png",
            List.of(
                    new WvwAbility.WvwAbilityRank(1, "4% increase to damage and defense against mercenaries"),
                    new WvwAbility.WvwAbilityRank(2, "8% (total) increase to damage and defense against mercenaries"),
                    new WvwAbility.WvwAbilityRank(3, "12% (total) increase to damage and defense against mercenaries"),
                    new WvwAbility.WvwAbilityRank(4, "16% (total) increase to damage and defense against mercenaries"),
                    new WvwAbility.WvwAbilityRank(5, "20% (total) increase to damage and defense against mercenaries")
            )
    );

    @Test
    public void testGetAllAbilityIds() {
        List<Integer> receivedObject = gw2ApiClient.request().v2().wvw().abilities().getAllAbilityIds().join();

        Assertions.assertNotNull(receivedObject);
        Assertions.assertEquals(2, (int) receivedObject.get(0));
        Assertions.assertEquals(3, (int) receivedObject.get(1));
    }

    @Test
    public void testGetAbility() {
        List<Integer> testIds = Arrays.asList(2, 3, 4);

        WvwAbility receivedId2 = gw2ApiClient.request().v2().wvw().abilities().getAbility(2).join();
        WvwAbility receivedId3 = gw2ApiClient.request().v2().wvw().abilities().getAbility(3).join();
        WvwAbility receivedId4 = gw2ApiClient.request().v2().wvw().abilities().getAbility(4).join();

        Assertions.assertNotNull(receivedId2);
        Assertions.assertNotNull(receivedId3);
        Assertions.assertNotNull(receivedId4);
        Assertions.assertEquals(this.abilityId2, receivedId2);
        Assertions.assertEquals(this.abilityId3, receivedId3);
        Assertions.assertEquals(this.abilityId4, receivedId4);
    }

    @Test
    public void testGetMultipleAbilities() {
        List<Integer> testIds = Arrays.asList(2, 3, 4);

        List<WvwAbility> recievedObjects = this.gw2ApiClient.request().v2().wvw().abilities().getMultipleAbilities(testIds).join();
        Optional<WvwAbility> recievedId2 = recievedObjects.stream()
                .filter(object -> Objects.equals(object.getId(), 2))
                .findFirst();
        Optional<WvwAbility> recievedId3 = recievedObjects.stream()
                .filter(object -> Objects.equals(object.getId(), 3))
                .findFirst();
        Optional<WvwAbility> recievedId4 = recievedObjects.stream()
                .filter(object -> Objects.equals(object.getId(), 4))
                .findFirst();

        Assertions.assertNotNull(recievedObjects);
        Assertions.assertEquals(testIds.size(), recievedObjects.size());
        Assertions.assertNotNull(recievedId2);
        Assertions.assertEquals(this.abilityId2, recievedId2.get());
        Assertions.assertNotNull(recievedId3);
        Assertions.assertEquals(this.abilityId3, recievedId3.get());
        Assertions.assertNotNull(recievedId4);
        Assertions.assertEquals(this.abilityId4, recievedId4.get());
    }
}
