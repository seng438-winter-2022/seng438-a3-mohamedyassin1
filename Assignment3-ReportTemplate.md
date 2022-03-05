**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group \#:       | 32  |
|-----------------|---|
| Student Names:  |   |
|                 |  Benson Li      |
|                 |  Henrique Andras |
|                 |  Kevin Araujo  |
|                 |   Mohamed Yassin  |


# 1 Introduction

This lab introduces the fundamentals of testing coverage, which includes method, statement, and condition coverages. It is also an introduction to white-box testing as we will actively use interact with the code to improve coverage and better our tests. Throughout this lab, we will improve our tests from the previous labs by increasing their overall coverage, meaning we can test a bigger range of possibilities in the code. 

# 2 Manual data-flow coverage calculations for X and Y methods



![image](https://user-images.githubusercontent.com/73013959/156868378-f7663e0c-9e22-4a76-9d17-0dc24d22b8c1.png)

<table>
  <tr>
   <td><strong>Variable</strong>
   </td>
   <td><strong>Def</strong>
   </td>
   <td><strong>dcu</strong>
   </td>
   <td><strong>dpu</strong>
   </td>
  </tr>
  <tr>
   <td>data
   </td>
   <td>{1}
   </td>
   <td>{2}
   </td>
   <td>{}
   </td>
  </tr>
  <tr>
   <td>column
   </td>
   <td>{1}
   </td>
   <td>{2}
   </td>
   <td>{}
   </td>
  </tr>
  <tr>
   <td>total
   </td>
   <td>{2,3}
   </td>
   <td>{6}
   </td>
   <td>{}
   </td>
  </tr>
  <tr>
   <td>rowCount
   </td>
   <td>{2}
   </td>
   <td>{}
   </td>
   <td>{5}
   </td>
  </tr>
  <tr>
   <td>r
   </td>
   <td>{2,5}
   </td>
   <td>{2}
   </td>
   <td>{5}
   </td>
  </tr>
  <tr>
   <td>n
   </td>
   <td>{2}
   </td>
   <td>{3}
   </td>
   <td>{2}
   </td>
  </tr>
</table>



<table>
  <tr>
   <td>Pairs
   </td>
   <td>Variables
   </td>
  </tr>
  <tr>
   <td>{1,2}
   </td>
   <td>Data
   </td>
  </tr>
  <tr>
   <td>{1,2}
   </td>
   <td>Column
   </td>
  </tr>
  <tr>
   <td>{2,3}
   </td>
   <td>Total
   </td>
  </tr>
  <tr>
   <td>{2,6}, {3,6}
   </td>
   <td>Total
   </td>
  </tr>
  <tr>
   <td>{2,5}
   </td>
   <td>Row Count
   </td>
  </tr>
  <tr>
   <td>{2,5}, {5,5}
   </td>
   <td>r
   </td>
  </tr>
  <tr>
   <td>{2,3}
   </td>
   <td>n
   </td>
  </tr>
  <tr>
   <td>{2,2}
   </td>
   <td>n
   </td>
  </tr>
  <tr>
   <td>{2,2}
   </td>
   <td>r
   </td>
  </tr>
</table>



<table>
  <tr>
   <td>
   </td>
   <td colspan="6" ><strong>Variables </strong>
   </td>
  </tr>
  <tr>
   <td><strong>Test Case</strong>
   </td>
   <td>data
   </td>
   <td>column
   </td>
   <td>total
   </td>
   <td>rowCount
   </td>
   <td>r
   </td>
   <td>n
   </td>
  </tr>
  <tr>
   <td>testColumnDataIsZero()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>{2,3}, {2,6}
<p>
{3,6}
   </td>
   <td>{2,5}
   </td>
   <td>{2,5}, {5,5},
<p>
{2,2}
   </td>
   <td>{2,3},
<p>
{2,2}
   </td>
  </tr>
  <tr>
   <td>testColumnPositiveData()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>{2,3}, {2,6}
<p>
{3,6}
   </td>
   <td>{2,5}
   </td>
   <td>{2,5}, {5,5},
<p>
{2,2}
   </td>
   <td>{2,3},
<p>
{2,2}
   </td>
  </tr>
  <tr>
   <td>testColumnNegativeData()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>{2,3}, {2,6}, {3,6}
   </td>
   <td>{2,5}
   </td>
   <td>{2,5}, {5,5},
<p>
{2,2}
   </td>
   <td>{2,3},{2,2}
   </td>
  </tr>
  <tr>
   <td>testColumnMixedData()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>{2,3}, {2,6}, {3,6}
   </td>
   <td>{2,5}
   </td>
   <td>{2,5}, {5,5},
<p>
{2,2}
   </td>
   <td>{2,3},{2,2}
   </td>
  </tr>
  <tr>
   <td>testColumnBoundary()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>{2,3}, {2,6}, {3,6}
   </td>
   <td>{2,5}
   </td>
   <td>{2,5}, {5,5},
<p>
{2,2}
   </td>
   <td>{2,3},
<p>
{2,2}
   </td>
  </tr>
  <tr>
   <td>testColumnOutsideBoundary()
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
   <td>
   </td>
  </tr>
  <tr>
   <td>testColumnTotalNullData()
   </td>
   <td>{1,2}
   </td>
   <td>-
   </td>
   <td>-
   </td>
   <td>-
   </td>
   <td>-
   </td>
   <td>-
   </td>
  </tr>
  <tr>
   <td>testNegativeColumnIndex()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>{2,3}, {2,6}
   </td>
   <td>{2,5}
   </td>
   <td>{2,5}, {5,5},
<p>
{2,2}
   </td>
   <td>{2,3},
<p>
{2,2}
   </td>
  </tr>
  <tr>
   <td>testColumnTotalIllegal()
   </td>
   <td>{1,2}
   </td>
   <td>{1,2}
   </td>
   <td>-
   </td>
   <td>-
   </td>
   <td>{2,2}
   </td>
   <td>-
   </td>
  </tr>
</table>


DU-Pair Coverage: since every pair was tested at least once in a test case, the coverage for calculateColumnTotal() is 100%.

# 3 A detailed description of the testing strategy for the new unit test

As an extension of our black-box testing, we do white-box testing by analyzing the source code and writing further test cases to enhance the testing. 

We first check our statement, branch, and method coverage for our initial black-box tests using EclEmma in both Range and DataUtilities classes. We can then do white-box testing by checking which branches and lines are not covered yet by seeing the red highlights then writing unit tests for them to improve our coverage for the classes we previously did in our black-box test. 

Afterwards, we can then continue our white-box testing by checking the source code to see which methods have not been covered yet. Based on our analysis, we can write unit tests that will cover the methods within the two classes until we reach 90% statement coverage, 70% branch coverage and 60% method coverage.

# 4 A high-level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

**getUpperBound():** 

Since this method in the class Range returns `this.upper`, we test if the value is stored properly when initializing the Range, thus covering all partitions is sufficient for the test. The test case we developed with this in mind achieved 100% statement and branch coverage for the method and increased the overall coverage for Range.

**equal():**

For the method equal() in DataUtilities, we made sure to cover all parts of the source code, namely, write tests that reach each branch, those being:



* `if (a == null)`
* `if (b == null)`
* `if (a.length != b.length)`

the for loop at the end that includes a conditional branch



```
for (int i = 0; i &lt; a.length; i++) {
  if (!Arrays.equals(a[i], b[i])) {
    return false;
  }
}
```

and the return statement at the end.



* `return true;`

The test case we developed with this in mind achieved 100% statement and branch coverage for the method and increased the overall coverage for DataUtilities.

**createNumberArray(double[] data):** 

For the method createNumberArray(double[] data) in DataUtilities, we made sure to cover all parts of the source code, this would mean passing the parameter check:



* `ParamChecks.nullNotPermitted(data, "data");`

with an array that is not null, and then going through the for loop: 



```
for (int i = 0; i &lt; data.length; i++) {
  result[i] = new Double(data[i]);
}
```


with the array that has a length of at least 1. The test case we developed with this in mind achieved 100% statement and branch coverage for the method and increased the overall coverage for DataUtilities.

**constrain(double value):**

The constrain(double value) method in the class Range was originally not tested, then we began testing in this assignment with a value within the range which gave us little statement and conditional coverage as we were only covering:


```
double result = value;
.
.
.
return result;
```


Which is very little compared to the whole method. After adding methods to specifically target all the branches 



* `if (!contains(value)) `By making the passed value be outside the range
* `if (value > this.upper)`By making the passed value be outside the range and for it to be greater than the uppperbound
* `else if (value &lt; this.lower)`By making the passed value be outside the range and for it to be lower than the lowerbound

We achieved 100% statement and condition coverage of this method

**public static Range shift(Range base, double delta, boolean allowZeroCrossing):**

This method was not originally tested. We began by testing shift with allowZeroCrossing argument as true, which made it so the only parts of the code covered was:


```
if (allowZeroCrossing) {
  return new Range(base.getLowerBound() + delta,
    base.getUpperBound() + delta);
}
```


To improve the overall coverage we developed new tests which target the other branch of this method with allowZeroCrossing as false which covered:


```
else {
  return new Range(shiftWithNoZeroCrossing(base.getLowerBound(),
    delta), shiftWithNoZeroCrossing(base.getUpperBound(),
    delta));
}
```


This allowed for this branch to be covered but also for the method `shiftWithNoZeroCrossing `to also be tested and have its statements and branches covered as well.

# 5 A detailed report of the coverage achieved of each class and method (a screenshot from the code cover results in green and red color would suffice)
Classes Range and Data Utilities: Before and After adding more tests and improving branch,statement and method coverage through white box testing. We added tests for every method in class Range and Data Utilities to be able to achieve these percentages for the whole class.

Before:

![image](https://user-images.githubusercontent.com/73013959/156868575-2f035d50-778a-408f-9f65-5ea2f0925ccb.png)

![image](https://user-images.githubusercontent.com/73013959/156868612-d608b94e-dbb3-494c-aeb1-9d75e958910d.png)

After:

![image](https://user-images.githubusercontent.com/73013959/156868618-8c1c2125-fdf7-49b0-baed-aa44e2e29f67.png)

![image](https://user-images.githubusercontent.com/73013959/156868621-69e13346-5060-4128-aad4-5605ff2b0527.png)


# 6 Pros and Cons of coverage tools used and Metrics you report (This is section 3.1 in the instructions)

First Coverage Tool: **EclEmma, **Metric Reported**: Statement Coverage**

**Statement coverage for methodsin class Range:**



* contains: 100%
* getCentralValue: 100%
* getLowerBound: 100%
* getUpperBound:100%
* getLength:100%

**Statement coverage for methods in class DataUtilities:**



* calculateRowTotal: 100%
* calculateRowTotal(with int[]): 100%
* calculateColumnTotal: 100%
* calculateColumnTotal(with int[]): 100%
* getCumulativePercentage: 100%

Branch Coverage Tool: **EclEmma**, Metric Reported: **Branch Coverage**

**Branch coverage for methods in class Range:**



* contains: 100%
* getCentralValue: 100%
* getLowerBound: 100%
* getUpperBound:100%
* getLength:100%

**Branch coverage for methods in class DataUtilities:**



* calculateRowTotal 100%
* calculateRowTotal(with int[]): 83.3%
* calculateColumnTotal: 100%
* calculateColumnTotal(with int[]): 83.3%
* getCumulativePercentage: 100%

We will be replacing condition coverage with method coverage, as EclEmma does not have condition coverage and we had a lot of trouble installing other tools and getting them to run, so we settled for method coverage.

Method Coverage Tool: **EclEmma**, Metric Reported: **Method Coverage**

**Method coverage for methods in class Range:**



* contains: 100%
* getCentralValue: 100%
* getLowerBound: 100%
* getUpperBound:100%
* getLength:100%

**Method coverage for methods in class DataUtilities:**



* calculateRowTotal 100%
* calculateRowTotal(with int[]): 83.3%
* calculateColumnTotal: 100%
* calculateColumnTotal(with int[]): 83.3%
* getCumulativePercentage: 100%

**Pros of EclEmma**: Simple to use and runs quickly. Visually shows which statements were covered and which were not, through red and green lines. Also shows the total number of covered lines. Very good for statement coverage overall. 

**Cons of EclEmma**: Does not have any condition coverage, we would need other tools to get condition coverage.

**Screenshots - Data Utilities:**
![image](https://user-images.githubusercontent.com/73013959/156868469-e1f3d651-c3bb-4fc0-a507-cd212cfb1056.png)
![image](https://user-images.githubusercontent.com/73013959/156868472-1405e592-173a-4dc1-afb3-4ec4113ad688.png)
![image](https://user-images.githubusercontent.com/73013959/156868475-de1e8639-a3dc-4e16-903f-ffad7c09a1d8.png)

**Screenshots - Range:**

![image](https://user-images.githubusercontent.com/73013959/156868779-9949d156-a649-4b4a-b3c5-812350c33aef.png)
![image](https://user-images.githubusercontent.com/73013959/156868490-914279db-24ff-48dc-bf3f-f7a30d12fb64.png)


# 7 A comparison of the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

An advantage of requirements-based test generation is that we do not need to actually have the code implemented or to know it in order to develop our test cases. Instead, by knowing the specifications, the requirements, the method descriptions (what kind of input/output is expected) we can already develop the unit tests. It is good for all granularity levels. A disadvantage of it is that we cannot actually see when we provide a certain test case, which part of the code is being tested, that is what is being covered by our test. An advantage of coverage-based test generation is that it is easy to achieve and it provides important information related to how much of our code is covered with our test cases. It is good for relatively small parts of a system. A disadvantage of it is that coverage is different from correctness, so statement coverage does not guarantee bug-free software. 

# 8 A discussion on how the teamwork/effort was divided and managed

For the manual coverage calculations for calculateColumnTotal, we brainstormed to draw out the data flow then equally divided the reporting for the other sections. In the test suite development, we checked the coverage for both classes together then separated the work between Range and DataUtilities for peer coding. When finished, we then reviewed all the unit tests together to make sure that our coverage exceeded the minimum coverage requirements.

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Difficulties encountered: The setup is always a source of difficulty and stress in these labs, but on the code side, there were difficulties in searching for tests to be improved and understand them.

Challenges overcome: There were many challenges like setups and coordinating with team members that were overcome, in the technical side we overcame some difficulties in being successful in developing good and new tests.

Lessons learned: staying focused for a long period of time can be exhaustive, it's better to plan and dive into things ahead of time.

# 10 Comments/feedback on the lab itself

Interesting, in theory, difficult/confusing in practice, lectures don't really prepare us for the labs very well. TAs should also have a schedule for in-person demos so groups don't have to sit there waiting or have the option for demos to be conducted over Zoom. Setup for the lab took hours and hours, this really weighs on us and our schedule.

Overall, it was a well-written lab and we learned a lot about the differences between white box & black box testing.
