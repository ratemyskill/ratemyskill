package payloads

case class Email(username: String,
                 mailServer: String,
                 topLevelDomain: String)
