Feature: To Book Hotel in Adactin Website

Background:
  Given Log in to the AdactinHotel
@adactin
Scenario: Book Hotel and Print the Order Number
  When Enter the search Hotel details
  And Enter SelectHotel Page details
  And Enter BookHotel Page Details
  Then get the BookingConfirmation and Print the orderNum
  