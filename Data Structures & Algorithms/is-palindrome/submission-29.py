class Solution:
    def isPalindrome(self, s: str) -> bool:
        n = len(s)
        conca_s = ""
        for i in range(n):
            char = s[i]
            ascii_a = ord('a')
            ascii_z = ord('z')

            ascii_0 = ord('0')
            ascii_9 = ord('9')

            ascii_A = ord('A')
            ascii_Z = ord('Z')

            ascii_char = ord(char)

            isNotUperCase = ascii_char < ascii_A or ascii_char > ascii_Z
            isNotLowerCase = ascii_char < ascii_a or ascii_char > ascii_z
            isNotNumber = ascii_char < ascii_0 or ascii_char > ascii_9

            if isNotUperCase and isNotLowerCase and isNotNumber :
                pass
            else:
                conca_s += char.lower()
        start = 0
        end = len(conca_s) - 1
        print(conca_s)
        while start <= end:
            if conca_s[start] != conca_s[end]:
                return False
            start +=1
            end -=1
        return True