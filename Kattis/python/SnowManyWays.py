u = int(input())

N = int(u ** 0.5) + 1

def spf_sieve(n):
    spf = list(range(2, n+1))
    for p in range(2, int(n ** 0.5) + 1):
        if spf[p] == p:
            for m in range(p, N+1, p):
                if spf[m] == m:
                    spf[m] = p

    return spf

SPF = spf_sieve(int(u ** 0.5))
#SPF = spf_sieve(u)

total = 0
while u != 1:
    attempt = u
    for i in range(len(SPF)):
        if attempt % SPF[i] == 0:
            attempt = SPF[i]
            break

    total += u / attempt
    u /= attempt

print(int(total))