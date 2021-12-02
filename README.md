# Exchange-T  
[OOP Learning] Simple console program for calculating revenue of actives depending of USD rate  

**Language:** Java 8
Created: 01.12.2021
  
**Description**
  
Develop an assets management program for a stock exchange.  
There are three parameters of an asset placed on a stock exchange:  
  
    1. Revenue.
    2. Cost
        Cost = USD Exchange Rate * Quantity.
    3. Quantity.

There are three types of assets, each has its own revenue formula:  

    1. Product
        Revenue = Cost * 1.2.

    2. Stock
        Revenue = Cost of ALL PRODUCTS * Quantity / 2.
    3. Futures
       Revenue = Cost * 1.5.

There are three USD exchange rates. For each of them the program must indicate the profit of all assets.  
Profit is the difference between a revenue and a cost.  

**Input:**

    1. An array of non-negative integers, where consecutive groups of two numbers contain the information about assets:
        1.1 Type: product (1), stock (2), or futures (3).
        1.2 Quantity.
    2. Termination number -1.
    3. Initial USD exchange rate.
    4. Zero if no quantities of assets changed; non-zero integer if some of quantities changed.
    5. If the previous parameter is non-zero, the array of integers as specified in item 1; the second number (quantity) in each pair is positive and is equal to the number of assets added.
    6. Termination number -1.
    7. New USD exchange rate.
    8. Same as in item 4.
    9. Same as in item 5.
    10. Termination number -1.
    11. Final USD exchange rate.
  
**Output:**  
  
Three real numbers that are the profits of all assets for each USD exchange rate.  
  
