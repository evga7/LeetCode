a=["" for _ in range(10)]
a[2]="abc"
a[3]="def"
a[4]="ghi"
a[5]="jkl"
a[6]="mno"
a[7]="pqrs"
a[8]="tuv"
a[9]="wxyz"
v=[]
def go(idx,digit,s):
    if idx==len(digit):
        global v
        if s:
            v.append(s)
        return
    global a
    idx3=int(digit[idx])
    pos=a[idx3]
    for j in range(len(pos)):
        go(idx+1,digit,s+pos[j])
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        global v
        v=[]
        go(0,digits,"")
        return v


        