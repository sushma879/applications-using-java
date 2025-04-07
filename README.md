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
<b>code : </b> 


