data_store = dict()

def solution(n):
    n = int(n)
    count = 0
    while n > 1:
        if n % 2 == 0:      # bitmask *0
            n = n // 2
        elif n == 3 or n % 4 == 1:      # bitmask 01
            n -= 1
        else:                   # bitmask 11
            n += 1
        count += 1
    print(count)

solution('4')
