# applications-using-java
Solving real time problems using programming language java<br>
<b>problem statements: </b> <br><br>
<b>Problem Statement 1 :</b> A party has been organised on cruise. The party is organised for a limited
time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is
represented as elements of the array. The task is to find the maximum number of guests present
on the cruise at any given instance within T hours.<br>
<b>code : </b>https://github.com/sushma879/applications-using-java/blob/main/party.java <br>
<b>Sample Input and Output-</b> <br>
<b>Input : </b> <br>
 5 -> Value of T <br>
 [7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by
new line <br>
 [1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by
new line. <br>
<b>Output </b> :<br>
8 -> Maximum number of guests on cruise at an instance.<br>
Explanation:<br>
1st hour: <br>
Entry : 7 Exit: 1 <br>
No. of guests on ship : 6 <br>
2nd hour : <br>
Entry : 0 Exit : 2 <br>
No. of guests on ship : 6-2=4 <br>
Hour 3: <br>
Entry: 5 Exit: 1 <br>
No. of guests on ship : 4+5-1=8 <br>
Hour 4: <br>
Entry : 1 Exit : 3 <br>
No. of guests on ship : 8+1-3=6 <br>
Hour 5: <br>
Entry : 3 Exit: 4 <br>
No. of guests on ship: 6+3-4=5 <br>
Hence, the maximum number of guests within 5 hours is 8. <br>
<b>problem statement-2 : </b> <br>
We want to estimate the cost of painting a property. Interior wall painting
cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft. <br>
Take input as <br>
1. Number of Interior walls <br>
2. Number of Exterior walls <br>
3. Surface Area of each Interior 4. Wall in units of square feet <br>
Surface Area of each Exterior Wall in units of square feet <br> <br>

If a user enters zero as the number of walls then skip Surface area values as User may don‘t want
to paint that wall. <br>
Example 1: <br>
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00 <br>
Total estimated Cost: 1847.4 INR <br>
<b>code : </b> https://github.com/sushma879/applications-using-java/blob/main/painting_cost.java <br>
<b>Problem Statement 3 </b> <br>- An intelligence agency has received reports about some threats. The
reports consist of numbers in a mysterious method. There is a number ―N‖ and another number
―R‖. Thosenumbers are studied thoroughly and it is concluded that all digits of the number  ̳N‘
are summed upand this action is performed  ̳R‘ number of times. The resultant is also a single
digit that is yet to be deciphered. The task here is to <br>
If the value of  ̳R‘ is 0, print the output as  ̳0‘. <br>
<b>code : </b>https://github.com/sushma879/applications-using-java/blob/main/problem3_solution.java <br>
<b>Sample input and output : </b> <br>
Input : <br>

99 -> Value <br>
of N3 -> <br>
Value of R <br>
Output : <br>
9 -> Possible ways to fill the cistern. <br>

Explanation: <br>
Here, the number N=99 <br>
1. Sum of the digits N: 9+9 = 18 <br>
2. Repeat step 2  ̳R‘ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54 <br>
3. Add digits of 54 as we need a single digit 5+4Hence , the output is 9.
<br>
<b>problem statement -4 </b> <br>
A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time <br>
You are required to implement the following <br>
function.int NumberOfCarries(int num1 , int num2); <br>
The functions accepts two numbers  ̳num1‘ and  ̳num2‘ as its arguments. You are required to
calculate and return the total number of carries generated while adding digits of two numbers
 ̳num1‘and  ̳ num2‘. <br>
Assumption: num1, num2>=0 <br>
Example: <br>
 Input <br>
o Num 1: 451 <br>
o Num 2: 349 <br>
 Output <br>
o 2 <br>

Explanation: <br>
Adding  ̳num 1‘ and  ̳num 2‘ right-to-left results in 2 carries since ( 1+9) is 10. 1 is
carried and(5+4=1) is 10, again 1 is carried. Hence 2 is returned. <br>
<br>
<b>Code: </b><br>


