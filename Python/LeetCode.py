import itertools
import math

import roman
from typing import List
def subtractProductAndSum(self, n: int) -> int:
    sum=0
    m=1
    while n>0:
        x=n%10

        sum+=x
        m*=x

        n=n//10

    return m-sum



# print(subtractProductAndSum(None,234))
def reverseString(self, s: List[str]) -> None:
       f=0
       l=len(s)-1
       while(f<l):
           s[f],s[l]=s[l],s[f]

           f+=1
           l-=1
s = ["h", "e", "l", "l", "o"]
reverseString(None,s)
def reverseWords(self, s: str) -> str:
    l=s.split()
    return " ".join(l[::-1])

# print(reverseWords(None,"the sky     is blue"))
def fizzBuzz(self, n: int) -> List[str]:
    l=[]
    i=1
    while i<=n:
        if i%3==0  and i%5==0:
            l.append("FizzBuzz")
        elif i%3==0:
            l.append("Fizz")
        elif i%5==0:
            l.append("Buzz")
        else: l.append(str(i))
        i+=1
    return  l
def maximumWealth(self, accounts: List[List[int]]) -> int:
    m=0
    for i in accounts:
        m=max(m,sum(i))
    return m
# print(maximumWealth(None,[[1,2,3],[3,2,1]]))
def reverseVowels(self, s: str) -> str:
    vowels = "AEIOUaeiou"
    l = list(s)
    i, j = 0, len(s) - 1

    while i < j:
        if s[i] in vowels and s[j] in vowels:
            l[i], l[j] = s[j], s[i]
            i += 1
            j -= 1
        elif s[i] not in vowels:
            i += 1
        elif s[j] not in vowels:
            j -= 1

    return ''.join(l)
# print(reverseVowels(None,"hello"))
def isSubsequence(self, s: str, t: str) -> bool:
    o, p = 0, 0

    while o < len(s) and p < len(t):
        if s[o] == t[p]:
            o += 1
        p += 1

    return o == len(s)
# print(isSubsequence(None,"acb","ahbgdc"))
def isPalindrome(self, s: str) -> bool:
    s=s.lower()

    b=""
    for i in s:
        if i.isalnum():# a to z and 0-9
            b+=i


    return  b==b[::-1]
# print(isPalindrome(None,"0P"))
def moveZeroes(self, nums: List[int]) -> None:
            l=[]

            for i in nums:
                if i!=0:
                    l.append(i)

            o=len(nums)-len(l)
            l.extend([0]*o)
            for i in range(len(nums)):
                nums[i] = l[i]
            return nums
# print(moveZeroes(None,[0,1,0,3,12]))


def search(self, nums: List[int], target: int) -> int:
    try:
        return nums.index(target)
    except:
        return -1
# print(search(None, [-1, 0, 3, 5, 9, 12], 2))
def search(self, nums: List[int], target: int) -> int:
    s=0
    l=len(nums)-1

    while s<=l:
        m = (s + l) // 2
        if(nums[m]==target):
            return m
        elif(nums[m]>target):
            l=m-1
        else:
            s=m+1

    return -1



# print(search(None, [-1, 0, 3, 5, 9, 12], 2))


def findKthLargest(self, nums: List[int], k: int) -> int:
    nums.sort(reverse=True)
    if k <= 0 or k > len(nums):
        return None
    return nums[k - 1]

# print(findKthLargest(None,[1],1))


def romanToInt(self, s: str) -> int:
    return roman.fromRoman(s)


# print(romanToInt(None,"III"))

def removeStars(self, s: str) -> str:
    l = list(s)
    v=[]
    p=1

    for i in s:

        if i == '*':
            v.pop()
        else:
            v.append(i)

    return  ''.join(v)




# print(removeStars(None,"leet**cod*e"))

def findJudge(self, n: int, trust: List[List[int]]) -> int:
    x = [0] * (n + 1)
    y = [0] * (n + 1)

    for a, b in trust:
        y[a] += 1
        x[b] += 1
    print(x)
    print(y)
    for i in range(1, n + 1):
        if x[i] == n - 1 and y[i] == 0:

            return i

    return -1
# print(findJudge(None,3,[[1,3],[2,3]]))


def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
    # l=[]
    # # q = list(map(lambda i: i + extraCandies, candies))
    #
    # for i in range(len(candies)):
    #     candies[i]=candies[i]+extraCandies
    #
    #     if max(candies)==candies[i] :
    #         candies[i]=candies[i]-extraCandies
    #         l.append(True)
    #     else:
    #         candies[i] = candies[i] - extraCandies
    #         l.append(False)
    #
    #
    # return  l

        l=[]
# q = list(map(lambda i: i + extraCandies, candies))
        m=max(candies)
        for i in candies:
            if i+extraCandies>=m :
                l.append(True)
            else:
                l.append(False)
        return  l

# print(kidsWithCandies(None,[2,3,5,1,3],3))

def strStr(self, haystack: str, needle: str) -> int:
    try:
            return haystack.index(needle)
    except:
        return -1

# print(strStr(None,"sadbutsad","sad"))


def mySqrt(self, x: int) -> int:
    return int(math.sqrt(x))

# print(mySqrt(None,8))
def myPow(self, x: float, n: int) -> float:
    # return  math.pow(x,n)
    if n == 0:
        return 1
    elif n < 0:
        x = 1 / x
        n = -n
    r = 1
    while n > 0:
        if n % 2 == 1:
            r *= x
        x *= x
        n //= 2
    return r
# print(myPow(None,2.00000,10))
# print(myPow(None,2.00000,-2))
def largestNumber(self, nums: List[int]) -> str:
    if sum(nums)==0:
        return '0'
    nums=list(map(str,nums))
    nums.sort(key=lambda x: x*10 , reverse=True)
    return ''.join(nums)
# print(largestNumber(None,[10,2]))
# print(largestNumber(None,[3,30,34,5,9]))
# def isValid(self, s: str) -> bool:
def nextPermutation(self, nums: List[int]) -> None:
    k = len(nums) - 2
    while k >= 0 and nums[k] >= nums[k + 1]:
        k -= 1

    if k == -1:
        nums.reverse()
        return
    l = list(itertools.permutations(sorted(nums)))
    if l.index(tuple(nums)) == len(l) - 1:
        nums[:] = l[0]
        return nums



    nums[:] = reversed(l[l.index(tuple(nums)) + 1])
    return nums
reversed



# print(nextPermutation(None,[1,2,3]))


def evalRPN(self, tokens: List[str]) -> int:
    stack = []
    operators = {'+', '-', '*', '/'}
    for token in tokens:
        if token in operators:
            operand2 = stack.pop()
            operand1 = stack.pop()
            print(operand1)
            print(operand2)
            if token == '+':
                stack.append(operand1 + operand2)
            elif token == '-':
                stack.append(operand1 - operand2)
            elif token == '*':
                stack.append(operand1 * operand2)
            elif token == '/':
                stack.append(int(operand1 / operand2))
        else:stack.append(int(token))
    return stack.pop()

tokens = ["2", "1", "+", "3", "*"]
# print(evalRPN(None,tokens))


def is_valid(s):
    stack = []
    characters = {")": "(", "}": "{", "]": "["}
    for char in s:

        if char in characters.values():
            stack.append(char)
        elif char in characters.keys():
               if len(stack)==0 or characters[char] != stack.pop():
                return False
        else:
            return False

    return len(stack)==0
s = "(]"
print(is_valid(s))


def lengthOfLastWord(self, s: str) -> int:
   return len(s.strip().split(" ").pop())


print(lengthOfLastWord(None,"Hello World"))
def twoSum(self, nums: List[int], target: int) -> List[int]:
    num_indices = {}

    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_indices:
            return [num_indices[complement], i]
        num_indices[num] = i
    return []

print(twoSum(None,[3,2,4],6))


def rotate(self, matrix: List[List[int]]) -> None:
   matrix[:] = zip(*matrix[::-1])
   print(matrix)


rotate(None,[[1,2,3],[4,5,6],[7,8,9]])
def multiply(self, num1: str, num2: str) -> str:
    x=int(num1)
    y=int(num2)
    z=x*y
    return str(z)


def addStrings(self, num1: str, num2: str) -> str:
    x=int(num1)
    y=int(num2)
    z=x+y
    return str(z)


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
    if not root:
        return 0

    left_left=sumOfLeftLeaves(self,root.left)
    left_right=sumOfLeftLeaves(self,root.right)
    return left_left+left_right


print(sumOfLeftLeaves(None,[3,9,20,null,null,15,7]))

