Save-Humanity - It's a problem from HackerRank
------

##### Check [Save Humanity problem](https://www.hackerrank.com/challenges/save-humanity/problem "Save Humanity") .

#### First steps

Clone this repository to your local machine and go to "<your_directory/bayer-task>" and run main file.

#### Explanation
The main challenge of the problem is the match method of strings.

After searching on the internet, I found a *naive bayes* approach, it was created based on the ability to conform to strings.

**How naive approach works:**
- n = size of "p" string;  
  m= size of "v" string;
- Iterate on a string p, after iterates on a substring of p and verifies if the match between them.

Finally, I have to suggest two improvements to be implemented:  

- Choose a language that has a faster performance than Java;  
- Use the KMP algorithm, because it has the complexity O(n) and that is more efficient;

   
