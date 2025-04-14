Feature: Magento
https://magento.softwaretestingboard.com/


Scenario: Add to cart
Given Open the browser
Then Click on SignIN button
Then Enter Email "atharvakumare93@gmail.com"
Then Enter Password "atharvak#2004"
Then Click on SignIn
Then Click on Gear
Then Click on Bags
Then Select the product
Then Change the quantity "1"
And Click on Add to cart

Scenario: Add to wishlist
Then Click on Wishlist
And Select prod

Scenario: Reviews
Then Click on Reviews
Then Give Ratings
Then Give Summary "Good"
Then Give Review "Fantsatic Bag"
And Click on Submit