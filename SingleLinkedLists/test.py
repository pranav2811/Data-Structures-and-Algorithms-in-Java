t = int(input())

for i in range(t):
    n = int(input())
    y = list(map(int, input().split()))
    even_count = y.count(1)
    odd_count = n - even_count
    
    if odd_count % 2 == 0:
        print("YES")
    else:
        print("NO")
