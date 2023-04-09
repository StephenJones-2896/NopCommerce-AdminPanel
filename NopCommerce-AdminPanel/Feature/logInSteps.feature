Feature: Login functionality

 Scenario: Login with valid username & password
 
 	Given User open the browser & open the website using link "https://admin-demo.nopcommerce.com/login"
 	And Entered username as "admin@yourstore.com"
 	And Entered password as "admin"
 	Then click the Login button