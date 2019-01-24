@new
Feature:


Scenario Outline: As a customer i have to contact d3d team (happy path)
  Given customer in home page and navigated to contactus page
  When customer in contactus page have to enter the required fields first name"<Fname>",last name"<Lname>",email"<email>",phone number"<number>",subject"<subject>" and message"<msg>" and click on submit button
  Then customer have to see the successful submission message
  Examples:
    | Fname | Lname | email | number | subject | msg |
    |ravi|kiran|gkiran@gmail.com|07472833358|hi sri|automation scripts|


  Scenario Outline:As a customer i am entering invalid fields then i cant send message to d3d team(unhappy path)

    Given customer in home page and navigated to contactus page
    When customer in contactus page i dont have to enter the required fields first name"<Fname>",last name"<Lname>",email"<email>",phone number"<number>",subject"<subject>" and message"<msg>" and click on submit button
    Then customer have to see the unsuccessful submission message
    Examples:
      | Fname | Lname | email | number | subject | msg |
      |ravi|kiran|gkiran|07472833358ki|hi sir|automation scripts|





