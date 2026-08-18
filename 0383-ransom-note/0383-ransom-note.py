class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        count = [0]*26
        used = [0]*26
        for c in magazine:
            count[ord(c)-ord('a')] +=1
        for c in ransomNote:
            index = ord(c)-ord('a')
            if count[index] == 0:
                return False           
            used[index] = 1
            count[index] -= 1
        return True