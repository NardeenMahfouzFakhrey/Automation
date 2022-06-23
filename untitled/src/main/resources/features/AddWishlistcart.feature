@TEST
Feature:AddWishlistcart | add different products to Wishlist


  Scenario:
    Given  add different products to Wishlist cart
    When user add First products to Wishlist cart
    And user add Second products to Wishlist cart
    Then  Wishlist cart now have two product

