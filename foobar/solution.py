N = 10010
def sieve():
    primes = [True] * N
    primes[0] = False
    primes[1] = False
    for i in range(2, N):
        if primes[i]:
            for j in range(i * i, N, i):
                primes[j] = False
    primes_str = ""
    for i in primes: 
        if primes[i]:
            primes_str += str(i)
    return primes_str

def solution(n):
    primes_str = sieve()
    print(primes_str[n:n+5])
