What is Algorithm complexity? 
How do we know if code is good enough or not? 
What parameters do we consider? 
Well, an algorithm is measured based on time and space complexity. The better the algorithm, the lesser time and space complexity it will encounter!

Let's take an example: Linear Search has a complexity of N, while Binary Search has a complexity of LogN. So, when an input of Size 10^4 shows up, it will take 13.22 time complexity for the binary search algorithm, whereas it will take 10^4 time complexity for the linear search algorithm. 

Now you can see why time complexity is so important!

What is used to represent the complexity of Algorithms? 
Asymptotic notation is something like standard notation that we can use to represent algorithm notation. Asymptotic is approaching a number or value, and since we can't represent our program complexity in exact numbers, we use asymptotic notation.

Big Oh Notation: At most, it will have X time complexity (upper bound).
Big Omega Notation: At least, it will have X time complexity (lower bound).
Big Theta Notation: It is the average case, something in between the upper and lower bounds.

What is time complexity? 
Well, in simple words, it is the rate of increase in time with an increase in the size of input. It has no significance with the time you and I know; the same code on two different machines might end up taking different times. That is why we represent them in terms of Asymptotic notation.

Rules for analyzing time complexity:

Always look for worst-case complexity.
Ignore the constants.
Ignore the smaller complexity.
We will always use Big Oh notation because it represents the upper bound or worst-case scenarios. Examples explained in the lecture.

In general, OuterLoop * InnerLoop is used for analysis.

If input is divided, we take log:
If the input is divided by 2, then log base 2.
If the input is divided by 3, then log base 3.

What is Space Complexity? It is Input + Auxiliary space. Auxiliary space is the space taken by your algorithm. You should avoid using unnecessary extra auxiliary space. A very important point here is that please do not tamper with the input unless it is given in the question. Just in case you have tampered with the input, make sure you convert it back to the original one before ending your logic, but avoid this otherwise you will be rejected in the interview.

The Big O cheatsheet by Eric is available at https://www.bigocheatsheet.com/.