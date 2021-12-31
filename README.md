# PratviShah_AlgorithmsLabSolution
Question 1                                                 
PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They also have a daily target that they must achieve. Given a list of transactions done by 
PayMoney and a daily target, your task is to determine at which transaction PayMoney achieves the same. If the target is not achievable, then display the target is not achieved.
>TestCase 1\
Enter the size of transaction array\
3\
Enter the values of array\
20 12 31\
Enter the total no of targets that needs to be achieved\
2\
Enter the value of target\
21\
Target achieved after 2 transactions <br />
Enter the value of target\
19\
Target achieved after 1 transactions \
Explanation\
Target 1 i.e 21 is achieved after 2 transactions, (20 + 12)\
Target 2 i.e 19 is achieved in the 1st transaction itself.
-------------------------------------------------------

>Test Case 2
Enter the size of transaction array\
1\
Enter the values of array\
100\
Enter the total no of targets that needs to be achieved\
1\
Enter the value of target\
101 <br />
Given target is not achieved\
Explanation → Since there is only 1 transaction that is of 100 and the target value is 101, hence target is not achieved.<br />

Question 2                                                 
You are a traveler and traveling to a country where the currency denominations are unknown and as you travel, you get to know about the denomination in random order.
You want to make a payment of amount x, in such a way that the number of notes you give is minimum.\
Assume that the denominations are in such a way that any amount can be paid.
Input\
Take input of all the currency denominations ( random order)\
Take input of the amount that you want to pay.\
Output\
Print the minimum no of notes that you will be using to pay the net amount.
-------------------------------------------------------
>TestCase 1
Enter the size of currency denominations \
3\
Enter the currency denominations value\
5\
1\
10\
Enter the amount you want to pay\
12<br />
Your payment approach in order to give min no of notes will be\
10:1\
1:2
-------------------------------------------------------
>TestCase 2\
Enter the size of currency denominations\
5\
Enter the currency denominations value\
60\
5\
12\
78\
25\
Enter the amount you want to pay\
128\
Your payment approach in order to give min no of notes will be\
78:1\
25:2
-------------------------------------------------------
>TestCase 3\
Enter the size of currency denominations\
4\
Enter the currency denominations value\
12\
5\
123\
18\
Enter the amount you want to pay\
158\
Your payment approach in order to give min no of notes will be\
123:1\
18:1\
12:1\
5:1
