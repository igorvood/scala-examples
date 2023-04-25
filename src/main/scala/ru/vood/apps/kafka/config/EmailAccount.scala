package ru.vood.apps.kafka.config

import scala.beans.BeanProperty

class EmailAccount {
  @BeanProperty var accountName = ""
  @BeanProperty var username = ""
  @BeanProperty var password = ""
  @BeanProperty var mailbox = ""
  @BeanProperty var imapServerUrl = ""
  @BeanProperty var protocol = ""
  @BeanProperty var minutesBetweenChecks = 0
  @BeanProperty var usersOfInterest = new java.util.ArrayList[String]()
  override def toString: String = s"acct: $accountName, user: $username, url: $imapServerUrl"
}