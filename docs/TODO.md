The following lists general tasks that at some point should be completed.

- Tests only test to see if the method returns an exact item. They do not test if bad input is handled in a graceful way.
- Endpoint classes do not have logic for allowing header overrides over what is set on the Gw2ApiClient. There already exists methods on the clent class that allow for this, there just needs to be type routing.
- Model classes heavily rely upon lombok. It should be considered to remove lombok once all models have been completed.
- The raw "makeAsyncGet" methods on Gw2ApiClient probably shouldn't be exposed to people using the Endpoint classes. If they are to remain exposed, it should be documented well how to use them.
- General documentation needs to be put everywhere.
  - [] Endpoint routing classes
  - [] Model classes
  - [] This includes the "docs" folder which is a place for more verbose documentation.
- At some point, constants should be set up that mirror the api when it returns static info
  - [] This probably should be automated by another application after the first "version" of this library is complete instead of manually writing all these files.
  - [] After this is done, test classes should be revisited and cleaned up by making them refer to the constants files instead of using manually defined objects in the class fields section.
