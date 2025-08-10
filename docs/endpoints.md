# Types

The following table details available types along with their corresponding endpoints.
Please see the corresponding model documentation or visit wiki.guildwars2.com/api to see full object details.

| Endpoint                               | Object                    | Fully-Qualified Class Name                  | Endpoint Router Class                
|----------------------------------------|---------------------------|---------------------------------------------|--------------------------------------|
| /v2/wvw/abilities/{abilityId}          | [WvwAbility]()            | sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility | [WvwAbilityByIdEndpoint]()           
| /v2/wvw/abilities?ids={abilityIdsList} | [List< WvwAbility >]()    | sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility | [WvwMultipleAbilitiesByIdEndpoint]() 
| /v2/wvw/guilds/{region}                | [Map< String, String >]() | sh.snaxx.gw2javaapi.model.v2.wvw.WvwGuild   | [WvwGuildsEndpoint]()                |