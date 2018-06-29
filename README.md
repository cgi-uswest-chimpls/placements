# placements

Placements microservice for CW Portal project.  Simulates placements replicated from eWiSACWIS.

## Episode Object

String idepsd;
String idprsn;
BigDecimal amrate;
String idprvdorg;
Timestamp dtbgn;
Timestamp dtend;
Timestamp dtrmvl;
String flrmvl;
String idcase;

## Endpoints

/episode/{idepsd} - Gets a single Episode by idepsd key.

/episodesByProvider/{idprvdorg} - Gets a set of episodes by idprvdorg key.

/episodesByChild/{idprsn} - Gets a set of episodes by idprsn key.

/episodeCurrentForChild/{idprsn} - Gets the current (dtend is null) episode by idprsn key.
