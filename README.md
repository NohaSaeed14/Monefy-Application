# Testing Session of the Monefy app
## List of Test Cases for Functional and non-Functional
* Verify opening for Monefy App (High)
* verify changing language when change it from english to german should all screens , all side menus and all tabs changed their language into german(**BUG**)
* check the logo of application appear in the middle of header and below the logo appear type of account (payment or cash or all accounts)
  * Left side menu should open
    *  left side menu should allow to choose account
    *  left side menu should allow to choose day, week , month ,...etc
    *  should valid to click in home screen while openining left side menu , navigate to home screen
    *  should valid to click in search field while openining left side menu 
    *  should valid to click in new transfer screen while openining left side menu 
    *  should valid to click in right side menu while openining left side menu 
   *  The 3 vertical points at the top-right screen   should open Right side menu
        *    right side menu should display Categories, Accounts, Currencies and Settings.
             *    sub-menu of Categories should allow user to add new expense and allow to add new way of incomes
                  *    check the navigation of each type example choose gifts enter to gifts and display highlighter in gift logo
                  *    It should able to edit any catogery
                  *   It should able to delete any category
                  *   It should be possible to distinguish between Enabled and disabled categories
                  *   It should be able to close edit page from back arrow button
             *   sub-menu of Accounts should allow user to create new account
                 *   check the successfully message that mean add new account
                  *    It should able to edit my accounts
                  *   It should able to delete any account
                  *   check the popup messeage after delete an account 
                  *   It merge two of my accounts
                  *   It should all fields in new account screen able to enter the valid data
                  *   should allow user to add name 
                  *   should allow user to choose currency
                  *   should allow user to enter initial account balance and initial balance date 
                  *   should allow user to turn on switch button of included in the balance 
                  *   It should be possible to distinguish between Enabled and disabled accounts
                  *   sub-menu of Accounts should allow user to make new transfer action
                  *   It should all fields in new transfer screen able to enter the valid data
                  *   any changes should saved automaitcally
              *  sub-menu of Currencies should allow user to choose any currency that want
              *   sub-menu of Settings should allow user to justify any settings that want
                  *   should allow user to choose from sub checklist balance(Budget mode, Carry over, Future recurring records) from main list settings
                  *   should when user click on budget mode and add zero number should appear message "enter valid number" but appear message "budget ammount should be positive" while zero is not a negative number handling message (**BUG**)
                  *   in General settings should allow user to choose dark mode for application
                  *   should allow user to choose language
                  *   should allow user to choose Currency
                  *   should allow user to choose First day of week
                  *   should allow user to change First day of month
                  *   should allow user to add passcode protection
                  *   should allow user to add review for appication and navigate correctly to app store
                  *   should allow user to data for the day export to file
                  *   should allow user to click on about to know more about monefy
                  *   should allow user to copy his purchase ID 
                  *   should able to user to use dropbox, Google Drive
                  *   should allow user to create data backup , restore data or clear data
     * Search button should be clickable
       *  should when click on search button keyboard displayed
       *  should when enter valid data and click search display the list and details of the result
       *  should when enter invalid data and click search appear message that "No records have been found"
    * reverse arrows button should open new transfer screen 
      * should allow to add new transcation and make it's affect
      * should able to user to enter valid transaction amount
      * should allow user to add note 
      * should display at the top of screen date equal "date of the day(today)"
      * should have possiblity to make transaction from or to another account
      * should when click on numeric button display numeric keyboard in screen 
      * add transfer button below numeric keyboard should be clickable and added correclty
      * check the message appeared after add transfer successfully
      * should when click on "back arrow button" navigate to the home page
      * check transfer transcation display in balance history
* The Negative and Positive fab buttons in home screen(**Medium**) 
  * should when click on (+) fab button open new income screen 
  * should when click on (-) fab button open new expense screen
    * new income screen able to user to enter amount of new income or make some mathematical equation 
    * new income screen valid to user to enter note
    * new income screen able user to choose category of their income like " Deposits, Salary and Savings" 
    * valid to user to add new way of income(pro-feature)
    * it not valid to enter new income with amount zero number
    * new income screen after entering new income transaction given toast message for successfully if user want to cancel it can click on cancel in toast message 
    * after saving income should appear in circle balance in home screen the number that add but it took long time to disappeared happening overlappinh(**BUG**)
    * check income transcation display in balance history
    * should when click on "back arrow button" navigate to the home page
    * new expense screen able to user to enter amount of new expense or make some mathematical equation 
    *  new expense screen valid to user to enter note
    *  new expense screen able user to choose category of their expense like " Clothes, Gift, Sports,....etc"
    *  valid to user to add new way of expense(pro-feature)
 * should when tab on any pro feature appear pro feature screen
   * should check in pro feature screen appear the purchase of unlimited use
   * should when click to claim my offer if user have an offer given screen appear on it the adding payment method (add credit or debit card) or add vodafone billing
  * check the (circle shape) in center of home screen that appear correctly and calculate every transaction correct(**Medium**)
  * application home screen appear all catogries(**High**)
  * every catogery action button should navigate to new expense screen(**High**)
    * should display in new expense screen the date of day with format(day of week, dd,month)
    * New expense screen should able to user to enter valid transaction amount
      * it not acceptable to enter zero number or number with negative sign as new expense 
      * valid to user to choose account like cash or payment card
      * valid to user to enter note
      * should after finishing write note click on button check mark or click in any space in screen to close keyboard (**BUG**) while happening overlapping keyboard over numeric keyboard
      * when click on any category and open new expense screen should by default display numeric keyboard
      * should valid to user to enter amount of new expense or make some mathematical equation 
      * should enter enter valid number 
      * it should able to enter number with comma like hundreds or thousands to be usable for users (**BUG**)
      * It should possible to cancel transaction from cancel button that displayed in toast message in 5 secs before disappeared
      * should when click on "back arrow button" navigate to the home page
   * Application home screen have displayed two buttons right and left
        * Balance button should change it's colour depending on the total balance if total with positive number appear"Green" or negative number appear "Red"
        * Balance button should appear current balance "positive or negative number with it's currency"
      * Click on righ button to display balance screen
        * balance screen should display list of transactions by categories
        * balance screen should display history of each transaction
        * balance screen should display every catogery with total value of catogery
        * it should able to sort the list of catogery by history or amount of transaction
      * left button should close balance screen